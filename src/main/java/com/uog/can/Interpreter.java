package com.uog.can;

import com.uog.can.antlr4.out.CANBaseListener;
import com.uog.can.antlr4.out.CANParser;

import java.util.*;

public class Interpreter extends CANBaseListener {
    // 用于交换变量
    private List<String> atoms = new ArrayList<>();
    // 存储所有的belief

    // private Map<String, Boolean> beliefs = new HashMap<>();

    private List<String> beliefs = new ArrayList<>(); // to-do: 用一个map存储所有的list，key为belief的name，value为boolean
    // 存储所有的event
    private List<String> events = new ArrayList<>();
    // 存储所有的plan的name
    private List<String> plans = new ArrayList<>();
    // 存储所有的action的name
    private List<String> actions = new ArrayList<>();
    // 存储所有的plan和action的前提条件，key是plan或action的name，value是条件beliefs
    private Map<String, List> preCon = new HashMap<>();
    // 存储所有的planBody中的program，key为plan的name，value为所有的program，如果遇到goal，就设置一个goal的名字。
    private Map<String, List> planBody = new HashMap<>();
    // 存储所有的goal, key是goal的名字，List是goal的三个atom
    private Map<String, List> goals = new HashMap<>();
    // 存储所有的action中的加变量和减变量操作
    Map<String, List> addBelief = new HashMap<>();
    Map<String, List> deleteBelief = new HashMap<>();
    int goalCount = 0;
    // 当前正在遍历的plan或action的name
    String current;
    // 存储共有多少行代码
    int line = 0;

    /*
     * 遍历atom节点，返回atom的名字
     * */
    @Override
    public void exitAtomName(CANParser.AtomNameContext ctx) {
        atoms.add(ctx.NAME().getText());
    }

    /*
    * 将遍历到的atoms存到beliefs
    * */
    @Override
    public void exitInitBelief(CANParser.InitBeliefContext ctx) {
        beliefs.addAll(atoms);
        atoms.clear();
    }

    @Override
    public void exitNegation(CANParser.NegationContext ctx) {
        if(ctx.op.getType() == CANParser.NEGATION)
        {
            String atom = atoms.get(atoms.size() - 1);
            atoms.set((atoms.size() - 1), ("!" + atom));
        }
    }

    @Override
    public void exitExternalEvent(CANParser.ExternalEventContext ctx) {
        events.addAll(atoms);
        atoms.clear();
    }

    @Override
    public void enterPlan(CANParser.PlanContext ctx) {
        String planName = ctx.atom().getText();
        plans.add(planName);
        current = planName;
    }

    @Override
    public void exitPlanBody(CANParser.PlanBodyContext ctx) {
        List<String> body = new ArrayList<>();

        body.addAll(atoms);

        planBody.put(current, body);

        atoms.clear();
    }

    @Override
    public void exitGoal(CANParser.GoalContext ctx) {

        goalCount++;

        String goalName = "goal" + goalCount;

        List<String> goalAtom = new ArrayList<>();

        for(int i = atoms.size() - 3 ; i < atoms.size() ; i++ ){
            goalAtom.add(atoms.get(i));
        }

        for (int i = 0 ; i < 3 ; i++){
            atoms.remove(atoms.size() - 1);
        }

        goals.put(goalName, goalAtom);

        atoms.add(goalName);
    }

    @Override
    public void enterAction(CANParser.ActionContext ctx) {
        String actionName = ctx.atom().getText();
        actions.add(actionName);
        current = actionName;
    }

    @Override
    public void enterPreCondition(CANParser.PreConditionContext ctx) {
        atoms.clear();
    }

    @Override
    public void exitBool(CANParser.BoolContext ctx) {

        if (ctx.getText().equals("true")) {
            atoms.add("true");
        } else if (ctx.getText().equals("false"))
        {
            atoms.add("false");
        }
    }

    @Override
    public void exitLogicBeliefs(CANParser.LogicBeliefsContext ctx) {

        if (ctx.op.getType() == CANParser.AND) {
            atoms.add(atoms.size() - 1, "&");
        } else if (ctx.op.getType() == CANParser.OR) {
            atoms.add(atoms.size() - 1, "|");
        }

        System.out.println(atoms);

    }

    @Override
    public void exitPreCondition(CANParser.PreConditionContext ctx) {
        List<String> conBelief = new ArrayList<>();

        conBelief.addAll(atoms);
        preCon.put(current, conBelief);

        atoms.clear();
    }

    @Override
    public void exitAddBelief(CANParser.AddBeliefContext ctx) {

        List<String> add = new ArrayList<>();

        add.addAll(atoms);
        addBelief.put(current, add);

        atoms.clear();
    }

    /*
    * 进入节点前先清空atoms
    * 否认当前action的name也会被存储
    * */
    @Override
    public void exitDeleteBelief(CANParser.DeleteBeliefContext ctx) {
        String current = actions.get((actions.size() - 1));
        List<String> delete = new ArrayList<>();

        delete.addAll(atoms);
        deleteBelief.put(current, delete);

        atoms.clear();
    }

