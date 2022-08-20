package com.uog.can;

import com.sun.org.apache.bcel.internal.generic.LSTORE;
import com.uog.can.antlr4.out.CANBaseListener;
import com.uog.can.antlr4.out.CANParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import sun.security.util.Length;

import java.util.*;

public class Interpreter extends CANBaseListener {

    // 用于交换变量
    private List<String> atoms = new ArrayList<>();
    // 存储所有的belief
    private List<String> beliefs = new ArrayList<>();
    // 存储所有的event
    private List<String> events = new ArrayList<>();
    // 存储所有的plan的name
    private List<String> plans = new ArrayList<>();
    // 存储所有的action的name
    private List<String> actions = new ArrayList<>();
    // 存储所有的plan和action的前提条件
    private Map<String, List> preCon = new HashMap<>();
    private Map<String, List> op = new HashMap<>();

    private Map<String, List> planBody = new HashMap<>();

    // 存储所有planBody中的goal，key为plan的name，list为goal的名字
    private Map<String, List> goals = new HashMap<>();

    // 存储所有的goal, key是goal的名字，List是goal的三个atom
    private Map<String, List> goal = new HashMap<>();

    // 存储所有的action中的加变量和减变量操作
    Map<String, List> addBelief = new HashMap<>();
    Map<String, List> deleteBelief = new HashMap<>();

    // 当前正在遍历的plan或action的name
    String current = new String();

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

        preCon.put(current, body); // to-do: 如何存储planBody

        atoms.clear();
    }

    @Override
    public void exitGoal(CANParser.GoalContext ctx) {

    }

    @Override
    public void enterAction(CANParser.ActionContext ctx) {
        String actionName = ctx.atom().getText();
        actions.add(actionName);
        current = actionName;
    }

    @Override
    public void enterCondition(CANParser.ConditionContext ctx) {
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
    public void exitCondition(CANParser.ConditionContext ctx) {

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
    public void exitPrintExpr(CANParser.PrintExprContext ctx) {
    }

    /*
    * 获取所有的数据后执行结果
    * */
    @Override
    public void exitC_text(CANParser.C_textContext ctx) {

        System.out.println("belief" + beliefs);
        System.out.println("event" + events);
        System.out.println("plans" + plans);
        System.out.println("actions" + actions);
        System.out.println("preCon" + preCon);

        for(;;){

        }


    }
}
