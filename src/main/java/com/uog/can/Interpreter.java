package com.uog.can;

import com.uog.can.antlr4.out.CANBaseListener;
import com.uog.can.antlr4.out.CANParser;

import java.util.*;

public class Interpreter extends CANBaseListener {
    // medium list
    private List<String> atoms = new ArrayList<>();
    // for the storage of beliefs
    private List<String> beliefs = new ArrayList<>();
    // for the storage of external events
    private List<String> events = new ArrayList<>();
    // for the storage of all names of plan
    private List<String> plans = new ArrayList<>();
    // for the storage of all names of action
    private List<String> actions = new ArrayList<>();
    // for the storage of all precondition of plan or action
    // key: name of plan or action，value: precondition belief atoms
    private Map<String, List> preCon = new HashMap<>();
    // for the storage of all programs of planBody
    // key: the name of plan，value: the name of programs
    private Map<String, List> planBody = new HashMap<>();
    // for the storage of the declarative of a goal
    // key: the name of goal, value: declarative goals
    private Map<String, List> goals = new HashMap<>();
    // for the storage of all programs of a goal
    // key: the name of goal, value: programs
    private Map<String, List> goalProgram = new HashMap<>();
    // for the storage of conditions of goal
    // key: the name of goal, value: the conditions
    private Map<String, List> goalCon = new HashMap<>();
    // for the storage of added and deleted belief list of actions
    // key: the name of action, value: the added and deleted belief list
    private Map<String, List> addBelief = new HashMap<>();
    private Map<String, List> deleteBelief = new HashMap<>();
    // the name of goal
    int goalCount = 0;
    // the name of the plan or action that is traversing
    String current;
    // the name of the goal
    String goalName;
    // 存储共有多少行代码
    int line = 0;
    /*
     * return the name of atoms
     * */
    @Override
    public void exitAtomName(CANParser.AtomNameContext ctx) {
        atoms.add(ctx.NAME().getText());
    }
    /*
     * storage all the name of atoms as beliefs
     * clear the media list atoms
     * */
    @Override
    public void exitInitBelief(CANParser.InitBeliefContext ctx) {
        beliefs.addAll(atoms);
        atoms.clear();
    }
    /*
     * when traversing the Negation node
     * add a symbol '!' in front of the name of atom
     * */
    @Override
    public void exitNegation(CANParser.NegationContext ctx) {
        String atom = atoms.get(atoms.size() - 1);
        atoms.set((atoms.size() - 1), ("!" + atom));
    }
    /*
     * traversing the external event node
     * */
    @Override
    public void exitExternalEvent(CANParser.ExternalEventContext ctx) {
        events.addAll(atoms);
        atoms.clear();
    }
    /*
     * when traversing the plan node
     * get the name of plan and add it to the list plans
     * set the current as planName
     * */
    @Override
    public void enterPlan(CANParser.PlanContext ctx) {
        String planName = ctx.atom().getText();
        plans.add(planName);
        current = planName;
    }
    /*
     * when exiting the node of planBody
     * store all the programs in the map planBody
     * */
    @Override
    public void exitPlanbody(CANParser.PlanbodyContext ctx) {
        List<String> pb = new ArrayList<>();
        pb.addAll(atoms);
        planBody.put(current, pb);
        atoms.clear();
    }
    /*
     * when exiting the goal node
     * add the name of goal in media list atoms to
     * */
    @Override
    public void exitGoal(CANParser.GoalContext ctx) {
        atoms.add(goalName);
    }
    /*
     * when exiting the declarative goal node
     * first get the name of goal, and based on the count of child node, getting the data and store it
     * lastly remove the data
     * */
    @Override
    public void exitDeclarativeGoals(CANParser.DeclarativeGoalsContext ctx) {
        goalCount++;
        goalName = "goal" + goalCount;
        List<String> g = new ArrayList<>();
        for(int i = 0 ; i < ctx.atom().getChildCount(); i++){
            g.add(atoms.get(atoms.size() - 1));
            atoms.remove(atoms.size() - 1);
        }
        // reverse the list g, because the order is reversed
        Collections.reverse(g);
        goals.put(goalName, g);
    }
    /*
     *  traversing the goal program
     * */
    @Override
    public void exitGoalProgram(CANParser.GoalProgramContext ctx) {
        List<String> program = new ArrayList<>();
        for(int i = 0 ; i < ctx.atom().getChildCount(); i++){
            program.add(atoms.get(atoms.size() - 1));
            atoms.remove(atoms.size() - 1);
        }
        Collections.reverse(program);
        goalProgram.put(goalName, program);
    }
    /*
     * traversing the goal condition
     * */
    @Override
    public void exitGoalCon(CANParser.GoalConContext ctx) {
        List<String> con = new ArrayList<>();
        for(int i = 0 ; i < ctx.atom().getChildCount(); i++){
            con.add(atoms.get(atoms.size() - 1));
            atoms.remove(atoms.size() - 1);
        }
        Collections.reverse(con);
        goalCon.put(goalName, con);
    }
    /*
     * when enter action node, first get the action name and set the current as it
     * */
    @Override
    public void enterAction(CANParser.ActionContext ctx) {
        String actionName = ctx.atom().getText();
        actions.add(actionName);
        current = actionName;
    }
    /*
     * clearing the list atoms before entering the node preCondition
     * because it stores the name of action or plan when entering it
     * */
    @Override
    public void enterPreCondition(CANParser.PreConditionContext ctx) {
        atoms.clear();
    }
    /*
     * when traversing the node of bool
     * converting it to text and compare with the string "true" or "false"
     * then store it
     * */
    @Override
    public void exitBool(CANParser.BoolContext ctx) {
        if (ctx.getText().equals("true")) {
            atoms.add("true");
        } else if (ctx.getText().equals("false"))
        {   atoms.add("false"); }
    }
    /*
     * compare the type of operation and store it in the list
     * */
    @Override
    public void exitLogicBeliefs(CANParser.LogicBeliefsContext ctx) {
        if (ctx.op.getType() == CANParser.AND) {
            atoms.add(atoms.size() - 1, "&");
        } else if (ctx.op.getType() == CANParser.OR) {
            atoms.add(atoms.size() - 1, "|");   }

    }
    /*
     * when exiting preCondition
     * store all the data in the list preCon and clear list atoms
     * */
    @Override
    public void exitPreCondition(CANParser.PreConditionContext ctx) {
        List<String> conBelief = new ArrayList<>();
        conBelief.addAll(atoms);
        preCon.put(current, conBelief);
        atoms.clear();
    }
    /*
     * node addBelief and DeleteBelief
     * */
    @Override
    public void exitAddBelief(CANParser.AddBeliefContext ctx) {
        List<String> add = new ArrayList<>();
        add.addAll(atoms);
        addBelief.put(current, add);
        atoms.clear();
    }
    @Override
    public void exitDeleteBelief(CANParser.DeleteBeliefContext ctx) {
        String current = actions.get((actions.size() - 1));
        List<String> delete = new ArrayList<>();
        delete.addAll(atoms);
        deleteBelief.put(current, delete);
        atoms.clear();
    }
    @Override
    public void exitExpression(CANParser.ExpressionContext ctx) {
        line++;
    }
    /*
     * execute the program when exiting the node c_text
     * */
    @Override
    public void exitC_text(CANParser.C_textContext ctx) {
        for (String event : events){
            execute(event);
        }
        // output the belief list after execution
        System.out.println("belief" + beliefs);
    }
    private void execute(String event){
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
                // add the beliefs in belief list
                for(String addAtom : add) {
                    // check if there is the opposite form of beliefs in current belief list
                    if (addAtom.contains("!")){
                        beliefs.remove(addAtom.substring(1, addAtom.length()));
                    } else if (!addAtom.contains("!")){
                        beliefs.remove("!" + addAtom);
                    }
                    beliefs.add(addAtom);
                }
                // delete beliefs in deleteBelief
                beliefs.removeAll(delete);
            }
        }
    }
    /*
     * check if the preconditions are met
     * */
    private boolean preCondition(String event){
        System.out.println("checking "+ event +"'s pre condition");
        // for the storage of preCondition
        List<String> condition = new ArrayList<>();
        condition.addAll(preCon.get(event));
        return check(condition);
    }
    /*
     * execute goal
     * */
    private boolean executeGoal (String goalName){
        List<String> goal = new ArrayList<>();
        List<String> programs = new ArrayList<>();
        List<String> con = new ArrayList<>();

        goal.addAll(goals.get(goalName));
        programs.addAll(goalProgram.get(goalName));
        con.addAll(goalCon.get(goalName));

        boolean result = false;

        while(true){
            if (!check(con)) {
                for (int i = 0; i< programs.size();i++) {
                    execute(programs.get(i));
                }
                if (check(goal)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
    private boolean check(List<String> atoms) {
        boolean flag = true;
        // the output of condition.toString() is "[true]" instead of "true"
        if (atoms.toString().equals("[true]")) {
            // nothing to do
        } else if(atoms.toString().equals("[false]")){
            flag = false;
        } else if (atoms.size() == 1) {
            if (!beliefs.contains(atoms)){
                flag = false;
            }
        } else if(atoms.size() > 1){
            String con1 = atoms.get(0);
            String op, con2;
            // confirm the result for the first belief of conditions and store it in flag
            if (beliefs.contains(con1)) {
                flag = true;
            } else {
                flag = false;
            }
            // Loop through the logic with the truth of each belief until the last one
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
