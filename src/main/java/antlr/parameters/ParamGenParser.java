// Generated from C:/Users/User/Documents/GitHub/UnitTestGenerator/UnitTest/src/main/java/antlr/parameters/ParamGen.g4 by ANTLR 4.13.2
package antlr.parameters;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParamGenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, LANGLE=26, RANGLE=27, BOOLEAN=28, NOTNULL=29, NULL=30, NOT=31, 
		ID=32, INT=33, FLOAT=34, STRING=35, CHAR=36, WS=37;
	public static final int
		RULE_templateFile = 0, RULE_constructorSet = 1, RULE_mockSet = 2, RULE_paramSet = 3, 
		RULE_mockSpec = 4, RULE_paramSpec = 5, RULE_paramInput = 6, RULE_expectation = 7, 
		RULE_type = 8, RULE_literal = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"templateFile", "constructorSet", "mockSet", "paramSet", "mockSpec", 
			"paramSpec", "paramInput", "expectation", "type", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CONSTRUCTOR'", "'MOCKING'", "'TEST'", "'METHOD'", "'MOCK'", "'PARAM'", 
			"'VALUE'", "'VALUES'", "','", "'EXPECT'", "'EXPECT_EXCEPTION'", "'('", 
			"')'", "'int'", "'float'", "'double'", "'char'", "'boolean'", "'string'", 
			"'enum'", "'List<'", "'>'", "'Optional<'", "'Map<'", "'Set<'", "'['", 
			"']'", null, "'notnull'", "'null'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "LANGLE", "RANGLE", "BOOLEAN", "NOTNULL", "NULL", "NOT", 
			"ID", "INT", "FLOAT", "STRING", "CHAR", "WS"
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
	public String getGrammarFileName() { return "ParamGen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParamGenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateFileContext extends ParserRuleContext {
		public ConstructorSetContext constructorSet() {
			return getRuleContext(ConstructorSetContext.class,0);
		}
		public MockSetContext mockSet() {
			return getRuleContext(MockSetContext.class,0);
		}
		public List<ParamSetContext> paramSet() {
			return getRuleContexts(ParamSetContext.class);
		}
		public ParamSetContext paramSet(int i) {
			return getRuleContext(ParamSetContext.class,i);
		}
		public TemplateFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterTemplateFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitTemplateFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitTemplateFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateFileContext templateFile() throws RecognitionException {
		TemplateFileContext _localctx = new TemplateFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_templateFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(20);
				constructorSet();
				}
			}

			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(23);
				mockSet();
				}
			}

			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(26);
				paramSet();
				}
				}
				setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorSetContext extends ParserRuleContext {
		public List<ParamSpecContext> paramSpec() {
			return getRuleContexts(ParamSpecContext.class);
		}
		public ParamSpecContext paramSpec(int i) {
			return getRuleContext(ParamSpecContext.class,i);
		}
		public ConstructorSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterConstructorSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitConstructorSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitConstructorSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorSetContext constructorSet() throws RecognitionException {
		ConstructorSetContext _localctx = new ConstructorSetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constructorSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				paramSpec();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class MockSetContext extends ParserRuleContext {
		public List<MockSpecContext> mockSpec() {
			return getRuleContexts(MockSpecContext.class);
		}
		public MockSpecContext mockSpec(int i) {
			return getRuleContext(MockSpecContext.class,i);
		}
		public MockSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mockSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterMockSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitMockSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitMockSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MockSetContext mockSet() throws RecognitionException {
		MockSetContext _localctx = new MockSetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mockSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__1);
			setState(40); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				mockSpec();
				}
				}
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamSetContext extends ParserRuleContext {
		public Token testName;
		public Token methodName;
		public List<TerminalNode> ID() { return getTokens(ParamGenParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParamGenParser.ID, i);
		}
		public List<ParamSpecContext> paramSpec() {
			return getRuleContexts(ParamSpecContext.class);
		}
		public ParamSpecContext paramSpec(int i) {
			return getRuleContext(ParamSpecContext.class,i);
		}
		public ExpectationContext expectation() {
			return getRuleContext(ExpectationContext.class,0);
		}
		public ParamSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterParamSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitParamSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitParamSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamSetContext paramSet() throws RecognitionException {
		ParamSetContext _localctx = new ParamSetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_paramSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			((ParamSetContext)_localctx).testName = match(ID);
			setState(46);
			match(T__3);
			setState(47);
			((ParamSetContext)_localctx).methodName = match(ID);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				paramSpec();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(53);
				expectation();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MockSpecContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParamGenParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParamGenParser.ID, i);
		}
		public MockSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mockSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterMockSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitMockSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitMockSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MockSpecContext mockSpec() throws RecognitionException {
		MockSpecContext _localctx = new MockSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mockSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__4);
			setState(57);
			match(ID);
			setState(58);
			match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamSpecContext extends ParserRuleContext {
		public TypeContext paramType;
		public Token paramName;
		public ParamInputContext paramInput() {
			return getRuleContext(ParamInputContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParamGenParser.ID, 0); }
		public ParamSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterParamSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitParamSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitParamSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamSpecContext paramSpec() throws RecognitionException {
		ParamSpecContext _localctx = new ParamSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_paramSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			((ParamSpecContext)_localctx).paramType = type(0);
			setState(62);
			((ParamSpecContext)_localctx).paramName = match(ID);
			setState(63);
			paramInput();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamInputContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode LANGLE() { return getToken(ParamGenParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(ParamGenParser.RANGLE, 0); }
		public ParamInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterParamInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitParamInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitParamInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamInputContext paramInput() throws RecognitionException {
		ParamInputContext _localctx = new ParamInputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_paramInput);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(T__6);
				setState(66);
				literal();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__7);
				setState(68);
				match(LANGLE);
				setState(69);
				literal();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(70);
					match(T__8);
					setState(71);
					literal();
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(RANGLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpectationContext extends ParserRuleContext {
		public Token exceptionMessage;
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ParamGenParser.NOT, 0); }
		public TerminalNode ID() { return getToken(ParamGenParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ParamGenParser.STRING, 0); }
		public ExpectationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expectation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterExpectation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitExpectation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitExpectation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpectationContext expectation() throws RecognitionException {
		ExpectationContext _localctx = new ExpectationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expectation);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__9);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(82);
					match(NOT);
					}
				}

				setState(85);
				literal();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__10);
				setState(87);
				match(ID);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(88);
					match(T__11);
					setState(89);
					((ExpectationContext)_localctx).exceptionMessage = match(STRING);
					setState(90);
					match(T__12);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParamGenParser.ID, 0); }
		public TerminalNode LANGLE() { return getToken(ParamGenParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(ParamGenParser.RANGLE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(96);
				match(T__13);
				}
				break;
			case T__14:
				{
				setState(97);
				match(T__14);
				}
				break;
			case T__15:
				{
				setState(98);
				match(T__15);
				}
				break;
			case T__16:
				{
				setState(99);
				match(T__16);
				}
				break;
			case T__17:
				{
				setState(100);
				match(T__17);
				}
				break;
			case T__18:
				{
				setState(101);
				match(T__18);
				}
				break;
			case T__19:
				{
				setState(102);
				match(T__19);
				}
				break;
			case T__20:
				{
				setState(103);
				match(T__20);
				setState(104);
				type(0);
				setState(105);
				match(T__21);
				}
				break;
			case T__22:
				{
				setState(107);
				match(T__22);
				setState(108);
				type(0);
				setState(109);
				match(T__21);
				}
				break;
			case T__23:
				{
				setState(111);
				match(T__23);
				setState(112);
				type(0);
				setState(113);
				match(T__21);
				}
				break;
			case T__24:
				{
				setState(115);
				match(T__24);
				setState(116);
				type(0);
				setState(117);
				match(T__21);
				}
				break;
			case ID:
				{
				setState(119);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(122);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(123);
					match(LANGLE);
					setState(124);
					match(RANGLE);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ParamGenParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(ParamGenParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ParamGenParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(ParamGenParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(ParamGenParser.CHAR, 0); }
		public TerminalNode NOTNULL() { return getToken(ParamGenParser.NOTNULL, 0); }
		public TerminalNode NULL() { return getToken(ParamGenParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 130728067072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		case 8:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0003\u0000\u0016\b\u0000\u0001"+
		"\u0000\u0003\u0000\u0019\b\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000"+
		"\n\u0000\f\u0000\u001f\t\u0000\u0001\u0001\u0001\u0001\u0004\u0001#\b"+
		"\u0001\u000b\u0001\f\u0001$\u0001\u0002\u0001\u0002\u0004\u0002)\b\u0002"+
		"\u000b\u0002\f\u0002*\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0004\u00032\b\u0003\u000b\u0003\f\u00033\u0001\u0003\u0003"+
		"\u00037\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006I\b\u0006\n\u0006\f\u0006L\t\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006P\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007T\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\\\b\u0007\u0003\u0007^\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\by\b\b\u0001\b\u0001\b\u0001\b\u0005\b~\b\b\n"+
		"\b\f\b\u0081\t\b\u0001\t\u0001\t\u0001\t\u0000\u0001\u0010\n\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0000\u0001\u0002\u0000\u001c\u001e"+
		"!$\u0092\u0000\u0015\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000"+
		"\u0000\u0004&\u0001\u0000\u0000\u0000\u0006,\u0001\u0000\u0000\u0000\b"+
		"8\u0001\u0000\u0000\u0000\n<\u0001\u0000\u0000\u0000\fO\u0001\u0000\u0000"+
		"\u0000\u000e]\u0001\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012"+
		"\u0082\u0001\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015"+
		"\u0014\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0001\u0000\u0000\u0000\u0017\u0019\u0003\u0004\u0002\u0000\u0018"+
		"\u0017\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u001d\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0006\u0003\u0000\u001b"+
		"\u001a\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d"+
		"\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e"+
		"\u0001\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 \""+
		"\u0005\u0001\u0000\u0000!#\u0003\n\u0005\u0000\"!\u0001\u0000\u0000\u0000"+
		"#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%\u0003\u0001\u0000\u0000\u0000&(\u0005\u0002\u0000\u0000\')\u0003"+
		"\b\u0004\u0000(\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*("+
		"\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0005\u0001\u0000"+
		"\u0000\u0000,-\u0005\u0003\u0000\u0000-.\u0005 \u0000\u0000./\u0005\u0004"+
		"\u0000\u0000/1\u0005 \u0000\u000002\u0003\n\u0005\u000010\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000046\u0001\u0000\u0000\u000057\u0003\u000e\u0007\u0000"+
		"65\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0007\u0001\u0000"+
		"\u0000\u000089\u0005\u0005\u0000\u00009:\u0005 \u0000\u0000:;\u0005 \u0000"+
		"\u0000;\t\u0001\u0000\u0000\u0000<=\u0005\u0006\u0000\u0000=>\u0003\u0010"+
		"\b\u0000>?\u0005 \u0000\u0000?@\u0003\f\u0006\u0000@\u000b\u0001\u0000"+
		"\u0000\u0000AB\u0005\u0007\u0000\u0000BP\u0003\u0012\t\u0000CD\u0005\b"+
		"\u0000\u0000DE\u0005\u001a\u0000\u0000EJ\u0003\u0012\t\u0000FG\u0005\t"+
		"\u0000\u0000GI\u0003\u0012\t\u0000HF\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001"+
		"\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u001b\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000OA\u0001\u0000\u0000\u0000OC\u0001\u0000\u0000"+
		"\u0000P\r\u0001\u0000\u0000\u0000QS\u0005\n\u0000\u0000RT\u0005\u001f"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000U^\u0003\u0012\t\u0000VW\u0005\u000b\u0000\u0000W[\u0005"+
		" \u0000\u0000XY\u0005\f\u0000\u0000YZ\u0005#\u0000\u0000Z\\\u0005\r\u0000"+
		"\u0000[X\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000"+
		"\u0000\u0000]Q\u0001\u0000\u0000\u0000]V\u0001\u0000\u0000\u0000^\u000f"+
		"\u0001\u0000\u0000\u0000_`\u0006\b\uffff\uffff\u0000`y\u0005\u000e\u0000"+
		"\u0000ay\u0005\u000f\u0000\u0000by\u0005\u0010\u0000\u0000cy\u0005\u0011"+
		"\u0000\u0000dy\u0005\u0012\u0000\u0000ey\u0005\u0013\u0000\u0000fy\u0005"+
		"\u0014\u0000\u0000gh\u0005\u0015\u0000\u0000hi\u0003\u0010\b\u0000ij\u0005"+
		"\u0016\u0000\u0000jy\u0001\u0000\u0000\u0000kl\u0005\u0017\u0000\u0000"+
		"lm\u0003\u0010\b\u0000mn\u0005\u0016\u0000\u0000ny\u0001\u0000\u0000\u0000"+
		"op\u0005\u0018\u0000\u0000pq\u0003\u0010\b\u0000qr\u0005\u0016\u0000\u0000"+
		"ry\u0001\u0000\u0000\u0000st\u0005\u0019\u0000\u0000tu\u0003\u0010\b\u0000"+
		"uv\u0005\u0016\u0000\u0000vy\u0001\u0000\u0000\u0000wy\u0005 \u0000\u0000"+
		"x_\u0001\u0000\u0000\u0000xa\u0001\u0000\u0000\u0000xb\u0001\u0000\u0000"+
		"\u0000xc\u0001\u0000\u0000\u0000xd\u0001\u0000\u0000\u0000xe\u0001\u0000"+
		"\u0000\u0000xf\u0001\u0000\u0000\u0000xg\u0001\u0000\u0000\u0000xk\u0001"+
		"\u0000\u0000\u0000xo\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000"+
		"xw\u0001\u0000\u0000\u0000y\u007f\u0001\u0000\u0000\u0000z{\n\u0001\u0000"+
		"\u0000{|\u0005\u001a\u0000\u0000|~\u0005\u001b\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0011\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0007\u0000\u0000\u0000"+
		"\u0083\u0013\u0001\u0000\u0000\u0000\u000e\u0015\u0018\u001d$*36JOS[]"+
		"x\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}