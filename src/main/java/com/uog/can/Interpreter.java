package com.uog.can;

import com.uog.can.antlr4.out.CANBaseVisitor;
import com.uog.can.antlr4.out.CANParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Interpreter extends CANBaseVisitor<String> {

    ArrayList<String> beliefs = new ArrayList<>();
    ArrayList<String> externalEvents = new ArrayList<>();
    ArrayList<String> internalEvents = new ArrayList<>();

    Interpreter interpreter = new Interpreter();

    @Override
    public String visitC_text(CANParser.C_textContext ctx) {
        return super.visitC_text(ctx);
    }

    @Override
    public String visitPrintExpr(CANParser.PrintExprContext ctx) {

        if (ctx.)

        return ;
    }

    @Override
    public String visitInitBelief(CANParser.InitBeliefContext ctx) {
        if(ctx.type.getType() == CANParser.BELIEFS)
        {
             String[] beliefs = visit(ctx.);
        }

        return super.visitInitBelief(ctx);
    }

    @Override
    public String visitExternalEvent(CANParser.ExternalEventContext ctx) {
        return super.visitExternalEvent(ctx);
    }

    @Override
    public String visitPlan(CANParser.PlanContext ctx) {
        return super.visitPlan(ctx);
    }

    @Override
    public String visitAct(CANParser.ActContext ctx) {
        return super.visitAct(ctx);
    }

    @Override
    public String visitBeliefEvents(CANParser.BeliefEventsContext ctx) {
        return super.visitBeliefEvents(ctx);
    }

    @Override
    public String visitPlanBody(CANParser.PlanBodyContext ctx) {
        return super.visitPlanBody(ctx);
    }

    @Override
    public String visitActBody(CANParser.ActBodyContext ctx) {
        return super.visitActBody(ctx);
    }

    @Override
    public String visitAtoms(CANParser.AtomsContext ctx) {
        return super.visitAtoms(ctx);
    }

    @Override
    public String visitEmptyList(CANParser.EmptyListContext ctx) {
        return super.visitEmptyList(ctx);
    }

    @Override
    public String visitNegation(CANParser.NegationContext ctx) {
        return super.visitNegation(ctx);
    }

    @Override
    public String visitGoal(CANParser.GoalContext ctx) {
        return super.visitGoal(ctx);
    }

    @Override
    public String visitBool(CANParser.BoolContext ctx) {
        return super.visitBool(ctx);
    }

    @Override
    public String visitEmptyProgram(CANParser.EmptyProgramContext ctx) {
        return super.visitEmptyProgram(ctx);
    }

    @Override
    public String visitPrograms(CANParser.ProgramsContext ctx) {
        return super.visitPrograms(ctx);
    }

    @Override
    public String visitBeliefs(CANParser.BeliefsContext ctx) {
        return super.visitBeliefs(ctx);
    }

    @Override
    public String visitAtomName(CANParser.AtomNameContext ctx) {
        return ctx.NAME().getText();
    }

    @Override
    public String visitAtomList(CANParser.AtomListContext ctx) {
         String[] atomList = visit(ctx.atom());


    }

    @Override
    public String visitCondition(CANParser.ConditionContext ctx) {
        return super.visitCondition(ctx);
    }
}
