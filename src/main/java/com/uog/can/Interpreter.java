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
    List<String> atoms = new ArrayList<>();
    // 存储所有的belief
    List<String> beliefs = new ArrayList<>();
    // 存储所有的event
    List<String> events = new ArrayList<>();
    // 存储所有的plan的name
    List<String> plans = new ArrayList<>();
    // 存储所有的action的name
    List<String> actions = new ArrayList<>();
    // 存储所有的plan和action的前提条件
    Map<String, List> preCon = new HashMap<>();
    Map<String, List> op = new HashMap<>();

    Map<String, List> goal = new HashMap<>();

    // 存储所有的action中的加变量和减变量操作
    Map<String, List> addBelief = new HashMap<>();
    Map<String, List> deleteBelief = new HashMap<>();

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
    public void exitCondition(CANParser.ConditionContext ctx) {
        String current = atoms.get(0);
        atoms.remove(0);

        List<String> conBelief = new ArrayList<>();

        conBelief.addAll(atoms);
        preCon.put(current, conBelief);

        atoms.clear();
    }

    @Override
    public void exitBool(CANParser.BoolContext ctx) {

        String current = atoms.get(0);

        List<String> bool = new ArrayList<>();
        if (ctx.getText().equals("true")) {
            bool.add("true");
            preCon.put(current, bool);
        } else if (ctx.getText().equals("false"))
        {
            bool.add("false");
            preCon.put(current, bool);
        }

        atoms.clear();
    }

    @Override
    public void enterPlan(CANParser.PlanContext ctx) {
        String planName = ctx.atom().getText();
        plans.add(planName);
    }

    @Override
    public void exitPlanBody(CANParser.PlanBodyContext ctx) {



        atoms.clear();
    }

    @Override
    public void exitGoal(CANParser.GoalContext ctx) {

    }

    @Override
    public void enterAction(CANParser.ActionContext ctx) {
        String actionName = ctx.atom().getText();
        actions.add(actionName);
        System.out.println(actions);
    }

    @Override
    public void exitAddBelief(CANParser.AddBeliefContext ctx) {
        String current = actions.get((actions.size() - 1));

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
     * 输出结果
     * */
    @Override
    public void exitPrintExpr(CANParser.PrintExprContext ctx) {
        System.out.println(beliefs);
        System.out.println(events);
        System.out.println(plans);
        System.out.println(actions);
        System.out.println(preCon);
        System.out.println(addBelief);
        System.out.println(deleteBelief);
    }

}
