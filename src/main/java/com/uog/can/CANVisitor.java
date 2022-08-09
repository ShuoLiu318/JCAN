package com.uog.can;

import com.uog.can.antlr4.out.CANBaseVisitor;
import com.uog.can.antlr4.out.CANParser;

import java.util.HashMap;
import java.util.Map;

public class CANVisitor extends CANBaseVisitor<String>{
    private final Map<String, String> memory = new HashMap<>();

    @Override
    public String visitExpr(CANParser.ExprContext ctx) {


        return super.visitExpr(ctx);
    }

    @Override
    public String visitAtom(CANParser.AtomContext ctx) {

        return super.visitAtom(ctx);
    }

    @Override
    public String visitInitBelief(CANParser.InitBeliefContext ctx) {
        return super.visitInitBelief(ctx);
    }

    @Override
    public String visitBelief(CANParser.BeliefContext ctx) {
        return super.visitBelief(ctx);
    }

    @Override
    public String visitBeliefList(CANParser.BeliefListContext ctx) {
        return super.visitBeliefList(ctx);
    }

    @Override
    public String visitExternalEvent(CANParser.ExternalEventContext ctx) {
        return super.visitExternalEvent(ctx);
    }

    @Override
    public String visitEvent(CANParser.EventContext ctx) {
        return super.visitEvent(ctx);
    }

    @Override
    public String visitEventList(CANParser.EventListContext ctx) {
        return super.visitEventList(ctx);
    }

    @Override
    public String visitPlan(CANParser.PlanContext ctx) {
        return super.visitPlan(ctx);
    }

    @Override
    public String visitGoal(CANParser.GoalContext ctx) {
        return super.visitGoal(ctx);
    }

    @Override
    public String visitGoalList(CANParser.GoalListContext ctx) {
        return super.visitGoalList(ctx);
    }

    @Override
    public String visitAction(CANParser.ActionContext ctx) {
        return super.visitAction(ctx);
    }

    @Override
    public String visitOperator(CANParser.OperatorContext ctx) {
        return super.visitOperator(ctx);
    }
}
