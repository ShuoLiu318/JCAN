// Generated from /Users/gray/IdeaProjects/JCAN/src/main/java/com/uog/antlr4/CAN.g4 by ANTLR 4.10.1
package out;
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
	 * Visit a parse tree produced by {@link CANParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CANParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(CANParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#initBelief}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitBelief(CANParser.InitBeliefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#belief}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBelief(CANParser.BeliefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#beliefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeliefList(CANParser.BeliefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#externalEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalEvent(CANParser.ExternalEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(CANParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#eventList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventList(CANParser.EventListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#plan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlan(CANParser.PlanContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(CANParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#goalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoalList(CANParser.GoalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(CANParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CANParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(CANParser.OperatorContext ctx);
}