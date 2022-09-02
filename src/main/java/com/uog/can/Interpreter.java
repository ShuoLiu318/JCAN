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
    // 存储所有的goal, key是goal的名字，List是goal的第一个atom列表
    private Map<String, List> goals = new HashMap<>();
    // 存储所有的goal的行为，key为goal的名字，value是goal为了达成目标要运行的程序
    private Map<String, List> goalProgram = new HashMap<>();
    // 存储所有的goal的条件，key为goal的名字，value是goal的condition
    private Map<String, List> goalCon = new HashMap<>();
    // 存储所有的action中的加变量和减变量操作
    private Map<String, List> addBelief = new HashMap<>();
    private Map<String, List> deleteBelief = new HashMap<>();

    int goalCount = 0;
    // 当前正在遍历的plan或action的name
    String current;
    String goalName;
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
    public void exitPlanbody(CANParser.PlanbodyContext ctx) {

        List<String> pb = new ArrayList<>();

        pb.addAll(atoms);

        planBody.put(current, pb);

        atoms.clear();

        // System.out.println("planBody" + planBody);
    }

    @Override
    public void exitGoal(CANParser.GoalContext ctx) {
        atoms.add(goalName);
    }

    @Override
    public void exitDeclarativeGoals(CANParser.DeclarativeGoalsContext ctx) {

        goalCount++;

        goalName = "goal" + goalCount;

        List<String> g = new ArrayList<>();

        for(int i = 0 ; i < ctx.atom().getChildCount(); i++){
            g.add(atoms.get(atoms.size() - 1));
            atoms.remove(atoms.size() - 1);
        }

        Collections.reverse(g);

        goals.put(goalName, g);

        // System.out.println(goals);
    }

    @Override
    public void exitGoalProgram(CANParser.GoalProgramContext ctx) {
        List<String> program = new ArrayList<>();

        // System.out.println(atoms);

        for(int i = 0 ; i < ctx.atom().getChildCount(); i++){
            program.add(atoms.get(atoms.size() - 1));
            atoms.remove(atoms.size() - 1);
        }

        Collections.reverse(program);

        goalProgram.put(goalName, program);

        // System.out.println(goalProgram);
    }

    @Override
    public void exitGoalCon(CANParser.GoalConContext ctx) {

        List<String> con = new ArrayList<>();

        // System.out.println(atoms);

        for(int i = 0 ; i < ctx.atom().getChildCount(); i++){
            con.add(atoms.get(atoms.size() - 1));
            atoms.remove(atoms.size() - 1);
        }

        Collections.reverse(con);

        goalCon.put(goalName, con);

        // System.out.println(goalCon);
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

        /*System.out.println("belief" + beliefs);
        System.out.println("event" + events);
        System.out.println("plans" + plans);
        System.out.println("planBody" + planBody);
        System.out.println("goal" + goals);
        System.out.println("actions" + actions);
        System.out.println("preCon" + preCon);*/

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


        System.out.println(check(condition));
        return check(condition);
    }

    /*
    * 执行goal
    * */
    private boolean executeGoal (String goalName){

        System.out.println("executing goal: " + goalName);

        List<String> goal = new ArrayList<>();
        List<String> programs = new ArrayList<>();
        List<String> con = new ArrayList<>();

        goal.addAll(goals.get(goalName));
        programs.addAll(goalProgram.get(goalName));
        con.addAll(goalCon.get(goalName));

        if (!check(con)) {
            for (int i = 0; i< programs.size();i++) {

                execute(programs.get(i));
            }

            if (check(goal)) {
                return true;
            } else {
                return  false;
            }
        } else {
            return false;
        }
    }


    private boolean check(List<String> atoms) {
        boolean flag = true;
        // 检查是否满足preCon
        // condition.toString()输出的不是"true", 而是"[true]"
        if (atoms.toString().equals("[true]")) {
            // 不做任何更改
        } else if(atoms.toString().equals("[false]")){
            flag = false;
        } else if (atoms.size() == 1) {
            if (!beliefs.contains(atoms)){
                flag = false;
            }
        } else if(atoms.size() > 1){
            String con1 = atoms.get(0);
            String op, con2;
            // 先计算第一个条件的真假，并存储在flag中
            if (beliefs.contains(con1)) {
                flag = true;
            } else {
                flag = false;
            }
            // 循环与后面的原子进行对比
            for(int i = 2 ; i < atoms.size(); i++){
                op = atoms.get(i - 1);
                con2 = atoms.get(i);
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



}
