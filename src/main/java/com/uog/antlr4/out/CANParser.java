// Generated from /Users/gray/IdeaProjects/JCAN/src/main/java/com/uog/antlr4/CAN.g4 by ANTLR 4.10.1
package out;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CANParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NAME=24, COMMENT=25, 
		MULTILINE_COMMENT=26;
	public static final int
		RULE_expr = 0, RULE_atom = 1, RULE_initBelief = 2, RULE_belief = 3, RULE_beliefList = 4, 
		RULE_externalEvent = 5, RULE_event = 6, RULE_eventList = 7, RULE_plan = 8, 
		RULE_goal = 9, RULE_goalList = 10, RULE_action = 11, RULE_operator = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "atom", "initBelief", "belief", "beliefList", "externalEvent", 
			"event", "eventList", "plan", "goal", "goalList", "action", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'InitBeliefs'", "'{'", "'}'", "';'", "'true'", "'false'", 
			"'nil'", "'Event'", "','", "'Plan'", "':'", "'<-'", "'goal'", "'('", 
			"')'", "'Action'", "'<'", "'>'", "'//'", "'&'", "'|'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NAME", "COMMENT", "MULTILINE_COMMENT"
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CANParser.EOF, 0); }
		public List<InitBeliefContext> initBelief() {
			return getRuleContexts(InitBeliefContext.class);
		}
		public InitBeliefContext initBelief(int i) {
			return getRuleContext(InitBeliefContext.class,i);
		}
		public List<ExternalEventContext> externalEvent() {
			return getRuleContexts(ExternalEventContext.class);
		}
		public ExternalEventContext externalEvent(int i) {
			return getRuleContext(ExternalEventContext.class,i);
		}
		public List<PlanContext> plan() {
			return getRuleContexts(PlanContext.class);
		}
		public PlanContext plan(int i) {
			return getRuleContext(PlanContext.class,i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__8) | (1L << T__10) | (1L << T__16) | (1L << NAME))) != 0)) {
				{
				setState(30);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(26);
					initBelief();
					}
					break;
				case 2:
					{
					setState(27);
					externalEvent();
					}
					break;
				case 3:
					{
					setState(28);
					plan();
					}
					break;
				case 4:
					{
					setState(29);
					action();
					}
					break;
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(EOF);
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
		public TerminalNode NAME() { return getToken(CANParser.NAME, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(NAME);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__0);
				setState(39);
				atom();
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

	public static class InitBeliefContext extends ParserRuleContext {
		public BeliefListContext beliefList() {
			return getRuleContext(BeliefListContext.class,0);
		}
		public InitBeliefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initBelief; }
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

	public final InitBeliefContext initBelief() throws RecognitionException {
		InitBeliefContext _localctx = new InitBeliefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initBelief);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(43);
			match(T__2);
			setState(44);
			beliefList();
			setState(45);
			match(T__3);
			setState(46);
			match(T__4);
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

	public static class BeliefContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public BeliefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belief; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterBelief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitBelief(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitBelief(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeliefContext belief() throws RecognitionException {
		BeliefContext _localctx = new BeliefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_belief);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				atom();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
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

	public static class BeliefListContext extends ParserRuleContext {
		public List<BeliefContext> belief() {
			return getRuleContexts(BeliefContext.class);
		}
		public BeliefContext belief(int i) {
			return getRuleContext(BeliefContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public BeliefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beliefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterBeliefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitBeliefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitBeliefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeliefListContext beliefList() throws RecognitionException {
		BeliefListContext _localctx = new BeliefListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_beliefList);
		int _la;
		try {
			int _alt;
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				belief();
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(54);
							operator();
							}
							}
							setState(57); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0) );
						setState(59);
						belief();
						}
						} 
					}
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__7);
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

	public static class ExternalEventContext extends ParserRuleContext {
		public EventListContext eventList() {
			return getRuleContext(EventListContext.class,0);
		}
		public ExternalEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalEvent; }
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

	public final ExternalEventContext externalEvent() throws RecognitionException {
		ExternalEventContext _localctx = new ExternalEventContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_externalEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__8);
			setState(70);
			match(T__2);
			setState(71);
			eventList();
			setState(72);
			match(T__3);
			setState(73);
			match(T__4);
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

	public static class EventContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			atom();
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

	public static class EventListContext extends ParserRuleContext {
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public EventListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterEventList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitEventList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitEventList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventListContext eventList() throws RecognitionException {
		EventListContext _localctx = new EventListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eventList);
		int _la;
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(T__7);
				}
				break;
			case T__0:
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				event();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(79);
					match(T__9);
					setState(80);
					event();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class PlanContext extends ParserRuleContext {
		public PlanContext plan() {
			return getRuleContext(PlanContext.class,0);
		}
		public BeliefListContext beliefList() {
			return getRuleContext(BeliefListContext.class,0);
		}
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<GoalContext> goal() {
			return getRuleContexts(GoalContext.class);
		}
		public GoalContext goal(int i) {
			return getRuleContext(GoalContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public TerminalNode NAME() { return getToken(CANParser.NAME, 0); }
		public PlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan; }
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

	public final PlanContext plan() throws RecognitionException {
		PlanContext _localctx = new PlanContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_plan);
		try {
			int _alt;
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__10);
				setState(89);
				plan();
				setState(90);
				match(T__11);
				setState(91);
				beliefList();
				setState(92);
				match(T__12);
				setState(102); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(95);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__0:
						case NAME:
							{
							setState(93);
							atom();
							}
							break;
						case T__13:
							{
							setState(94);
							goal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(98); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(97);
								operator();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(100); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(104); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(NAME);
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

	public static class GoalContext extends ParserRuleContext {
		public GoalListContext goalList() {
			return getRuleContext(GoalListContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
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

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__13);
			setState(110);
			match(T__14);
			setState(111);
			goalList();
			setState(112);
			match(T__15);
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

	public static class GoalListContext extends ParserRuleContext {
		public PlanContext plan() {
			return getRuleContext(PlanContext.class,0);
		}
		public BeliefListContext beliefList() {
			return getRuleContext(BeliefListContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public GoalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterGoalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitGoalList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitGoalList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalListContext goalList() throws RecognitionException {
		GoalListContext _localctx = new GoalListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_goalList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(114);
				beliefList();
				}
				break;
			case 2:
				{
				setState(115);
				match(T__5);
				}
				break;
			case 3:
				{
				setState(116);
				match(T__6);
				}
				break;
			}
			setState(119);
			match(T__9);
			setState(120);
			plan();
			setState(121);
			match(T__9);
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NAME:
				{
				setState(122);
				atom();
				}
				break;
			case T__5:
				{
				setState(123);
				match(T__5);
				}
				break;
			case T__6:
				{
				setState(124);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public List<BeliefListContext> beliefList() {
			return getRuleContexts(BeliefListContext.class);
		}
		public BeliefListContext beliefList(int i) {
			return getRuleContext(BeliefListContext.class,i);
		}
		public TerminalNode NAME() { return getToken(CANParser.NAME, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_action);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__16);
				setState(128);
				action();
				setState(129);
				match(T__11);
				setState(130);
				beliefList();
				setState(131);
				match(T__12);
				setState(132);
				match(T__17);
				setState(133);
				match(T__2);
				setState(134);
				beliefList();
				setState(135);
				match(T__3);
				setState(136);
				match(T__9);
				setState(137);
				match(T__2);
				setState(138);
				beliefList();
				setState(139);
				match(T__3);
				setState(140);
				match(T__18);
				setState(141);
				match(T__4);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(NAME);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CANListener ) ((CANListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CANVisitor ) return ((CANVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__12);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__19);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(T__22);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(T__9);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				match(T__11);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				match(T__4);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				match(T__17);
				setState(155);
				match(T__18);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				match(T__2);
				setState(157);
				match(T__3);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00a1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0004\u00048\b\u0004\u000b\u0004\f\u00049\u0001\u0004\u0001\u0004\u0005"+
		"\u0004>\b\u0004\n\u0004\f\u0004A\t\u0004\u0001\u0004\u0003\u0004D\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007R\b\u0007\n\u0007\f\u0007U\t\u0007\u0003\u0007W\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b`\b\b\u0001"+
		"\b\u0004\bc\b\b\u000b\b\f\bd\u0004\bg\b\b\u000b\b\f\bh\u0001\b\u0003\b"+
		"l\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0003\nv\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"~\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0091\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009f\b\f\u0001\f\u0000"+
		"\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u0000\u0000\u00b1\u0000 \u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u0004*\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b"+
		"C\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000"+
		"\u0000\u000eV\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012"+
		"m\u0001\u0000\u0000\u0000\u0014u\u0001\u0000\u0000\u0000\u0016\u0090\u0001"+
		"\u0000\u0000\u0000\u0018\u009e\u0001\u0000\u0000\u0000\u001a\u001f\u0003"+
		"\u0004\u0002\u0000\u001b\u001f\u0003\n\u0005\u0000\u001c\u001f\u0003\u0010"+
		"\b\u0000\u001d\u001f\u0003\u0016\u000b\u0000\u001e\u001a\u0001\u0000\u0000"+
		"\u0000\u001e\u001b\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000\u0000"+
		"\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000"+
		"\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0000\u0000\u0001$\u0001"+
		"\u0001\u0000\u0000\u0000%)\u0005\u0018\u0000\u0000&\'\u0005\u0001\u0000"+
		"\u0000\')\u0003\u0002\u0001\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000"+
		"+,\u0005\u0003\u0000\u0000,-\u0003\b\u0004\u0000-.\u0005\u0004\u0000\u0000"+
		"./\u0005\u0005\u0000\u0000/\u0005\u0001\u0000\u0000\u000004\u0003\u0002"+
		"\u0001\u000014\u0005\u0006\u0000\u000024\u0005\u0007\u0000\u000030\u0001"+
		"\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000\u0000\u0000"+
		"4\u0007\u0001\u0000\u0000\u00005?\u0003\u0006\u0003\u000068\u0003\u0018"+
		"\f\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0003"+
		"\u0006\u0003\u0000<>\u0001\u0000\u0000\u0000=7\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@D\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BD\u0005\b\u0000"+
		"\u0000C5\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\t\u0001\u0000"+
		"\u0000\u0000EF\u0005\t\u0000\u0000FG\u0005\u0003\u0000\u0000GH\u0003\u000e"+
		"\u0007\u0000HI\u0005\u0004\u0000\u0000IJ\u0005\u0005\u0000\u0000J\u000b"+
		"\u0001\u0000\u0000\u0000KL\u0003\u0002\u0001\u0000L\r\u0001\u0000\u0000"+
		"\u0000MW\u0005\b\u0000\u0000NS\u0003\f\u0006\u0000OP\u0005\n\u0000\u0000"+
		"PR\u0003\f\u0006\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VM\u0001\u0000\u0000\u0000VN\u0001\u0000"+
		"\u0000\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\u000b\u0000\u0000"+
		"YZ\u0003\u0010\b\u0000Z[\u0005\f\u0000\u0000[\\\u0003\b\u0004\u0000\\"+
		"f\u0005\r\u0000\u0000]`\u0003\u0002\u0001\u0000^`\u0003\u0012\t\u0000"+
		"_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000"+
		"\u0000ac\u0003\u0018\f\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000"+
		"\u0000\u0000f_\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000"+
		"jl\u0005\u0018\u0000\u0000kX\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005\u000e\u0000\u0000no\u0005"+
		"\u000f\u0000\u0000op\u0003\u0014\n\u0000pq\u0005\u0010\u0000\u0000q\u0013"+
		"\u0001\u0000\u0000\u0000rv\u0003\b\u0004\u0000sv\u0005\u0006\u0000\u0000"+
		"tv\u0005\u0007\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0005\n\u0000"+
		"\u0000xy\u0003\u0010\b\u0000y}\u0005\n\u0000\u0000z~\u0003\u0002\u0001"+
		"\u0000{~\u0005\u0006\u0000\u0000|~\u0005\u0007\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0015"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0011\u0000\u0000\u0080\u0081"+
		"\u0003\u0016\u000b\u0000\u0081\u0082\u0005\f\u0000\u0000\u0082\u0083\u0003"+
		"\b\u0004\u0000\u0083\u0084\u0005\r\u0000\u0000\u0084\u0085\u0005\u0012"+
		"\u0000\u0000\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0003\b\u0004"+
		"\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u0089\u0005\n\u0000\u0000"+
		"\u0089\u008a\u0005\u0003\u0000\u0000\u008a\u008b\u0003\b\u0004\u0000\u008b"+
		"\u008c\u0005\u0004\u0000\u0000\u008c\u008d\u0005\u0013\u0000\u0000\u008d"+
		"\u008e\u0005\u0005\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0005\u0018\u0000\u0000\u0090\u007f\u0001\u0000\u0000\u0000\u0090"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0017\u0001\u0000\u0000\u0000\u0092"+
		"\u009f\u0005\r\u0000\u0000\u0093\u009f\u0005\u0014\u0000\u0000\u0094\u009f"+
		"\u0005\u0015\u0000\u0000\u0095\u009f\u0005\u0016\u0000\u0000\u0096\u009f"+
		"\u0005\u0017\u0000\u0000\u0097\u009f\u0005\n\u0000\u0000\u0098\u009f\u0005"+
		"\f\u0000\u0000\u0099\u009f\u0005\u0005\u0000\u0000\u009a\u009b\u0005\u0012"+
		"\u0000\u0000\u009b\u009f\u0005\u0013\u0000\u0000\u009c\u009d\u0005\u0003"+
		"\u0000\u0000\u009d\u009f\u0005\u0004\u0000\u0000\u009e\u0092\u0001\u0000"+
		"\u0000\u0000\u009e\u0093\u0001\u0000\u0000\u0000\u009e\u0094\u0001\u0000"+
		"\u0000\u0000\u009e\u0095\u0001\u0000\u0000\u0000\u009e\u0096\u0001\u0000"+
		"\u0000\u0000\u009e\u0097\u0001\u0000\u0000\u0000\u009e\u0098\u0001\u0000"+
		"\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000"+
		"\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u0019\u0001\u0000"+
		"\u0000\u0000\u0011\u001e (39?CSV_dhku}\u0090\u009e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}