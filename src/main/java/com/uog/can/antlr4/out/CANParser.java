// Generated from /Users/gray/IdeaProjects/JCAN/src/main/java/com/uog/can/antlr4/CAN.g4 by ANTLR 4.10.1
package com.uog.can.antlr4.out;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CANParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BELIEFS=15, EVENTS=16, 
		PLAN=17, ACTION=18, AND=19, OR=20, NEGATION=21, NAME=22, NEWLINE=23, WS=24, 
		COMMENT=25, MULTILINE_COMMENT=26;
	public static final int
		RULE_c_text = 0, RULE_stat = 1, RULE_expr = 2, RULE_atom = 3, RULE_planbody = 4, 
		RULE_goals = 5, RULE_goalP = 6, RULE_goalCondition = 7, RULE_preCon = 8, 
		RULE_add = 9, RULE_delete = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"c_text", "stat", "expr", "atom", "planbody", "goals", "goalP", "goalCondition", 
			"preCon", "add", "delete"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'<-'", "'<'", "'>'", "'true'", "'false'", 
			"'nil'", "'goal'", "'('", "')'", "';'", "'initBelief'", "'externalEvent'", 
			"'Plan'", "'Action'", "'&'", "'|'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BELIEFS", "EVENTS", "PLAN", "ACTION", "AND", "OR", 
			"NEGATION", "NAME", "NEWLINE", "WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CAN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CANParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class C_textContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public C_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterC_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitC_text(this);
		}
	}

	public final C_textContext c_text() throws RecognitionException {
		C_textContext _localctx = new C_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_c_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				stat();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BELIEFS) | (1L << EVENTS) | (1L << PLAN) | (1L << ACTION) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CANParser.NEWLINE, 0); }
		public ExpressionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitExpression(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(CANParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitBlank(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BELIEFS:
			case EVENTS:
			case PLAN:
			case ACTION:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				expr();
				setState(28);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitBeliefContext extends ExprContext {
		public Token type;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode BELIEFS() { return getToken(CANParser.BELIEFS, 0); }
		public InitBeliefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterInitBelief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitInitBelief(this);
		}
	}
	public static class ExternalEventContext extends ExprContext {
		public Token type;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode EVENTS() { return getToken(CANParser.EVENTS, 0); }
		public ExternalEventContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterExternalEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitExternalEvent(this);
		}
	}
	public static class ActionContext extends ExprContext {
		public Token type;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PreConContext preCon() {
			return getRuleContext(PreConContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(CANParser.ACTION, 0); }
		public ActionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAction(this);
		}
	}
	public static class PlanContext extends ExprContext {
		public Token type;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PreConContext preCon() {
			return getRuleContext(PreConContext.class,0);
		}
		public PlanbodyContext planbody() {
			return getRuleContext(PlanbodyContext.class,0);
		}
		public TerminalNode PLAN() { return getToken(CANParser.PLAN, 0); }
		public PlanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterPlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitPlan(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BELIEFS:
				_localctx = new InitBeliefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(33);
				((InitBeliefContext)_localctx).type = match(BELIEFS);
				}
				setState(34);
				match(T__0);
				setState(35);
				atom(0);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(36);
					match(T__1);
					setState(37);
					atom(0);
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(T__2);
				}
				break;
			case EVENTS:
				_localctx = new ExternalEventContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(45);
				((ExternalEventContext)_localctx).type = match(EVENTS);
				}
				setState(46);
				match(T__0);
				setState(47);
				atom(0);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(48);
					match(T__1);
					setState(49);
					atom(0);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(T__2);
				}
				break;
			case PLAN:
				_localctx = new PlanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(57);
				((PlanContext)_localctx).type = match(PLAN);
				}
				setState(58);
				atom(0);
				setState(59);
				match(T__3);
				setState(60);
				preCon();
				setState(61);
				match(T__4);
				setState(62);
				planbody();
				}
				break;
			case ACTION:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(64);
				((ActionContext)_localctx).type = match(ACTION);
				}
				setState(65);
				atom(0);
				setState(66);
				match(T__3);
				setState(67);
				preCon();
				setState(68);
				match(T__4);
				setState(69);
				match(T__5);
				setState(70);
				match(T__0);
				setState(71);
				add();
				setState(72);
				match(T__2);
				setState(73);
				match(T__1);
				setState(74);
				match(T__0);
				setState(75);
				delete();
				setState(76);
				match(T__2);
				setState(77);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicBeliefsContext extends AtomContext {
		public Token op;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode AND() { return getToken(CANParser.AND, 0); }
		public TerminalNode OR() { return getToken(CANParser.OR, 0); }
		public LogicBeliefsContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterLogicBeliefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitLogicBeliefs(this);
		}
	}
	public static class NegationContext extends AtomContext {
		public Token op;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(CANParser.NEGATION, 0); }
		public NegationContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitNegation(this);
		}
	}
	public static class GoalContext extends AtomContext {
		public GoalsContext goals() {
			return getRuleContext(GoalsContext.class,0);
		}
		public GoalPContext goalP() {
			return getRuleContext(GoalPContext.class,0);
		}
		public GoalConditionContext goalCondition() {
			return getRuleContext(GoalConditionContext.class,0);
		}
		public GoalContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitGoal(this);
		}
	}
	public static class BoolContext extends AtomContext {
		public BoolContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitBool(this);
		}
	}
	public static class AtomNameContext extends AtomContext {
		public TerminalNode NAME() { return getToken(CANParser.NAME, 0); }
		public AtomNameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAtomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAtomName(this);
		}
	}
	public static class EmptyContext extends AtomContext {
		public EmptyContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitEmpty(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		return atom(0);
	}

	private AtomContext atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomContext _localctx = new AtomContext(_ctx, _parentState);
		AtomContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_atom, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new AtomNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				match(NAME);
				}
				break;
			case T__7:
			case T__8:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__9:
				{
				_localctx = new EmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(T__9);
				}
				break;
			case NEGATION:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(85);
				((NegationContext)_localctx).op = match(NEGATION);
				}
				setState(86);
				atom(2);
				}
				break;
			case T__10:
				{
				_localctx = new GoalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(T__10);
				setState(88);
				match(T__11);
				setState(89);
				goals();
				setState(90);
				match(T__1);
				setState(91);
				goalP();
				setState(92);
				match(T__1);
				setState(93);
				goalCondition();
				setState(94);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicBeliefsContext(new AtomContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_atom);
					setState(98);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					{
					setState(99);
					((LogicBeliefsContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((LogicBeliefsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					setState(100);
					atom(5);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlanbodyContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public PlanbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterPlanbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitPlanbody(this);
		}
	}

	public final PlanbodyContext planbody() throws RecognitionException {
		PlanbodyContext _localctx = new PlanbodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_planbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			atom(0);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(107);
				match(T__13);
				setState(108);
				atom(0);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoalsContext extends ParserRuleContext {
		public GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goals; }
	 
		public GoalsContext() { }
		public void copyFrom(GoalsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarativeGoalsContext extends GoalsContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public DeclarativeGoalsContext(GoalsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterDeclarativeGoals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitDeclarativeGoals(this);
		}
	}

	public final GoalsContext goals() throws RecognitionException {
		GoalsContext _localctx = new GoalsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_goals);
		try {
			_localctx = new DeclarativeGoalsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			atom(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoalPContext extends ParserRuleContext {
		public GoalPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goalP; }
	 
		public GoalPContext() { }
		public void copyFrom(GoalPContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GoalProgramContext extends GoalPContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public GoalProgramContext(GoalPContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterGoalProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitGoalProgram(this);
		}
	}

	public final GoalPContext goalP() throws RecognitionException {
		GoalPContext _localctx = new GoalPContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_goalP);
		try {
			_localctx = new GoalProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			atom(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoalConditionContext extends ParserRuleContext {
		public GoalConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goalCondition; }
	 
		public GoalConditionContext() { }
		public void copyFrom(GoalConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GoalConContext extends GoalConditionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public GoalConContext(GoalConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterGoalCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitGoalCon(this);
		}
	}

	public final GoalConditionContext goalCondition() throws RecognitionException {
		GoalConditionContext _localctx = new GoalConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_goalCondition);
		try {
			_localctx = new GoalConContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			atom(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreConContext extends ParserRuleContext {
		public PreConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preCon; }
	 
		public PreConContext() { }
		public void copyFrom(PreConContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreConditionContext extends PreConContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PreConditionContext(PreConContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterPreCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitPreCondition(this);
		}
	}

	public final PreConContext preCon() throws RecognitionException {
		PreConContext _localctx = new PreConContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_preCon);
		try {
			_localctx = new PreConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			atom(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	 
		public AddContext() { }
		public void copyFrom(AddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddBeliefContext extends AddContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public AddBeliefContext(AddContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAddBelief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAddBelief(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_add);
		int _la;
		try {
			_localctx = new AddBeliefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			atom(0);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(123);
				match(T__1);
				setState(124);
				atom(0);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
	 
		public DeleteContext() { }
		public void copyFrom(DeleteContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteBeliefContext extends DeleteContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public DeleteBeliefContext(DeleteContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterDeleteBelief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitDeleteBelief(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_delete);
		int _la;
		try {
			_localctx = new DeleteBeliefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			atom(0);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(131);
				match(T__1);
				setState(132);
				atom(0);
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return atom_sempred((AtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean atom_sempred(AtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u008b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000"+
		"\u0018\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002\n\u0002\f\u0002*"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002P\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003a\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003f\b\u0003\n\u0003"+
		"\f\u0003i\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004n\b\u0004"+
		"\n\u0004\f\u0004q\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005"+
		"\t~\b\t\n\t\f\t\u0081\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u0086\b\n\n"+
		"\n\f\n\u0089\t\n\u0001\n\u0000\u0001\u0006\u000b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\b\t\u0001\u0000"+
		"\u0013\u0014\u008e\u0000\u0017\u0001\u0000\u0000\u0000\u0002\u001f\u0001"+
		"\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006`\u0001\u0000\u0000"+
		"\u0000\bj\u0001\u0000\u0000\u0000\nr\u0001\u0000\u0000\u0000\ft\u0001"+
		"\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000"+
		"\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0082\u0001\u0000\u0000\u0000"+
		"\u0016\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0003\u0004\u0002\u0000\u001c\u001d\u0005\u0017\u0000\u0000"+
		"\u001d \u0001\u0000\u0000\u0000\u001e \u0005\u0017\u0000\u0000\u001f\u001b"+
		"\u0001\u0000\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 \u0003\u0001"+
		"\u0000\u0000\u0000!\"\u0005\u000f\u0000\u0000\"#\u0005\u0001\u0000\u0000"+
		"#(\u0003\u0006\u0003\u0000$%\u0005\u0002\u0000\u0000%\'\u0003\u0006\u0003"+
		"\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0003\u0000\u0000,P\u0001\u0000\u0000\u0000"+
		"-.\u0005\u0010\u0000\u0000./\u0005\u0001\u0000\u0000/4\u0003\u0006\u0003"+
		"\u000001\u0005\u0002\u0000\u000013\u0003\u0006\u0003\u000020\u0001\u0000"+
		"\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"78\u0005\u0003\u0000\u00008P\u0001\u0000\u0000\u00009:\u0005\u0011\u0000"+
		"\u0000:;\u0003\u0006\u0003\u0000;<\u0005\u0004\u0000\u0000<=\u0003\u0010"+
		"\b\u0000=>\u0005\u0005\u0000\u0000>?\u0003\b\u0004\u0000?P\u0001\u0000"+
		"\u0000\u0000@A\u0005\u0012\u0000\u0000AB\u0003\u0006\u0003\u0000BC\u0005"+
		"\u0004\u0000\u0000CD\u0003\u0010\b\u0000DE\u0005\u0005\u0000\u0000EF\u0005"+
		"\u0006\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0003\u0012\t\u0000HI\u0005"+
		"\u0003\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0005\u0001\u0000\u0000"+
		"KL\u0003\u0014\n\u0000LM\u0005\u0003\u0000\u0000MN\u0005\u0007\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000O!\u0001\u0000\u0000\u0000O-\u0001\u0000\u0000"+
		"\u0000O9\u0001\u0000\u0000\u0000O@\u0001\u0000\u0000\u0000P\u0005\u0001"+
		"\u0000\u0000\u0000QR\u0006\u0003\uffff\uffff\u0000Ra\u0005\u0016\u0000"+
		"\u0000Sa\u0007\u0000\u0000\u0000Ta\u0005\n\u0000\u0000UV\u0005\u0015\u0000"+
		"\u0000Va\u0003\u0006\u0003\u0002WX\u0005\u000b\u0000\u0000XY\u0005\f\u0000"+
		"\u0000YZ\u0003\n\u0005\u0000Z[\u0005\u0002\u0000\u0000[\\\u0003\f\u0006"+
		"\u0000\\]\u0005\u0002\u0000\u0000]^\u0003\u000e\u0007\u0000^_\u0005\r"+
		"\u0000\u0000_a\u0001\u0000\u0000\u0000`Q\u0001\u0000\u0000\u0000`S\u0001"+
		"\u0000\u0000\u0000`T\u0001\u0000\u0000\u0000`U\u0001\u0000\u0000\u0000"+
		"`W\u0001\u0000\u0000\u0000ag\u0001\u0000\u0000\u0000bc\n\u0004\u0000\u0000"+
		"cd\u0007\u0001\u0000\u0000df\u0003\u0006\u0003\u0005eb\u0001\u0000\u0000"+
		"\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000h\u0007\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"jo\u0003\u0006\u0003\u0000kl\u0005\u000e\u0000\u0000ln\u0003\u0006\u0003"+
		"\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000op\u0001\u0000\u0000\u0000p\t\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000rs\u0003\u0006\u0003\u0000s\u000b\u0001\u0000\u0000"+
		"\u0000tu\u0003\u0006\u0003\u0000u\r\u0001\u0000\u0000\u0000vw\u0003\u0006"+
		"\u0003\u0000w\u000f\u0001\u0000\u0000\u0000xy\u0003\u0006\u0003\u0000"+
		"y\u0011\u0001\u0000\u0000\u0000z\u007f\u0003\u0006\u0003\u0000{|\u0005"+
		"\u0002\u0000\u0000|~\u0003\u0006\u0003\u0000}{\u0001\u0000\u0000\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0013\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0087\u0003\u0006\u0003\u0000\u0083\u0084"+
		"\u0005\u0002\u0000\u0000\u0084\u0086\u0003\u0006\u0003\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0015"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\n\u0019\u001f"+
		"(4O`go\u007f\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}