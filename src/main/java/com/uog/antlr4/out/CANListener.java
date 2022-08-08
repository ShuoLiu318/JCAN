// Generated from /Users/gray/IdeaProjects/JCAN/src/main/java/com/uog/antlr4/CAN.g4 by ANTLR 4.10.1
package out;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CANParser}.
 */
public interface CANListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CANParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CANParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CANParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CANParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#initBelief}.
	 * @param ctx the parse tree
	 */
	void enterInitBelief(CANParser.InitBeliefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#initBelief}.
	 * @param ctx the parse tree
	 */
	void exitInitBelief(CANParser.InitBeliefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#belief}.
	 * @param ctx the parse tree
	 */
	void enterBelief(CANParser.BeliefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#belief}.
	 * @param ctx the parse tree
	 */
	void exitBelief(CANParser.BeliefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#beliefList}.
	 * @param ctx the parse tree
	 */
	void enterBeliefList(CANParser.BeliefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#beliefList}.
	 * @param ctx the parse tree
	 */
	void exitBeliefList(CANParser.BeliefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#externalEvent}.
	 * @param ctx the parse tree
	 */
	void enterExternalEvent(CANParser.ExternalEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#externalEvent}.
	 * @param ctx the parse tree
	 */
	void exitExternalEvent(CANParser.ExternalEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(CANParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(CANParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#eventList}.
	 * @param ctx the parse tree
	 */
	void enterEventList(CANParser.EventListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#eventList}.
	 * @param ctx the parse tree
	 */
	void exitEventList(CANParser.EventListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#plan}.
	 * @param ctx the parse tree
	 */
	void enterPlan(CANParser.PlanContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#plan}.
	 * @param ctx the parse tree
	 */
	void exitPlan(CANParser.PlanContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(CANParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(CANParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#goalList}.
	 * @param ctx the parse tree
	 */
	void enterGoalList(CANParser.GoalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#goalList}.
	 * @param ctx the parse tree
	 */
	void exitGoalList(CANParser.GoalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(CANParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(CANParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CANParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CANParser.OperatorContext ctx);
}