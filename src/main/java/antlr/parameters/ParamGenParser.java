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
		T__24=25, T__25=26, T__26=27, T__27=28, LANGLE=29, RANGLE=30, LPAREN=31, 
		RPAREN=32, BOOLEAN=33, NOTNULL=34, NULL=35, NOT=36, ID=37, INT=38, FLOAT=39, 
		STRING=40, CHAR=41, WS=42;
	public static final int
		RULE_templateFile = 0, RULE_constructorSet = 1, RULE_mockSet = 2, RULE_whenSet = 3, 
		RULE_paramSet = 4, RULE_whenSpec = 5, RULE_throwVal = 6, RULE_mockSpec = 7, 
		RULE_conditionExpr = 8, RULE_paramSpec = 9, RULE_paramInput = 10, RULE_expectation = 11, 
		RULE_type = 12, RULE_literal = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"templateFile", "constructorSet", "mockSet", "whenSet", "paramSet", "whenSpec", 
			"throwVal", "mockSpec", "conditionExpr", "paramSpec", "paramInput", "expectation", 
			"type", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CONSTRUCTOR'", "'MOCKING'", "'WHEN_RULES'", "'TEST'", "'METHOD'", 
			"'WHEN'", "'RETURNS'", "'THROW'", "'.'", "'MOCK'", "','", "'PARAM'", 
			"'VALUE'", "'VALUES'", "'EXPECT'", "'EXPECT_EXCEPTION'", "'int'", "'float'", 
			"'double'", "'char'", "'boolean'", "'string'", "'enum'", "'List<'", "'>'", 
			"'Optional<'", "'Map<'", "'Set<'", "'['", "']'", "'('", "')'", null, 
			"'notnull'", "'null'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "LANGLE", "RANGLE", "LPAREN", "RPAREN", 
			"BOOLEAN", "NOTNULL", "NULL", "NOT", "ID", "INT", "FLOAT", "STRING", 
			"CHAR", "WS"
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
		public WhenSetContext whenSet() {
			return getRuleContext(WhenSetContext.class,0);
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(28);
				constructorSet();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(31);
				mockSet();
				}
			}

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(34);
				whenSet();
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(37);
				paramSet();
				}
				}
				setState(42);
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
			setState(43);
			match(T__0);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				paramSpec();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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
			setState(49);
			match(T__1);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				mockSpec();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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
	public static class WhenSetContext extends ParserRuleContext {
		public List<WhenSpecContext> whenSpec() {
			return getRuleContexts(WhenSpecContext.class);
		}
		public WhenSpecContext whenSpec(int i) {
			return getRuleContext(WhenSpecContext.class,i);
		}
		public WhenSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterWhenSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitWhenSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitWhenSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenSetContext whenSet() throws RecognitionException {
		WhenSetContext _localctx = new WhenSetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whenSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__2);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				whenSpec();
				}
				}
				setState(59); 
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
		public List<WhenSpecContext> whenSpec() {
			return getRuleContexts(WhenSpecContext.class);
		}
		public WhenSpecContext whenSpec(int i) {
			return getRuleContext(WhenSpecContext.class,i);
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
		enterRule(_localctx, 8, RULE_paramSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__3);
			setState(62);
			((ParamSetContext)_localctx).testName = match(ID);
			setState(63);
			match(T__4);
			setState(64);
			((ParamSetContext)_localctx).methodName = match(ID);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				paramSpec();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(70);
				whenSpec();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__15) {
				{
				setState(76);
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
	public static class WhenSpecContext extends ParserRuleContext {
		public LiteralContext returnVal;
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public ThrowValContext throwVal() {
			return getRuleContext(ThrowValContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public WhenSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterWhenSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitWhenSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitWhenSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenSpecContext whenSpec() throws RecognitionException {
		WhenSpecContext _localctx = new WhenSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whenSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__5);
			setState(80);
			conditionExpr();
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				{
				setState(81);
				match(T__6);
				setState(82);
				((WhenSpecContext)_localctx).returnVal = literal();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(83);
					match(T__7);
					setState(84);
					throwVal();
					}
				}

				}
				}
				break;
			case T__7:
				{
				{
				setState(87);
				match(T__7);
				setState(88);
				throwVal();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowValContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParamGenParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParamGenParser.ID, i);
		}
		public ThrowValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterThrowVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitThrowVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitThrowVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowValContext throwVal() throws RecognitionException {
		ThrowValContext _localctx = new ThrowValContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_throwVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(92);
				match(T__8);
				setState(93);
				match(ID);
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
		enterRule(_localctx, 14, RULE_mockSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__9);
			setState(97);
			match(ID);
			setState(98);
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
	public static class ConditionExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ParamGenParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ParamGenParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(ParamGenParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParamGenParser.RPAREN, 0); }
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitConditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitConditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(101);
				match(LPAREN);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(102);
					match(ID);
					}
				}

				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(105);
					match(T__10);
					setState(106);
					match(ID);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(RPAREN);
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
		enterRule(_localctx, 18, RULE_paramSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__11);
			setState(116);
			((ParamSpecContext)_localctx).paramType = type(0);
			setState(117);
			((ParamSpecContext)_localctx).paramName = match(ID);
			setState(118);
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
		enterRule(_localctx, 20, RULE_paramInput);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__12);
				setState(121);
				literal();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(T__13);
				setState(123);
				match(LANGLE);
				setState(124);
				literal();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(125);
					match(T__10);
					setState(126);
					literal();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
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
		public TerminalNode LPAREN() { return getToken(ParamGenParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ParamGenParser.RPAREN, 0); }
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
		enterRule(_localctx, 22, RULE_expectation);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__14);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(137);
					match(NOT);
					}
				}

				setState(140);
				literal();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__15);
				setState(142);
				match(ID);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(143);
					match(LPAREN);
					setState(144);
					((ExpectationContext)_localctx).exceptionMessage = match(STRING);
					setState(145);
					match(RPAREN);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(151);
				match(T__16);
				}
				break;
			case T__17:
				{
				setState(152);
				match(T__17);
				}
				break;
			case T__18:
				{
				setState(153);
				match(T__18);
				}
				break;
			case T__19:
				{
				setState(154);
				match(T__19);
				}
				break;
			case T__20:
				{
				setState(155);
				match(T__20);
				}
				break;
			case T__21:
				{
				setState(156);
				match(T__21);
				}
				break;
			case T__22:
				{
				setState(157);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(158);
				match(T__23);
				setState(159);
				type(0);
				setState(160);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(162);
				match(T__25);
				setState(163);
				type(0);
				setState(164);
				match(T__24);
				}
				break;
			case T__26:
				{
				setState(166);
				match(T__26);
				setState(167);
				type(0);
				setState(168);
				match(T__24);
				}
				break;
			case T__27:
				{
				setState(170);
				match(T__27);
				setState(171);
				type(0);
				setState(172);
				match(T__24);
				}
				break;
			case ID:
				{
				setState(174);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(177);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(178);
					match(LANGLE);
					setState(179);
					match(RANGLE);
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4183298146304L) != 0)) ) {
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
		case 12:
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
		"\u0004\u0001*\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0003\u0000\u001e\b\u0000\u0001"+
		"\u0000\u0003\u0000!\b\u0000\u0001\u0000\u0003\u0000$\b\u0000\u0001\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0004\u0001.\b\u0001\u000b\u0001\f\u0001/\u0001\u0002\u0001\u0002\u0004"+
		"\u00024\b\u0002\u000b\u0002\f\u00025\u0001\u0003\u0001\u0003\u0004\u0003"+
		":\b\u0003\u000b\u0003\f\u0003;\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004C\b\u0004\u000b\u0004\f\u0004D\u0001\u0004"+
		"\u0005\u0004H\b\u0004\n\u0004\f\u0004K\t\u0004\u0001\u0004\u0003\u0004"+
		"N\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005V\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"Z\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006_\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003"+
		"\bh\b\b\u0001\b\u0001\b\u0005\bl\b\b\n\b\f\bo\t\b\u0001\b\u0003\br\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0080\b\n\n\n\f\n\u0083\t\n\u0001\n"+
		"\u0001\n\u0003\n\u0087\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u008b\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0093\b\u000b\u0003\u000b\u0095\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b0\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00b5\b\f\n\f\f\f\u00b8\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0000\u0001\u0018\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u0000\u0001\u0002\u0000!#&)\u00ce\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u00041\u0001\u0000"+
		"\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000"+
		"\nO\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000e`\u0001\u0000"+
		"\u0000\u0000\u0010d\u0001\u0000\u0000\u0000\u0012s\u0001\u0000\u0000\u0000"+
		"\u0014\u0086\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000\u0000\u0000"+
		"\u0018\u00af\u0001\u0000\u0000\u0000\u001a\u00b9\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001\u0000"+
		"\u0000\u0000!#\u0001\u0000\u0000\u0000\"$\u0003\u0006\u0003\u0000#\"\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$(\u0001\u0000\u0000\u0000"+
		"%\'\u0003\b\u0004\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0001\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+-\u0005\u0001\u0000\u0000"+
		",.\u0003\u0012\t\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000"+
		"\u0000\u000013\u0005\u0002\u0000\u000024\u0003\u000e\u0007\u000032\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u000079\u0005\u0003"+
		"\u0000\u00008:\u0003\n\u0005\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0007"+
		"\u0001\u0000\u0000\u0000=>\u0005\u0004\u0000\u0000>?\u0005%\u0000\u0000"+
		"?@\u0005\u0005\u0000\u0000@B\u0005%\u0000\u0000AC\u0003\u0012\t\u0000"+
		"BA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EI\u0001\u0000\u0000\u0000FH\u0003\n\u0005"+
		"\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LN\u0003\u0016\u000b\u0000ML\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0005\u0006\u0000"+
		"\u0000PY\u0003\u0010\b\u0000QR\u0005\u0007\u0000\u0000RU\u0003\u001a\r"+
		"\u0000ST\u0005\b\u0000\u0000TV\u0003\f\u0006\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VZ\u0001\u0000\u0000\u0000WX\u0005\b\u0000"+
		"\u0000XZ\u0003\f\u0006\u0000YQ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z\u000b\u0001\u0000\u0000\u0000[^\u0005%\u0000\u0000\\]\u0005\t"+
		"\u0000\u0000]_\u0005%\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_\r\u0001\u0000\u0000\u0000`a\u0005\n\u0000\u0000ab\u0005"+
		"%\u0000\u0000bc\u0005%\u0000\u0000c\u000f\u0001\u0000\u0000\u0000dq\u0005"+
		"%\u0000\u0000eg\u0005\u001f\u0000\u0000fh\u0005%\u0000\u0000gf\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hm\u0001\u0000\u0000\u0000ij\u0005"+
		"\u000b\u0000\u0000jl\u0005%\u0000\u0000ki\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pr\u0005 \u0000\u0000"+
		"qe\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0011\u0001\u0000"+
		"\u0000\u0000st\u0005\f\u0000\u0000tu\u0003\u0018\f\u0000uv\u0005%\u0000"+
		"\u0000vw\u0003\u0014\n\u0000w\u0013\u0001\u0000\u0000\u0000xy\u0005\r"+
		"\u0000\u0000y\u0087\u0003\u001a\r\u0000z{\u0005\u000e\u0000\u0000{|\u0005"+
		"\u001d\u0000\u0000|\u0081\u0003\u001a\r\u0000}~\u0005\u000b\u0000\u0000"+
		"~\u0080\u0003\u001a\r\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0083"+
		"\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u001e\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086x\u0001\u0000\u0000\u0000\u0086z\u0001\u0000"+
		"\u0000\u0000\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u000f"+
		"\u0000\u0000\u0089\u008b\u0005$\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u0095\u0003\u001a\r\u0000\u008d\u008e\u0005\u0010\u0000\u0000"+
		"\u008e\u0092\u0005%\u0000\u0000\u008f\u0090\u0005\u001f\u0000\u0000\u0090"+
		"\u0091\u0005(\u0000\u0000\u0091\u0093\u0005 \u0000\u0000\u0092\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001"+
		"\u0000\u0000\u0000\u0094\u0088\u0001\u0000\u0000\u0000\u0094\u008d\u0001"+
		"\u0000\u0000\u0000\u0095\u0017\u0001\u0000\u0000\u0000\u0096\u0097\u0006"+
		"\f\uffff\uffff\u0000\u0097\u00b0\u0005\u0011\u0000\u0000\u0098\u00b0\u0005"+
		"\u0012\u0000\u0000\u0099\u00b0\u0005\u0013\u0000\u0000\u009a\u00b0\u0005"+
		"\u0014\u0000\u0000\u009b\u00b0\u0005\u0015\u0000\u0000\u009c\u00b0\u0005"+
		"\u0016\u0000\u0000\u009d\u00b0\u0005\u0017\u0000\u0000\u009e\u009f\u0005"+
		"\u0018\u0000\u0000\u009f\u00a0\u0003\u0018\f\u0000\u00a0\u00a1\u0005\u0019"+
		"\u0000\u0000\u00a1\u00b0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u001a"+
		"\u0000\u0000\u00a3\u00a4\u0003\u0018\f\u0000\u00a4\u00a5\u0005\u0019\u0000"+
		"\u0000\u00a5\u00b0\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u001b\u0000"+
		"\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9\u0005\u0019\u0000\u0000"+
		"\u00a9\u00b0\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u001c\u0000\u0000"+
		"\u00ab\u00ac\u0003\u0018\f\u0000\u00ac\u00ad\u0005\u0019\u0000\u0000\u00ad"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005%\u0000\u0000\u00af\u0096"+
		"\u0001\u0000\u0000\u0000\u00af\u0098\u0001\u0000\u0000\u0000\u00af\u0099"+
		"\u0001\u0000\u0000\u0000\u00af\u009a\u0001\u0000\u0000\u0000\u00af\u009b"+
		"\u0001\u0000\u0000\u0000\u00af\u009c\u0001\u0000\u0000\u0000\u00af\u009d"+
		"\u0001\u0000\u0000\u0000\u00af\u009e\u0001\u0000\u0000\u0000\u00af\u00a2"+
		"\u0001\u0000\u0000\u0000\u00af\u00a6\u0001\u0000\u0000\u0000\u00af\u00aa"+
		"\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\n\u0001\u0000\u0000\u00b2\u00b3\u0005"+
		"\u001d\u0000\u0000\u00b3\u00b5\u0005\u001e\u0000\u0000\u00b4\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u0019\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007"+
		"\u0000\u0000\u0000\u00ba\u001b\u0001\u0000\u0000\u0000\u0017\u001d #("+
		"/5;DIMUY^gmq\u0081\u0086\u008a\u0092\u0094\u00af\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}