    /*
     * 会遍历很多次
     * */

    @Override
    public void exitExpression(CANParser.ExpressionContext ctx) {
        line++;
    }

    /*
    * 获取所有的数据后执行结果
    * */
    @Override
    public void exitC_text(CANParser.C_textContext ctx) {

        System.out.println("belief" + beliefs);
        System.out.println("event" + events);
        System.out.println("plans" + plans);
        System.out.println("planBody" + planBody);
        System.out.println("goal" + goals);
        System.out.println("actions" + actions);
        System.out.println("preCon" + preCon);

        for (String event : events){
            execute(event);
        }

        System.out.println("belief" + beliefs);

    }

    /*
    * 获得所有的数据后，进行执行
    * */
    private void execute(String event){

        System.out.println("executing " + event);

        if(preCondition(event)){
            if (plans.contains(event)){
                System.out.println("executing plan " + event);
                List<String> programs = new ArrayList<>();
                programs.addAll(planBody.get(event));

                for (String program : programs){
                    if (goals.containsKey(program)){
                        System.out.println("executing " + program);
                        executeGoal(program);
                    } else {
                        execute(program);
                    }
                }

            } else if (actions.contains(event)) {

                System.out.println("executing action " + event);

                List<String> add = addBelief.get(event);
                List<String> delete = deleteBelief.get(event);

                // 将要添加的belief原子添加到belief列表中
                for(String addAtom : add) {
                    if (addAtom.contains("!")){
                        beliefs.remove(addAtom.substring(1, addAtom.length()));
                    } else if (!addAtom.contains("!")){
                        beliefs.remove("!" + addAtom);
                    }
                    beliefs.add(addAtom);
                }

                // 删除相应的beliefs原子
                beliefs.removeAll(delete);

                /*for(String deAtom : delete) {
                    if (deAtom.contains("!")){
                        beliefs.remove(deAtom.substring(1, deAtom.length()));
                    } else if (!deAtom.contains("!")){
                        beliefs.remove("!" + deAtom);
                    }
                    beliefs.remove(deAtom);
                }*/
            }
        }

    }

    /*
    * 所有plan和action的前置条件检查
    * */
    private boolean preCondition(String event){
        System.out.println("checking "+ event +"'s pre condition");
        // 存储preCon
        List<String> condition = new ArrayList<>();
        condition.addAll(preCon.get(event));

        boolean flag = true;

        // 检查是否满足preCon
        // condition.toString()输出的不是"true", 而是"[true]"
        if (condition.toString().equals("[true]")) {
            // 不做任何更改
        } else if(condition.toString().equals("[false]")){
            flag = false;
        } else if (condition.size() == 1) {
            if (!beliefs.contains(condition)){
                flag = false;
            }
        } else if(condition.size() > 1){
            String con1 = condition.get(0);
            String op, con2;

            // 先计算第一个条件的真假，并存储在result中
            if (beliefs.contains(con1)) {
                flag = true;
            } else {
                flag = false;
            }
            // 循环与后面的原子进行对比
            for(int i = 2 ; i < condition.size(); i++){
                op = condition.get(i - 1);
                con2 = condition.get(i);
                if (op.equals("&")){
                    if(flag && beliefs.contains(con2)) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                } else if (op.equals("|")){
                    if(beliefs.contains(con1) || beliefs.contains(con2)) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
        }

        return flag;
    }

    /*private boolean preCondition(String event){
        System.out.println("checking "+ event +"'s pre condition");
        // 存储preCon
        List<String> condition = new ArrayList<>();
        condition.addAll(preCon.get(event));

        boolean flag = true;

        // 检查是否满足preCon
        // condition.toString()输出的不是"true", 而是"[true]"
        if (condition.toString().equals("[true]")) {
            // 不做任何更改
        } else if(condition.toString().equals("[false]")){
            flag = false;
        } else if (!beliefs.containsAll(condition)){
            flag = false;
        }

        return flag;
    }*/

    /*
    * 执行goal
    * */
    private void executeGoal (String goalName){

        System.out.println("executing goal " + goalName);

        List<String> goal = new ArrayList<>();

        goal.addAll(goals.get(goalName));

        while (true){
            // 检查goal的第三个元素是true还是false
            // 如果是false就执行
            // 如果是true就失败
            if (!goalCondition(goal.get(2))){
                execute(goal.get(1));
            }

            // 执行完语句后检查是否成功
            // 即goal的目标是否包含在了belief里
            // 如果包含的话就说明执行成功，打破循环
            // 如果没有包含的话就说明执行失败，循环重试
            if (beliefs.contains(goal.get(0))){
                break;
            }
        }
    }

    /*
    * 检查goal的条件
    * */
    private boolean goalCondition(String atom3) {

        System.out.println("checking goal's condition");


        if (atom3.equals("[true]")) {
            return true;
        } else if(atom3.equals("[false]")){
            return false;
        } else {

            if (beliefs.contains(atom3)){
                return true;
            }else{
                return false;
            }

        }
    }
}
