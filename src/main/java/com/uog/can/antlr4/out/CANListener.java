// Generated from /Users/gray/IdeaProjects/JCAN/src/main/java/com/uog/can/antlr4/CAN.g4 by ANTLR 4.10.1
package com.uog.can.antlr4.out;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CANParser}.
 */
public interface CANListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CANParser#c_text}.
	 * @param ctx the parse tree
	 */
	void enterC_text(CANParser.C_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#c_text}.
	 * @param ctx the parse tree
	 */
	void exitC_text(CANParser.C_textContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CANParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CANParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CANParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CANParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initBelief}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInitBelief(CANParser.InitBeliefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initBelief}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInitBelief(CANParser.InitBeliefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code externalEvent}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExternalEvent(CANParser.ExternalEventContext ctx);
	/**
	 * Exit a parse tree produced by the {@code externalEvent}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExternalEvent(CANParser.ExternalEventContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plan}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlan(CANParser.PlanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plan}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlan(CANParser.PlanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code act}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAct(CANParser.ActContext ctx);
	/**
	 * Exit a parse tree produced by the {@code act}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAct(CANParser.ActContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beliefEvents}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBeliefEvents(CANParser.BeliefEventsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beliefEvents}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBeliefEvents(CANParser.BeliefEventsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code planBody}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlanBody(CANParser.PlanBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code planBody}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlanBody(CANParser.PlanBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actBody}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterActBody(CANParser.ActBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actBody}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitActBody(CANParser.ActBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atoms}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(CANParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atoms}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(CANParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyList}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmptyList(CANParser.EmptyListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyList}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmptyList(CANParser.EmptyListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negation}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNegation(CANParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNegation(CANParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goal}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterGoal(CANParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goal}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitGoal(CANParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBool(CANParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBool(CANParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyProgram}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmptyProgram(CANParser.EmptyProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyProgram}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmptyProgram(CANParser.EmptyProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code programs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPrograms(CANParser.ProgramsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPrograms(CANParser.ProgramsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beliefs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBeliefs(CANParser.BeliefsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beliefs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBeliefs(CANParser.BeliefsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomName}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomName(CANParser.AtomNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomName}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomName(CANParser.AtomNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomList}
	 * labeled alternative in {@link CANParser#atomlist}.
	 * @param ctx the parse tree
	 */
	void enterAtomList(CANParser.AtomListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomList}
	 * labeled alternative in {@link CANParser#atomlist}.
	 * @param ctx the parse tree
	 */
	void exitAtomList(CANParser.AtomListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition}
	 * labeled alternative in {@link CANParser#preCon}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CANParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link CANParser#preCon}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CANParser.ConditionContext ctx);
}