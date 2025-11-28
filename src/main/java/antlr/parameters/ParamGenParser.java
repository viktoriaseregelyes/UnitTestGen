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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, LANGLE=34, RANGLE=35, LCURLY=36, RCURLY=37, LPAREN=38, 
		RPAREN=39, BOOLEAN=40, NOTNULL=41, NULL=42, NOT=43, ID=44, INT=45, FLOAT=46, 
		STRING=47, CHAR=48, BYTE=49, WS=50;
	public static final int
		RULE_templateFile = 0, RULE_constructorSet = 1, RULE_mockSet = 2, RULE_whenSet = 3, 
		RULE_paramSet = 4, RULE_variationSpec = 5, RULE_varFor = 6, RULE_varInput = 7, 
		RULE_whenSpec = 8, RULE_throwVal = 9, RULE_mockSpec = 10, RULE_conditionExpr = 11, 
		RULE_paramSpec = 12, RULE_paramInput = 13, RULE_expectation = 14, RULE_expectArray = 15, 
		RULE_expectFor = 16, RULE_expectInput = 17, RULE_type = 18, RULE_literal = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"templateFile", "constructorSet", "mockSet", "whenSet", "paramSet", "variationSpec", 
			"varFor", "varInput", "whenSpec", "throwVal", "mockSpec", "conditionExpr", 
			"paramSpec", "paramInput", "expectation", "expectArray", "expectFor", 
			"expectInput", "type", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CONSTRUCTOR'", "'MOCKING'", "'WHEN_RULES'", "'TEST'", "'REPEAT'", 
			"'METHOD'", "'VARIATION'", "'VALUES'", "'FOR'", "'TO'", "','", "'WHEN'", 
			"'RETURNS'", "'THROW'", "'.'", "'MOCK'", "'PARAM'", "'VALUE'", "'EXPECT'", 
			"'EXPECT_EXCEPTION'", "'int'", "'float'", "'double'", "'char'", "'boolean'", 
			"'string'", "'enum'", "'byte'", "'List<'", "'>'", "'Optional<'", "'Map<'", 
			"'Set<'", "'['", "']'", "'{'", "'}'", "'('", "')'", null, "'notnull'", 
			"'null'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "LANGLE", 
			"RANGLE", "LCURLY", "RCURLY", "LPAREN", "RPAREN", "BOOLEAN", "NOTNULL", 
			"NULL", "NOT", "ID", "INT", "FLOAT", "STRING", "CHAR", "BYTE", "WS"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(40);
				constructorSet();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(43);
				mockSet();
				}
			}

			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(46);
				whenSet();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(49);
				paramSet();
				}
				}
				setState(54);
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
			setState(55);
			match(T__0);
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				paramSpec();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
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
			setState(61);
			match(T__1);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				mockSpec();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
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
			setState(67);
			match(T__2);
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				whenSpec();
				}
				}
				setState(71); 
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
	public static class ParamSetContext extends ParserRuleContext {
		public Token testName;
		public Token repeatTimes;
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
		public List<VariationSpecContext> variationSpec() {
			return getRuleContexts(VariationSpecContext.class);
		}
		public VariationSpecContext variationSpec(int i) {
			return getRuleContext(VariationSpecContext.class,i);
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
		public TerminalNode INT() { return getToken(ParamGenParser.INT, 0); }
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
			setState(73);
			match(T__3);
			setState(74);
			((ParamSetContext)_localctx).testName = match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(75);
				match(T__4);
				setState(76);
				((ParamSetContext)_localctx).repeatTimes = match(INT);
				}
			}

			setState(79);
			match(T__5);
			setState(80);
			((ParamSetContext)_localctx).methodName = match(ID);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(81);
				paramSpec();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(87);
				variationSpec();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(93);
				whenSpec();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__19) {
				{
				setState(99);
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
	public static class VariationSpecContext extends ParserRuleContext {
		public TypeContext varType;
		public Token varName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParamGenParser.ID, 0); }
		public VarInputContext varInput() {
			return getRuleContext(VarInputContext.class,0);
		}
		public VarForContext varFor() {
			return getRuleContext(VarForContext.class,0);
		}
		public VariationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterVariationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitVariationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitVariationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariationSpecContext variationSpec() throws RecognitionException {
		VariationSpecContext _localctx = new VariationSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__6);
			setState(103);
			((VariationSpecContext)_localctx).varType = type(0);
			setState(104);
			((VariationSpecContext)_localctx).varName = match(ID);
			setState(105);
			match(T__7);
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				{
				setState(106);
				varInput();
				}
				break;
			case T__8:
				{
				setState(107);
				varFor();
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
	public static class VarForContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ParamGenParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParamGenParser.INT, i);
		}
		public VarForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterVarFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitVarFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitVarFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarForContext varFor() throws RecognitionException {
		VarForContext _localctx = new VarForContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__8);
			setState(111);
			match(INT);
			setState(112);
			match(T__9);
			setState(113);
			match(INT);
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
	public static class VarInputContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(ParamGenParser.LANGLE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(ParamGenParser.RANGLE, 0); }
		public VarInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterVarInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitVarInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitVarInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarInputContext varInput() throws RecognitionException {
		VarInputContext _localctx = new VarInputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LANGLE);
			setState(116);
			literal();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(117);
				match(T__10);
				setState(118);
				literal();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(RANGLE);
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
		enterRule(_localctx, 16, RULE_whenSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__11);
			setState(127);
			conditionExpr();
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				{
				setState(128);
				match(T__12);
				setState(129);
				((WhenSpecContext)_localctx).returnVal = literal();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(130);
					match(T__13);
					setState(131);
					throwVal();
					}
				}

				}
				}
				break;
			case T__13:
				{
				{
				setState(134);
				match(T__13);
				setState(135);
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
		enterRule(_localctx, 18, RULE_throwVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(139);
				match(T__14);
				setState(140);
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
		enterRule(_localctx, 20, RULE_mockSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__15);
			setState(144);
			match(ID);
			setState(145);
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
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParamGenParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(ParamGenParser.NOT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(ParamGenParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(ParamGenParser.RCURLY, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_conditionExpr);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(LPAREN);
				setState(150);
				conditionExpr();
				setState(151);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(NOT);
				setState(154);
				conditionExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				type(0);
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(156);
					conditionExpr();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(T__14);
				setState(160);
				conditionExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				match(LCURLY);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(162);
					match(ID);
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(163);
						match(T__10);
						setState(164);
						match(ID);
						}
						}
						setState(169);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(172);
				match(RCURLY);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				literal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamSpecContext extends ParserRuleContext {
		public TypeContext paramType;
		public Token paramName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamInputContext paramInput() {
			return getRuleContext(ParamInputContext.class,0);
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
		enterRule(_localctx, 24, RULE_paramSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__16);
			setState(177);
			((ParamSpecContext)_localctx).paramType = type(0);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(178);
				((ParamSpecContext)_localctx).paramName = match(ID);
				setState(179);
				paramInput();
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
		enterRule(_localctx, 26, RULE_paramInput);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(T__17);
				setState(183);
				literal();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__7);
				setState(185);
				match(LANGLE);
				setState(186);
				literal();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(187);
					match(T__10);
					setState(188);
					literal();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(194);
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
		public ExpectInputContext expectInput() {
			return getRuleContext(ExpectInputContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpectForContext expectFor() {
			return getRuleContext(ExpectForContext.class,0);
		}
		public ExpectArrayContext expectArray() {
			return getRuleContext(ExpectArrayContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_expectation);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(T__18);
				setState(203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(199);
					expectInput();
					}
					break;
				case 2:
					{
					setState(200);
					literal();
					}
					break;
				case 3:
					{
					setState(201);
					expectFor();
					}
					break;
				case 4:
					{
					setState(202);
					expectArray();
					}
					break;
				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__19);
				setState(206);
				match(ID);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(207);
					match(LPAREN);
					setState(208);
					((ExpectationContext)_localctx).exceptionMessage = match(STRING);
					setState(209);
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
	public static class ExpectArrayContext extends ParserRuleContext {
		public TypeContext expectType;
		public ExpectInputContext expectInput() {
			return getRuleContext(ExpectInputContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpectArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expectArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterExpectArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitExpectArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitExpectArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpectArrayContext expectArray() throws RecognitionException {
		ExpectArrayContext _localctx = new ExpectArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expectArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((ExpectArrayContext)_localctx).expectType = type(0);
			setState(215);
			expectInput();
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
	public static class ExpectForContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ParamGenParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ParamGenParser.INT, i);
		}
		public ExpectForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expectFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterExpectFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitExpectFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitExpectFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpectForContext expectFor() throws RecognitionException {
		ExpectForContext _localctx = new ExpectForContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expectFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__8);
			setState(218);
			match(INT);
			setState(219);
			match(T__9);
			setState(220);
			match(INT);
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
	public static class ExpectInputContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(ParamGenParser.LANGLE, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(ParamGenParser.RANGLE, 0); }
		public ExpectInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expectInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).enterExpectInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParamGenListener ) ((ParamGenListener)listener).exitExpectInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParamGenVisitor ) return ((ParamGenVisitor<? extends T>)visitor).visitExpectInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpectInputContext expectInput() throws RecognitionException {
		ExpectInputContext _localctx = new ExpectInputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expectInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LANGLE);
			setState(223);
			literal();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(224);
				match(T__10);
				setState(225);
				literal();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(RANGLE);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(234);
				match(T__20);
				}
				break;
			case T__21:
				{
				setState(235);
				match(T__21);
				}
				break;
			case T__22:
				{
				setState(236);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(237);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(238);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(239);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(240);
				match(T__26);
				}
				break;
			case T__27:
				{
				setState(241);
				match(T__27);
				}
				break;
			case T__28:
				{
				setState(242);
				match(T__28);
				setState(243);
				type(0);
				setState(244);
				match(T__29);
				}
				break;
			case T__30:
				{
				setState(246);
				match(T__30);
				setState(247);
				type(0);
				setState(248);
				match(T__29);
				}
				break;
			case T__31:
				{
				setState(250);
				match(T__31);
				setState(251);
				type(0);
				setState(252);
				match(T__29);
				}
				break;
			case T__32:
				{
				setState(254);
				match(T__32);
				setState(255);
				type(0);
				setState(256);
				match(T__29);
				}
				break;
			case ID:
				{
				setState(258);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(261);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(262);
					match(LANGLE);
					setState(263);
					match(RANGLE);
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public TerminalNode BYTE() { return getToken(ParamGenParser.BYTE, 0); }
		public TerminalNode LPAREN() { return getToken(ParamGenParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ParamGenParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(ParamGenParser.ID, 0); }
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
		enterRule(_localctx, 38, RULE_literal);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(FLOAT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(BOOLEAN);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(STRING);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(CHAR);
				}
				break;
			case NOTNULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(NOTNULL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				match(NULL);
				}
				break;
			case BYTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				match(BYTE);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				match(LPAREN);
				setState(278);
				type(0);
				setState(279);
				match(RPAREN);
				setState(280);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
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
		"\u0004\u00012\u011e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0003\u0000*\b\u0000\u0001\u0000"+
		"\u0003\u0000-\b\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000\u0005"+
		"\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0001\u0001\u0001\u0004"+
		"\u0001:\b\u0001\u000b\u0001\f\u0001;\u0001\u0002\u0001\u0002\u0004\u0002"+
		"@\b\u0002\u000b\u0002\f\u0002A\u0001\u0003\u0001\u0003\u0004\u0003F\b"+
		"\u0003\u000b\u0003\f\u0003G\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001\u0004\u0005\u0004Y\b\u0004"+
		"\n\u0004\f\u0004\\\t\u0004\u0001\u0004\u0005\u0004_\b\u0004\n\u0004\f"+
		"\u0004b\t\u0004\u0001\u0004\u0003\u0004e\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005m\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007x\b\u0007\n\u0007\f\u0007"+
		"{\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0085\b\b\u0001\b\u0001\b\u0003\b\u0089\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u008e\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009e\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00a6\b\u000b\n\u000b\f\u000b\u00a9\t\u000b\u0003\u000b\u00ab\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00af\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00b5\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00be\b\r\n\r\f\r\u00c1\t\r\u0001\r\u0001\r"+
		"\u0003\r\u00c5\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00cc\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00d3\b\u000e\u0003\u000e\u00d5\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00e3\b\u0011\n\u0011\f\u0011\u00e6\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0104\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0109\b\u0012\n\u0012\f\u0012\u010c\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u011c\b\u0013\u0001\u0013\u0000\u0001"+
		"$\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0000\u0143\u0000)\u0001\u0000\u0000\u0000"+
		"\u00027\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006C"+
		"\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000"+
		"\u0000\fn\u0001\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010"+
		"~\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u008f"+
		"\u0001\u0000\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018\u00b0"+
		"\u0001\u0000\u0000\u0000\u001a\u00c4\u0001\u0000\u0000\u0000\u001c\u00d4"+
		"\u0001\u0000\u0000\u0000\u001e\u00d6\u0001\u0000\u0000\u0000 \u00d9\u0001"+
		"\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000\u0000$\u0103\u0001\u0000"+
		"\u0000\u0000&\u011b\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000"+
		")(\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000"+
		"\u0000+-\u0003\u0004\u0002\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-/\u0001\u0000\u0000\u0000.0\u0003\u0006\u0003\u0000/.\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000004\u0001\u0000\u0000\u0000"+
		"13\u0003\b\u0004\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0001\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000079\u0005\u0001\u0000\u00008:\u0003"+
		"\u0018\f\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0003\u0001\u0000\u0000"+
		"\u0000=?\u0005\u0002\u0000\u0000>@\u0003\u0014\n\u0000?>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000"+
		"\u0000\u0000B\u0005\u0001\u0000\u0000\u0000CE\u0005\u0003\u0000\u0000"+
		"DF\u0003\u0010\b\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0007\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u0004\u0000\u0000JM\u0005,\u0000\u0000KL\u0005\u0005"+
		"\u0000\u0000LN\u0005-\u0000\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u0006\u0000\u0000PT\u0005"+
		",\u0000\u0000QS\u0003\u0018\f\u0000RQ\u0001\u0000\u0000\u0000SV\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UZ\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0003\n\u0005\u0000"+
		"XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[`\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]_\u0003\u0010\b\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000"+
		"\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0003\u001c\u000e\u0000"+
		"dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000"+
		"\u0000fg\u0005\u0007\u0000\u0000gh\u0003$\u0012\u0000hi\u0005,\u0000\u0000"+
		"il\u0005\b\u0000\u0000jm\u0003\u000e\u0007\u0000km\u0003\f\u0006\u0000"+
		"lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u000b\u0001\u0000"+
		"\u0000\u0000no\u0005\t\u0000\u0000op\u0005-\u0000\u0000pq\u0005\n\u0000"+
		"\u0000qr\u0005-\u0000\u0000r\r\u0001\u0000\u0000\u0000st\u0005\"\u0000"+
		"\u0000ty\u0003&\u0013\u0000uv\u0005\u000b\u0000\u0000vx\u0003&\u0013\u0000"+
		"wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|}\u0005#\u0000\u0000}\u000f\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\f\u0000\u0000\u007f\u0088\u0003\u0016\u000b\u0000\u0080\u0081\u0005"+
		"\r\u0000\u0000\u0081\u0084\u0003&\u0013\u0000\u0082\u0083\u0005\u000e"+
		"\u0000\u0000\u0083\u0085\u0003\u0012\t\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0089\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087\u0089\u0003\u0012\t\u0000"+
		"\u0088\u0080\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000"+
		"\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008d\u0005,\u0000\u0000\u008b"+
		"\u008c\u0005\u000f\u0000\u0000\u008c\u008e\u0005,\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0013"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0010\u0000\u0000\u0090\u0091"+
		"\u0005,\u0000\u0000\u0091\u0092\u0005,\u0000\u0000\u0092\u0015\u0001\u0000"+
		"\u0000\u0000\u0093\u00af\u0001\u0000\u0000\u0000\u0094\u00af\u0005,\u0000"+
		"\u0000\u0095\u0096\u0005&\u0000\u0000\u0096\u0097\u0003\u0016\u000b\u0000"+
		"\u0097\u0098\u0005\'\u0000\u0000\u0098\u00af\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005+\u0000\u0000\u009a\u00af\u0003\u0016\u000b\u0000\u009b\u009d"+
		"\u0003$\u0012\u0000\u009c\u009e\u0003\u0016\u000b\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00af\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u00af\u0003"+
		"\u0016\u000b\u0000\u00a1\u00aa\u0005$\u0000\u0000\u00a2\u00a7\u0005,\u0000"+
		"\u0000\u00a3\u00a4\u0005\u000b\u0000\u0000\u00a4\u00a6\u0005,\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a2\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00af\u0005%\u0000\u0000\u00ad"+
		"\u00af\u0003&\u0013\u0000\u00ae\u0093\u0001\u0000\u0000\u0000\u00ae\u0094"+
		"\u0001\u0000\u0000\u0000\u00ae\u0095\u0001\u0000\u0000\u0000\u00ae\u0099"+
		"\u0001\u0000\u0000\u0000\u00ae\u009b\u0001\u0000\u0000\u0000\u00ae\u009f"+
		"\u0001\u0000\u0000\u0000\u00ae\u00a1\u0001\u0000\u0000\u0000\u00ae\u00ad"+
		"\u0001\u0000\u0000\u0000\u00af\u0017\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0011\u0000\u0000\u00b1\u00b4\u0003$\u0012\u0000\u00b2\u00b3\u0005"+
		",\u0000\u0000\u00b3\u00b5\u0003\u001a\r\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0019\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0012\u0000\u0000\u00b7\u00c5\u0003&\u0013"+
		"\u0000\u00b8\u00b9\u0005\b\u0000\u0000\u00b9\u00ba\u0005\"\u0000\u0000"+
		"\u00ba\u00bf\u0003&\u0013\u0000\u00bb\u00bc\u0005\u000b\u0000\u0000\u00bc"+
		"\u00be\u0003&\u0013\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00c1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005#\u0000\u0000\u00c3\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c4\u00b6\u0001\u0000\u0000\u0000\u00c4\u00b8\u0001"+
		"\u0000\u0000\u0000\u00c5\u001b\u0001\u0000\u0000\u0000\u00c6\u00cb\u0005"+
		"\u0013\u0000\u0000\u00c7\u00cc\u0003\"\u0011\u0000\u00c8\u00cc\u0003&"+
		"\u0013\u0000\u00c9\u00cc\u0003 \u0010\u0000\u00ca\u00cc\u0003\u001e\u000f"+
		"\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000\u0000"+
		"\u0000\u00cc\u00d5\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0014\u0000"+
		"\u0000\u00ce\u00d2\u0005,\u0000\u0000\u00cf\u00d0\u0005&\u0000\u0000\u00d0"+
		"\u00d1\u0005/\u0000\u0000\u00d1\u00d3\u0005\'\u0000\u0000\u00d2\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d4\u00c6\u0001\u0000\u0000\u0000\u00d4\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d5\u001d\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0003$\u0012\u0000\u00d7\u00d8\u0003\"\u0011\u0000\u00d8\u001f\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\t\u0000\u0000\u00da\u00db\u0005-"+
		"\u0000\u0000\u00db\u00dc\u0005\n\u0000\u0000\u00dc\u00dd\u0005-\u0000"+
		"\u0000\u00dd!\u0001\u0000\u0000\u0000\u00de\u00df\u0005\"\u0000\u0000"+
		"\u00df\u00e4\u0003&\u0013\u0000\u00e0\u00e1\u0005\u000b\u0000\u0000\u00e1"+
		"\u00e3\u0003&\u0013\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005#\u0000\u0000\u00e8#\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0006\u0012\uffff\uffff\u0000\u00ea\u0104\u0005"+
		"\u0015\u0000\u0000\u00eb\u0104\u0005\u0016\u0000\u0000\u00ec\u0104\u0005"+
		"\u0017\u0000\u0000\u00ed\u0104\u0005\u0018\u0000\u0000\u00ee\u0104\u0005"+
		"\u0019\u0000\u0000\u00ef\u0104\u0005\u001a\u0000\u0000\u00f0\u0104\u0005"+
		"\u001b\u0000\u0000\u00f1\u0104\u0005\u001c\u0000\u0000\u00f2\u00f3\u0005"+
		"\u001d\u0000\u0000\u00f3\u00f4\u0003$\u0012\u0000\u00f4\u00f5\u0005\u001e"+
		"\u0000\u0000\u00f5\u0104\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u001f"+
		"\u0000\u0000\u00f7\u00f8\u0003$\u0012\u0000\u00f8\u00f9\u0005\u001e\u0000"+
		"\u0000\u00f9\u0104\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005 \u0000\u0000"+
		"\u00fb\u00fc\u0003$\u0012\u0000\u00fc\u00fd\u0005\u001e\u0000\u0000\u00fd"+
		"\u0104\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005!\u0000\u0000\u00ff\u0100"+
		"\u0003$\u0012\u0000\u0100\u0101\u0005\u001e\u0000\u0000\u0101\u0104\u0001"+
		"\u0000\u0000\u0000\u0102\u0104\u0005,\u0000\u0000\u0103\u00e9\u0001\u0000"+
		"\u0000\u0000\u0103\u00eb\u0001\u0000\u0000\u0000\u0103\u00ec\u0001\u0000"+
		"\u0000\u0000\u0103\u00ed\u0001\u0000\u0000\u0000\u0103\u00ee\u0001\u0000"+
		"\u0000\u0000\u0103\u00ef\u0001\u0000\u0000\u0000\u0103\u00f0\u0001\u0000"+
		"\u0000\u0000\u0103\u00f1\u0001\u0000\u0000\u0000\u0103\u00f2\u0001\u0000"+
		"\u0000\u0000\u0103\u00f6\u0001\u0000\u0000\u0000\u0103\u00fa\u0001\u0000"+
		"\u0000\u0000\u0103\u00fe\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u010a\u0001\u0000\u0000\u0000\u0105\u0106\n\u0001\u0000"+
		"\u0000\u0106\u0107\u0005\"\u0000\u0000\u0107\u0109\u0005#\u0000\u0000"+
		"\u0108\u0105\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000"+
		"\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000"+
		"\u010b%\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d"+
		"\u011c\u0005-\u0000\u0000\u010e\u011c\u0005.\u0000\u0000\u010f\u011c\u0005"+
		"(\u0000\u0000\u0110\u011c\u0005/\u0000\u0000\u0111\u011c\u00050\u0000"+
		"\u0000\u0112\u011c\u0005)\u0000\u0000\u0113\u011c\u0005*\u0000\u0000\u0114"+
		"\u011c\u00051\u0000\u0000\u0115\u0116\u0005&\u0000\u0000\u0116\u0117\u0003"+
		"$\u0012\u0000\u0117\u0118\u0005\'\u0000\u0000\u0118\u0119\u0003&\u0013"+
		"\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a\u011c\u0005,\u0000\u0000"+
		"\u011b\u010d\u0001\u0000\u0000\u0000\u011b\u010e\u0001\u0000\u0000\u0000"+
		"\u011b\u010f\u0001\u0000\u0000\u0000\u011b\u0110\u0001\u0000\u0000\u0000"+
		"\u011b\u0111\u0001\u0000\u0000\u0000\u011b\u0112\u0001\u0000\u0000\u0000"+
		"\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u0114\u0001\u0000\u0000\u0000"+
		"\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\'\u0001\u0000\u0000\u0000\u001f),/4;AGMTZ`dly\u0084\u0088\u008d"+
		"\u009d\u00a7\u00aa\u00ae\u00b4\u00bf\u00c4\u00cb\u00d2\u00d4\u00e4\u0103"+
		"\u010a\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}