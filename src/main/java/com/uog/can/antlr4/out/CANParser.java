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
		T__9=10, T__10=11, T__11=12, T__12=13, BELIEFS=14, EVENTS=15, PLAN=16, 
		ACTION=17, AND=18, OR=19, PARALLEL=20, NEGATION=21, SEQ=22, FAIL=23, NAME=24, 
		NEWLINE=25, WS=26, COMMENT=27, MULTILINE_COMMENT=28;
	public static final int
		RULE_c_text = 0, RULE_stat = 1, RULE_expr = 2, RULE_atom = 3, RULE_atomList = 4, 
		RULE_preCon = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"c_text", "stat", "expr", "atom", "atomList", "preCon"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "'<-'", "'<'", "','", "'>'", "'true'", "'false'", 
			"'nil'", "'goal'", "'('", "')'", "'Beliefs'", "'Events'", "'Plan'", "'Action'", 
			"'&'", "'|'", "'||'", "'!'", "';'", "'>>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BELIEFS", "EVENTS", "PLAN", "ACTION", "AND", "OR", "PARALLEL", 
			"NEGATION", "SEQ", "FAIL", "NAME", "NEWLINE", "WS", "COMMENT", "MULTILINE_COMMENT"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitC_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_textContext c_text() throws RecognitionException {
		C_textContext _localctx = new C_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_c_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << BELIEFS) | (1L << EVENTS) | (1L << PLAN) | (1L << ACTION) | (1L << NEGATION) | (1L << NAME) | (1L << NEWLINE))) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CANParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case BELIEFS:
			case EVENTS:
			case PLAN:
			case ACTION:
			case NEGATION:
			case NAME:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				expr();
				setState(18);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
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
	public static class BeliefEventsContext extends ExprContext {
		public AtomListContext atomList() {
			return getRuleContext(AtomListContext.class,0);
		}
		public BeliefEventsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterBeliefEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitBeliefEvents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitBeliefEvents(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActContext extends ExprContext {
		public Token type;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(CANParser.ACTION, 0); }
		public ActContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitAct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlanBodyContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PreConContext preCon() {
			return getRuleContext(PreConContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PlanBodyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterPlanBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitPlanBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitPlanBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitBeliefContext extends ExprContext {
		public Token type;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitInitBelief(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExternalEventContext extends ExprContext {
		public Token type;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitExternalEvent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActBodyContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public PreConContext preCon() {
			return getRuleContext(PreConContext.class,0);
		}
		public List<AtomListContext> atomList() {
			return getRuleContexts(AtomListContext.class);
		}
		public AtomListContext atomList(int i) {
			return getRuleContext(AtomListContext.class,i);
		}
		public ActBodyContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterActBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitActBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitActBody(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlanContext extends ExprContext {
		public Token type;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitPlan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomsContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAtoms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitAtoms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			int _alt;
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new InitBeliefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(23);
				((InitBeliefContext)_localctx).type = match(BELIEFS);
				}
				setState(24);
				expr();
				}
				break;
			case 2:
				_localctx = new ExternalEventContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(25);
				((ExternalEventContext)_localctx).type = match(EVENTS);
				}
				setState(26);
				expr();
				}
				break;
			case 3:
				_localctx = new PlanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(27);
				((PlanContext)_localctx).type = match(PLAN);
				}
				setState(28);
				expr();
				}
				break;
			case 4:
				_localctx = new ActContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(29);
				((ActContext)_localctx).type = match(ACTION);
				}
				setState(30);
				expr();
				}
				break;
			case 5:
				_localctx = new BeliefEventsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(31);
				match(T__0);
				setState(32);
				atomList();
				setState(33);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new PlanBodyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(35);
				atom(0);
				setState(36);
				match(T__2);
				setState(37);
				preCon();
				setState(38);
				match(T__3);
				setState(40); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(39);
						expr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(42); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				_localctx = new ActBodyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				atom(0);
				setState(45);
				match(T__2);
				setState(46);
				preCon();
				setState(47);
				match(T__3);
				setState(48);
				match(T__4);
				setState(49);
				match(T__0);
				setState(50);
				atomList();
				setState(51);
				match(T__1);
				setState(52);
				match(T__5);
				setState(53);
				match(T__0);
				setState(54);
				atomList();
				setState(55);
				match(T__1);
				setState(56);
				match(T__6);
				}
				break;
			case 8:
				_localctx = new AtomsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
				atom(0);
				}
				break;
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
	public static class EmptyListContext extends AtomContext {
		public EmptyListContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterEmptyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitEmptyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitEmptyList(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyProgramContext extends AtomContext {
		public EmptyProgramContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterEmptyProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitEmptyProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitEmptyProgram(this);
			else return visitor.visitChildren(this);
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
		public TerminalNode SEQ() { return getToken(CANParser.SEQ, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitPrograms(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeliefsContext extends AtomContext {
		public Token op;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode AND() { return getToken(CANParser.AND, 0); }
		public TerminalNode OR() { return getToken(CANParser.OR, 0); }
		public BeliefsContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterBeliefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitBeliefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitBeliefs(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitAtomName(this);
			else return visitor.visitChildren(this);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				_localctx = new AtomNameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				match(NAME);
				}
				break;
			case T__7:
			case T__8:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
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
			case T__0:
				{
				_localctx = new EmptyListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(T__0);
				setState(65);
				match(T__1);
				}
				break;
			case T__9:
				{
				_localctx = new EmptyProgramContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(T__9);
				}
				break;
			case T__10:
				{
				_localctx = new GoalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__10);
				setState(68);
				match(T__11);
				setState(69);
				atom(0);
				setState(70);
				match(T__5);
				setState(71);
				atom(0);
				setState(72);
				match(T__5);
				setState(73);
				atom(0);
				setState(74);
				match(T__12);
				}
				break;
			case NEGATION:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(76);
				((NegationContext)_localctx).op = match(NEGATION);
				}
				setState(77);
				atom(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(86);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new BeliefsContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(80);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(81);
						((BeliefsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((BeliefsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						setState(82);
						atom(6);
						}
						break;
					case 2:
						{
						_localctx = new ProgramsContext(new AtomContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_atom);
						setState(83);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(84);
						((ProgramsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARALLEL) | (1L << SEQ) | (1L << FAIL))) != 0)) ) {
							((ProgramsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						setState(85);
						atom(5);
						}
						break;
					}
					} 
				}
				setState(90);
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

	public static class AtomListContext extends ParserRuleContext {
		public AtomListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomList; }
	 
		public AtomListContext() { }
		public void copyFrom(AtomListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomlistContext extends AtomListContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public AtomlistContext(AtomListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAtomlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAtomlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitAtomlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomListContext atomList() throws RecognitionException {
		AtomListContext _localctx = new AtomListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atomList);
		int _la;
		try {
			_localctx = new AtomlistContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			atom(0);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(92);
				match(T__5);
				setState(93);
				atom(0);
				}
				}
				setState(98);
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
	public static class ConditionContext extends PreConContext {
		public AtomListContext atomList() {
			return getRuleContext(AtomListContext.class,0);
		}
		public ConditionContext(PreConContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreConContext preCon() throws RecognitionException {
		PreConContext _localctx = new PreConContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_preCon);
		try {
			_localctx = new ConditionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			atomList();
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
		"\u0004\u0001\u001cf\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002)\b\u0002\u000b\u0002\f\u0002*\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003\n\u0003"+
		"\f\u0003Z\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004_\b\u0004"+
		"\n\u0004\f\u0004b\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0001"+
		"\u0006\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0003\u0001\u0000\b\t\u0001"+
		"\u0000\u0012\u0013\u0002\u0000\u0014\u0014\u0016\u0017q\u0000\r\u0001"+
		"\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004;\u0001\u0000"+
		"\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000"+
		"\nc\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000"+
		"\u0000\u0000\u0011\u0012\u0003\u0004\u0002\u0000\u0012\u0013\u0005\u0019"+
		"\u0000\u0000\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0016\u0005\u0019"+
		"\u0000\u0000\u0015\u0011\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000"+
		"\u0000\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u000e"+
		"\u0000\u0000\u0018<\u0003\u0004\u0002\u0000\u0019\u001a\u0005\u000f\u0000"+
		"\u0000\u001a<\u0003\u0004\u0002\u0000\u001b\u001c\u0005\u0010\u0000\u0000"+
		"\u001c<\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u0011\u0000\u0000\u001e"+
		"<\u0003\u0004\u0002\u0000\u001f \u0005\u0001\u0000\u0000 !\u0003\b\u0004"+
		"\u0000!\"\u0005\u0002\u0000\u0000\"<\u0001\u0000\u0000\u0000#$\u0003\u0006"+
		"\u0003\u0000$%\u0005\u0003\u0000\u0000%&\u0003\n\u0005\u0000&(\u0005\u0004"+
		"\u0000\u0000\')\u0003\u0004\u0002\u0000(\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+<\u0001\u0000\u0000\u0000,-\u0003\u0006\u0003\u0000-.\u0005\u0003\u0000"+
		"\u0000./\u0003\n\u0005\u0000/0\u0005\u0004\u0000\u000001\u0005\u0005\u0000"+
		"\u000012\u0005\u0001\u0000\u000023\u0003\b\u0004\u000034\u0005\u0002\u0000"+
		"\u000045\u0005\u0006\u0000\u000056\u0005\u0001\u0000\u000067\u0003\b\u0004"+
		"\u000078\u0005\u0002\u0000\u000089\u0005\u0007\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:<\u0003\u0006\u0003\u0000;\u0017\u0001\u0000\u0000\u0000"+
		";\u0019\u0001\u0000\u0000\u0000;\u001b\u0001\u0000\u0000\u0000;\u001d"+
		"\u0001\u0000\u0000\u0000;\u001f\u0001\u0000\u0000\u0000;#\u0001\u0000"+
		"\u0000\u0000;,\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0005"+
		"\u0001\u0000\u0000\u0000=>\u0006\u0003\uffff\uffff\u0000>O\u0005\u0018"+
		"\u0000\u0000?O\u0007\u0000\u0000\u0000@A\u0005\u0001\u0000\u0000AO\u0005"+
		"\u0002\u0000\u0000BO\u0005\n\u0000\u0000CD\u0005\u000b\u0000\u0000DE\u0005"+
		"\f\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0005\u0006\u0000\u0000GH\u0003"+
		"\u0006\u0003\u0000HI\u0005\u0006\u0000\u0000IJ\u0003\u0006\u0003\u0000"+
		"JK\u0005\r\u0000\u0000KO\u0001\u0000\u0000\u0000LM\u0005\u0015\u0000\u0000"+
		"MO\u0003\u0006\u0003\u0001N=\u0001\u0000\u0000\u0000N?\u0001\u0000\u0000"+
		"\u0000N@\u0001\u0000\u0000\u0000NB\u0001\u0000\u0000\u0000NC\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000OX\u0001\u0000\u0000\u0000PQ\n\u0005"+
		"\u0000\u0000QR\u0007\u0001\u0000\u0000RW\u0003\u0006\u0003\u0006ST\n\u0004"+
		"\u0000\u0000TU\u0007\u0002\u0000\u0000UW\u0003\u0006\u0003\u0005VP\u0001"+
		"\u0000\u0000\u0000VS\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u0007\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000[`\u0003\u0006\u0003\u0000\\]\u0005"+
		"\u0006\u0000\u0000]_\u0003\u0006\u0003\u0000^\\\u0001\u0000\u0000\u0000"+
		"_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000a\t\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0003\b"+
		"\u0004\u0000d\u000b\u0001\u0000\u0000\u0000\b\u000f\u0015*;NVX`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}