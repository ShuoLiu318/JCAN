// Generated from /Users/gray/IdeaProjects/JCAN/src/main/java/com/uog/can/antlr4/CAN.g4 by ANTLR 4.10.1
package com.uog.can.antlr4.out;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CANParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CANVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CANParser#c_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_text(CANParser.C_textContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(CANParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(CANParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initBelief}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitBelief(CANParser.InitBeliefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code externalEvent}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalEvent(CANParser.ExternalEventContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plan}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan(CANParser.PlanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code act}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAct(CANParser.ActContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beliefEvents}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeliefEvents(CANParser.BeliefEventsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code planBody}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlanBody(CANParser.PlanBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actBody}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActBody(CANParser.ActBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atoms}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtoms(CANParser.AtomsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyList}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyList(CANParser.EmptyListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negation}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(CANParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goal}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(CANParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(CANParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyProgram}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyProgram(CANParser.EmptyProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograms(CANParser.ProgramsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code beliefs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeliefs(CANParser.BeliefsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomName}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomName(CANParser.AtomNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomList}
	 * labeled alternative in {@link CANParser#atomlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomList(CANParser.AtomListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link CANParser#preCon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CANParser.ConditionContext ctx);
}