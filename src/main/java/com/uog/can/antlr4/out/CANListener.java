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
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CANParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link CANParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CANParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code action}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAction(CANParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code action}
	 * labeled alternative in {@link CANParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAction(CANParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicBeliefs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterLogicBeliefs(CANParser.LogicBeliefsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicBeliefs}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitLogicBeliefs(CANParser.LogicBeliefsContext ctx);
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
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(CANParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CANParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(CANParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CANParser#planbody}.
	 * @param ctx the parse tree
	 */
	void enterPlanbody(CANParser.PlanbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CANParser#planbody}.
	 * @param ctx the parse tree
	 */
	void exitPlanbody(CANParser.PlanbodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarativeGoals}
	 * labeled alternative in {@link CANParser#goals}.
	 * @param ctx the parse tree
	 */
	void enterDeclarativeGoals(CANParser.DeclarativeGoalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarativeGoals}
	 * labeled alternative in {@link CANParser#goals}.
	 * @param ctx the parse tree
	 */
	void exitDeclarativeGoals(CANParser.DeclarativeGoalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goalProgram}
	 * labeled alternative in {@link CANParser#goalP}.
	 * @param ctx the parse tree
	 */
	void enterGoalProgram(CANParser.GoalProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goalProgram}
	 * labeled alternative in {@link CANParser#goalP}.
	 * @param ctx the parse tree
	 */
	void exitGoalProgram(CANParser.GoalProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goalCon}
	 * labeled alternative in {@link CANParser#goalCondition}.
	 * @param ctx the parse tree
	 */
	void enterGoalCon(CANParser.GoalConContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goalCon}
	 * labeled alternative in {@link CANParser#goalCondition}.
	 * @param ctx the parse tree
	 */
	void exitGoalCon(CANParser.GoalConContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preCondition}
	 * labeled alternative in {@link CANParser#preCon}.
	 * @param ctx the parse tree
	 */
	void enterPreCondition(CANParser.PreConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preCondition}
	 * labeled alternative in {@link CANParser#preCon}.
	 * @param ctx the parse tree
	 */
	void exitPreCondition(CANParser.PreConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addBelief}
	 * labeled alternative in {@link CANParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAddBelief(CANParser.AddBeliefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addBelief}
	 * labeled alternative in {@link CANParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAddBelief(CANParser.AddBeliefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteBelief}
	 * labeled alternative in {@link CANParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDeleteBelief(CANParser.DeleteBeliefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteBelief}
	 * labeled alternative in {@link CANParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDeleteBelief(CANParser.DeleteBeliefContext ctx);
}