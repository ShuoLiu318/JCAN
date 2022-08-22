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
		PLAN=17, ACTION=18, AND=19, OR=20, PARALLEL=21, NEGATION=22, FAIL=23, 
		NAME=24, NEWLINE=25, WS=26, COMMENT=27, MULTILINE_COMMENT=28;
	public static final int
		RULE_c_text = 0, RULE_stat = 1, RULE_expr = 2, RULE_atom = 3, RULE_planBody = 4, 
		RULE_preCon = 5, RULE_add = 6, RULE_delete = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"c_text", "stat", "expr", "atom", "planBody", "preCon", "add", "delete"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "','", "'}'", "':'", "'<-'", "'<'", "'>'", "'true'", "'false'", 
			"'nil'", "'goal'", "'('", "')'", "';'", "'initBelief'", "'externalEvent'", 
			"'Plan'", "'Action'", "'&'", "'|'", "'||'", "'!'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "BELIEFS", "EVENTS", "PLAN", "ACTION", "AND", "OR", 
			"PARALLEL", "NEGATION", "FAIL", "NAME", "NEWLINE", "WS", "COMMENT", "MULTILINE_COMMENT"
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
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(19); 
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
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BELIEFS:
			case EVENTS:
			case PLAN:
			case ACTION:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				expr();
				setState(22);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
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
		public PlanBodyContext planBody() {
			return getRuleContext(PlanBodyContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BELIEFS:
				_localctx = new InitBeliefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(27);
				((InitBeliefContext)_localctx).type = match(BELIEFS);
				}
				setState(28);
				match(T__0);
				setState(29);
				atom(0);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(30);
					match(T__1);
					setState(31);
					atom(0);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(T__2);
				}
				break;
			case EVENTS:
				_localctx = new ExternalEventContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(39);
				((ExternalEventContext)_localctx).type = match(EVENTS);
				}
				setState(40);
				match(T__0);
				setState(41);
				atom(0);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(42);
					match(T__1);
					setState(43);
					atom(0);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(49);
				match(T__2);
				}
				break;
			case PLAN:
				_localctx = new PlanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(51);
				((PlanContext)_localctx).type = match(PLAN);
				}
				setState(52);
				atom(0);
				setState(53);
				match(T__3);
				setState(54);
				preCon();
				setState(55);
				match(T__4);
				setState(56);
				planBody();
				}
				break;
			case ACTION:
				_localctx = new ActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(58);
				((ActionContext)_localctx).type = match(ACTION);
				}
				setState(59);
				atom(0);
				setState(60);
				match(T__3);
				setState(61);
				preCon();
				setState(62);
				match(T__4);
				setState(63);
				match(T__5);
				setState(64);
				match(T__0);
				setState(65);
				add();
				setState(66);
				match(T__2);
				setState(67);
				match(T__1);
				setState(68);
				match(T__0);
				setState(69);
				delete();
				setState(70);
				match(T__2);
				setState(71);
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
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
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
	public static class ProgramsContext extends AtomContext {
		public Token op;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode FAIL() { return getToken(CANParser.FAIL, 0); }
		public TerminalNode PARALLEL() { return getToken(CANParser.PARALLEL, 0); }
		public ProgramsContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterPrograms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitPrograms(this);
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
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new AtomNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(76);
				match(NAME);
				}
				break;
			case T__7:
			case T__8:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
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
				setState(78);
				match(T__9);
				}
				break;
			case NEGATION:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(79);
				((NegationContext)_localctx).op = match(NEGATION);
				}
				setState(80);
				atom(2);
				}
				break;
			case T__10:
				{
				_localctx = new GoalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(T__10);
				setState(82);
				match(T__11);
				setState(83);
				atom(0);
				setState(84);
				match(T__1);
				setState(85);
				atom(0);
				setState(86);
				match(T__1);
				setState(87);
				atom(0);
				setState(88);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new LogicBeliefsContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(92);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(93);
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
						setState(94);
						atom(6);
						}
						break;
					case 2:
						{
						_localctx = new ProgramsContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(95);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(96);
						((ProgramsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PARALLEL || _la==FAIL) ) {
							((ProgramsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						setState(97);
						atom(5);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class PlanBodyContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public PlanBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterPlanBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitPlanBody(this);
		}
	}

	public final PlanBodyContext planBody() throws RecognitionException {
		PlanBodyContext _localctx = new PlanBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_planBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			atom(0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(104);
				match(T__13);
				setState(105);
				atom(0);
				}
				}
				setState(110);
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
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
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
		enterRule(_localctx, 10, RULE_preCon);
		int _la;
		try {
			_localctx = new PreConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			atom(0);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(112);
				match(T__1);
				setState(113);
				atom(0);
				}
				}
				setState(118);
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
		enterRule(_localctx, 12, RULE_add);
		int _la;
		try {
			_localctx = new AddBeliefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			atom(0);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(120);
				match(T__1);
				setState(121);
				atom(0);
				}
				}
				setState(126);
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
		enterRule(_localctx, 14, RULE_delete);
		int _la;
		try {
			_localctx = new DeleteBeliefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			atom(0);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(128);
				match(T__1);
				setState(129);
				atom(0);
				}
				}
				setState(134);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002!\b"+
		"\u0002\n\u0002\f\u0002$\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002-\b\u0002\n\u0002"+
		"\f\u00020\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002J\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003c\b\u0003\n\u0003\f\u0003f\t"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004k\b\u0004\n\u0004"+
		"\f\u0004n\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005s\b\u0005"+
		"\n\u0005\f\u0005v\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"{\b\u0006\n\u0006\f\u0006~\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0083\b\u0007\n\u0007\f\u0007\u0086\t\u0007\u0001\u0007\u0000"+
		"\u0001\u0006\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0003\u0001\u0000"+
		"\b\t\u0001\u0000\u0013\u0014\u0002\u0000\u0015\u0015\u0017\u0017\u0090"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0019\u0001\u0000\u0000\u0000"+
		"\u0004I\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000\bg\u0001"+
		"\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000\fw\u0001\u0000\u0000\u0000"+
		"\u000e\u007f\u0001\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000"+
		"\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000"+
		"\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0003\u0004\u0002\u0000"+
		"\u0016\u0017\u0005\u0019\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0005\u0019\u0000\u0000\u0019\u0015\u0001\u0000\u0000\u0000"+
		"\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0005\u000f\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000"+
		"\u001d\"\u0003\u0006\u0003\u0000\u001e\u001f\u0005\u0002\u0000\u0000\u001f"+
		"!\u0003\u0006\u0003\u0000 \u001e\u0001\u0000\u0000\u0000!$\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000\u0000"+
		"&J\u0001\u0000\u0000\u0000\'(\u0005\u0010\u0000\u0000()\u0005\u0001\u0000"+
		"\u0000).\u0003\u0006\u0003\u0000*+\u0005\u0002\u0000\u0000+-\u0003\u0006"+
		"\u0003\u0000,*\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000012\u0005\u0003\u0000\u00002J\u0001\u0000\u0000"+
		"\u000034\u0005\u0011\u0000\u000045\u0003\u0006\u0003\u000056\u0005\u0004"+
		"\u0000\u000067\u0003\n\u0005\u000078\u0005\u0005\u0000\u000089\u0003\b"+
		"\u0004\u00009J\u0001\u0000\u0000\u0000:;\u0005\u0012\u0000\u0000;<\u0003"+
		"\u0006\u0003\u0000<=\u0005\u0004\u0000\u0000=>\u0003\n\u0005\u0000>?\u0005"+
		"\u0005\u0000\u0000?@\u0005\u0006\u0000\u0000@A\u0005\u0001\u0000\u0000"+
		"AB\u0003\f\u0006\u0000BC\u0005\u0003\u0000\u0000CD\u0005\u0002\u0000\u0000"+
		"DE\u0005\u0001\u0000\u0000EF\u0003\u000e\u0007\u0000FG\u0005\u0003\u0000"+
		"\u0000GH\u0005\u0007\u0000\u0000HJ\u0001\u0000\u0000\u0000I\u001b\u0001"+
		"\u0000\u0000\u0000I\'\u0001\u0000\u0000\u0000I3\u0001\u0000\u0000\u0000"+
		"I:\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0006\u0003"+
		"\uffff\uffff\u0000L[\u0005\u0018\u0000\u0000M[\u0007\u0000\u0000\u0000"+
		"N[\u0005\n\u0000\u0000OP\u0005\u0016\u0000\u0000P[\u0003\u0006\u0003\u0002"+
		"QR\u0005\u000b\u0000\u0000RS\u0005\f\u0000\u0000ST\u0003\u0006\u0003\u0000"+
		"TU\u0005\u0002\u0000\u0000UV\u0003\u0006\u0003\u0000VW\u0005\u0002\u0000"+
		"\u0000WX\u0003\u0006\u0003\u0000XY\u0005\r\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZK\u0001\u0000\u0000\u0000ZM\u0001\u0000\u0000\u0000ZN\u0001\u0000"+
		"\u0000\u0000ZO\u0001\u0000\u0000\u0000ZQ\u0001\u0000\u0000\u0000[d\u0001"+
		"\u0000\u0000\u0000\\]\n\u0005\u0000\u0000]^\u0007\u0001\u0000\u0000^c"+
		"\u0003\u0006\u0003\u0006_`\n\u0004\u0000\u0000`a\u0007\u0002\u0000\u0000"+
		"ac\u0003\u0006\u0003\u0005b\\\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000e\u0007\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gl\u0003\u0006\u0003\u0000hi\u0005\u000e\u0000\u0000ik\u0003\u0006\u0003"+
		"\u0000jh\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\t\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000ot\u0003\u0006\u0003\u0000pq\u0005\u0002\u0000\u0000"+
		"qs\u0003\u0006\u0003\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u000b\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w|\u0003\u0006\u0003\u0000"+
		"xy\u0005\u0002\u0000\u0000y{\u0003\u0006\u0003\u0000zx\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\r\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0084\u0003\u0006\u0003\u0000\u0080\u0081\u0005\u0002\u0000\u0000\u0081"+
		"\u0083\u0003\u0006\u0003\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u000f\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\f\u0013\u0019\".IZbdlt|\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}