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
		T__31=32, LANGLE=33, RANGLE=34, LPAREN=35, RPAREN=36, BOOLEAN=37, NOTNULL=38, 
		NULL=39, NOT=40, ID=41, INT=42, FLOAT=43, STRING=44, CHAR=45, WS=46;
	public static final int
		RULE_templateFile = 0, RULE_constructorSet = 1, RULE_mockSet = 2, RULE_whenSet = 3, 
		RULE_paramSet = 4, RULE_variationSpec = 5, RULE_varFor = 6, RULE_varInput = 7, 
		RULE_whenSpec = 8, RULE_throwVal = 9, RULE_mockSpec = 10, RULE_conditionExpr = 11, 
		RULE_paramSpec = 12, RULE_paramInput = 13, RULE_expectation = 14, RULE_expectFor = 15, 
		RULE_expectInput = 16, RULE_type = 17, RULE_literal = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"templateFile", "constructorSet", "mockSet", "whenSet", "paramSet", "variationSpec", 
			"varFor", "varInput", "whenSpec", "throwVal", "mockSpec", "conditionExpr", 
			"paramSpec", "paramInput", "expectation", "expectFor", "expectInput", 
			"type", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CONSTRUCTOR'", "'MOCKING'", "'WHEN_RULES'", "'TEST'", "'REPEAT'", 
			"'METHOD'", "'VARIATION'", "'VALUES'", "'FOR'", "'TO'", "','", "'WHEN'", 
			"'RETURNS'", "'THROW'", "'.'", "'MOCK'", "'PARAM'", "'VALUE'", "'EXPECT'", 
			"'EXPECT_EXCEPTION'", "'int'", "'float'", "'double'", "'char'", "'boolean'", 
			"'string'", "'enum'", "'List<'", "'>'", "'Optional<'", "'Map<'", "'Set<'", 
			"'['", "']'", "'('", "')'", null, "'notnull'", "'null'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "LANGLE", "RANGLE", 
			"LPAREN", "RPAREN", "BOOLEAN", "NOTNULL", "NULL", "NOT", "ID", "INT", 
			"FLOAT", "STRING", "CHAR", "WS"
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
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(38);
				constructorSet();
				}
			}

			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(41);
				mockSet();
				}
			}

			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(44);
				whenSet();
				}
			}

			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(47);
				paramSet();
				}
				}
				setState(52);
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
			setState(53);
			match(T__0);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				paramSpec();
				}
				}
				setState(57); 
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
			setState(59);
			match(T__1);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				mockSpec();
				}
				}
				setState(63); 
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
			setState(65);
			match(T__2);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				whenSpec();
				}
				}
				setState(69); 
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
			setState(71);
			match(T__3);
			setState(72);
			((ParamSetContext)_localctx).testName = match(ID);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(73);
				match(T__4);
				setState(74);
				((ParamSetContext)_localctx).repeatTimes = match(INT);
				}
			}

			setState(77);
			match(T__5);
			setState(78);
			((ParamSetContext)_localctx).methodName = match(ID);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(79);
				paramSpec();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(85);
				variationSpec();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(91);
				whenSpec();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__19) {
				{
				setState(97);
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
			setState(100);
			match(T__6);
			setState(101);
			((VariationSpecContext)_localctx).varType = type(0);
			setState(102);
			((VariationSpecContext)_localctx).varName = match(ID);
			setState(103);
			match(T__7);
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				{
				setState(104);
				varInput();
				}
				break;
			case T__8:
				{
				setState(105);
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
			setState(108);
			match(T__8);
			setState(109);
			match(INT);
			setState(110);
			match(T__9);
			setState(111);
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
			setState(113);
			match(LANGLE);
			setState(114);
			literal();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(115);
				match(T__10);
				setState(116);
				literal();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
			setState(124);
			match(T__11);
			setState(125);
			conditionExpr();
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				{
				{
				setState(126);
				match(T__12);
				setState(127);
				((WhenSpecContext)_localctx).returnVal = literal();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(128);
					match(T__13);
					setState(129);
					throwVal();
					}
				}

				}
				}
				break;
			case T__13:
				{
				{
				setState(132);
				match(T__13);
				setState(133);
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
			setState(136);
			match(ID);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(137);
				match(T__14);
				setState(138);
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
			setState(141);
			match(T__15);
			setState(142);
			match(ID);
			setState(143);
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
		enterRule(_localctx, 22, RULE_conditionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(146);
				match(LPAREN);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(147);
					match(ID);
					}
				}

				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(150);
					match(T__10);
					setState(151);
					match(ID);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
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
		enterRule(_localctx, 24, RULE_paramSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__16);
			setState(161);
			((ParamSpecContext)_localctx).paramType = type(0);
			setState(162);
			((ParamSpecContext)_localctx).paramName = match(ID);
			setState(163);
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
		enterRule(_localctx, 26, RULE_paramInput);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__17);
				setState(166);
				literal();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__7);
				setState(168);
				match(LANGLE);
				setState(169);
				literal();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(170);
					match(T__10);
					setState(171);
					literal();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__18);
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LANGLE:
					{
					setState(182);
					expectInput();
					}
					break;
				case BOOLEAN:
				case NOTNULL:
				case NULL:
				case INT:
				case FLOAT:
				case STRING:
				case CHAR:
					{
					setState(183);
					literal();
					}
					break;
				case T__8:
					{
					setState(184);
					expectFor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__19);
				setState(188);
				match(ID);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(189);
					match(LPAREN);
					setState(190);
					((ExpectationContext)_localctx).exceptionMessage = match(STRING);
					setState(191);
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
		enterRule(_localctx, 30, RULE_expectFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__8);
			setState(197);
			match(INT);
			setState(198);
			match(T__9);
			setState(199);
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
		enterRule(_localctx, 32, RULE_expectInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(LANGLE);
			setState(202);
			literal();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(203);
				match(T__10);
				setState(204);
				literal();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				{
				setState(213);
				match(T__20);
				}
				break;
			case T__21:
				{
				setState(214);
				match(T__21);
				}
				break;
			case T__22:
				{
				setState(215);
				match(T__22);
				}
				break;
			case T__23:
				{
				setState(216);
				match(T__23);
				}
				break;
			case T__24:
				{
				setState(217);
				match(T__24);
				}
				break;
			case T__25:
				{
				setState(218);
				match(T__25);
				}
				break;
			case T__26:
				{
				setState(219);
				match(T__26);
				}
				break;
			case T__27:
				{
				setState(220);
				match(T__27);
				setState(221);
				type(0);
				setState(222);
				match(T__28);
				}
				break;
			case T__29:
				{
				setState(224);
				match(T__29);
				setState(225);
				type(0);
				setState(226);
				match(T__28);
				}
				break;
			case T__30:
				{
				setState(228);
				match(T__30);
				setState(229);
				type(0);
				setState(230);
				match(T__28);
				}
				break;
			case T__31:
				{
				setState(232);
				match(T__31);
				setState(233);
				type(0);
				setState(234);
				match(T__28);
				}
				break;
			case ID:
				{
				setState(236);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(239);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(240);
					match(LANGLE);
					setState(241);
					match(RANGLE);
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66932770340864L) != 0)) ) {
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
		case 17:
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
		"\u0004\u0001.\u00fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0003\u0000(\b\u0000\u0001\u0000\u0003\u0000+\b\u0000\u0001"+
		"\u0000\u0003\u0000.\b\u0000\u0001\u0000\u0005\u00001\b\u0000\n\u0000\f"+
		"\u00004\t\u0000\u0001\u0001\u0001\u0001\u0004\u00018\b\u0001\u000b\u0001"+
		"\f\u00019\u0001\u0002\u0001\u0002\u0004\u0002>\b\u0002\u000b\u0002\f\u0002"+
		"?\u0001\u0003\u0001\u0003\u0004\u0003D\b\u0003\u000b\u0003\f\u0003E\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004L\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004Q\b\u0004\n\u0004\f\u0004T\t"+
		"\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001"+
		"\u0004\u0005\u0004]\b\u0004\n\u0004\f\u0004`\t\u0004\u0001\u0004\u0003"+
		"\u0004c\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005k\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007v\b\u0007\n\u0007\f\u0007y\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0083\b"+
		"\b\u0001\b\u0001\b\u0003\b\u0087\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u008c"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0095\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0099\b"+
		"\u000b\n\u000b\f\u000b\u009c\t\u000b\u0001\u000b\u0003\u000b\u009f\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ad\b\r\n\r\f\r\u00b0\t\r\u0001\r"+
		"\u0001\r\u0003\r\u00b4\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00ba\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00c1\b\u000e\u0003\u000e\u00c3\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ce\b\u0010\n\u0010\f\u0010"+
		"\u00d1\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ee\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00f3\b\u0011\n\u0011"+
		"\f\u0011\u00f6\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0001"+
		"\"\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$\u0000\u0001\u0002\u0000%\'*-\u010d\u0000\'\u0001"+
		"\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000"+
		"\u0000\u0006A\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nd\u0001"+
		"\u0000\u0000\u0000\fl\u0001\u0000\u0000\u0000\u000eq\u0001\u0000\u0000"+
		"\u0000\u0010|\u0001\u0000\u0000\u0000\u0012\u0088\u0001\u0000\u0000\u0000"+
		"\u0014\u008d\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000"+
		"\u0018\u00a0\u0001\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000"+
		"\u001c\u00c2\u0001\u0000\u0000\u0000\u001e\u00c4\u0001\u0000\u0000\u0000"+
		" \u00c9\u0001\u0000\u0000\u0000\"\u00ed\u0001\u0000\u0000\u0000$\u00f7"+
		"\u0001\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)+\u0003\u0004"+
		"\u0002\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001"+
		"\u0000\u0000\u0000,.\u0003\u0006\u0003\u0000-,\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.2\u0001\u0000\u0000\u0000/1\u0003\b\u0004\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u00003\u0001\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000057\u0005\u0001\u0000\u000068\u0003\u0018\f\u000076\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:\u0003\u0001\u0000\u0000\u0000;=\u0005\u0002"+
		"\u0000\u0000<>\u0003\u0014\n\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0005"+
		"\u0001\u0000\u0000\u0000AC\u0005\u0003\u0000\u0000BD\u0003\u0010\b\u0000"+
		"CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0004\u0000\u0000HK\u0005)\u0000\u0000IJ\u0005\u0005\u0000\u0000JL\u0005"+
		"*\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MN\u0005\u0006\u0000\u0000NR\u0005)\u0000\u0000OQ\u0003"+
		"\u0018\f\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SX\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000UW\u0003\n\u0005\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y^\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0003\u0010"+
		"\b\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000ac\u0003\u001c\u000e\u0000ba\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\t\u0001\u0000\u0000\u0000de\u0005\u0007"+
		"\u0000\u0000ef\u0003\"\u0011\u0000fg\u0005)\u0000\u0000gj\u0005\b\u0000"+
		"\u0000hk\u0003\u000e\u0007\u0000ik\u0003\f\u0006\u0000jh\u0001\u0000\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000k\u000b\u0001\u0000\u0000\u0000lm\u0005"+
		"\t\u0000\u0000mn\u0005*\u0000\u0000no\u0005\n\u0000\u0000op\u0005*\u0000"+
		"\u0000p\r\u0001\u0000\u0000\u0000qr\u0005!\u0000\u0000rw\u0003$\u0012"+
		"\u0000st\u0005\u000b\u0000\u0000tv\u0003$\u0012\u0000us\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005"+
		"\"\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|}\u0005\f\u0000\u0000}\u0086"+
		"\u0003\u0016\u000b\u0000~\u007f\u0005\r\u0000\u0000\u007f\u0082\u0003"+
		"$\u0012\u0000\u0080\u0081\u0005\u000e\u0000\u0000\u0081\u0083\u0003\u0012"+
		"\t\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0087\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u000e\u0000"+
		"\u0000\u0085\u0087\u0003\u0012\t\u0000\u0086~\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0011\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0005)\u0000\u0000\u0089\u008a\u0005\u000f\u0000\u0000\u008a"+
		"\u008c\u0005)\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\u0010\u0000\u0000\u008e\u008f\u0005)\u0000\u0000\u008f\u0090\u0005"+
		")\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u009e\u0005)\u0000"+
		"\u0000\u0092\u0094\u0005#\u0000\u0000\u0093\u0095\u0005)\u0000\u0000\u0094"+
		"\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u009a\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097"+
		"\u0099\u0005)\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0005$\u0000\u0000\u009e\u0092\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u0017\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0005\u0011\u0000\u0000\u00a1\u00a2\u0003"+
		"\"\u0011\u0000\u00a2\u00a3\u0005)\u0000\u0000\u00a3\u00a4\u0003\u001a"+
		"\r\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0012\u0000"+
		"\u0000\u00a6\u00b4\u0003$\u0012\u0000\u00a7\u00a8\u0005\b\u0000\u0000"+
		"\u00a8\u00a9\u0005!\u0000\u0000\u00a9\u00ae\u0003$\u0012\u0000\u00aa\u00ab"+
		"\u0005\u000b\u0000\u0000\u00ab\u00ad\u0003$\u0012\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		"\"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00a5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00a7\u0001\u0000\u0000\u0000\u00b4\u001b\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b9\u0005\u0013\u0000\u0000\u00b6\u00ba\u0003 \u0010"+
		"\u0000\u00b7\u00ba\u0003$\u0012\u0000\u00b8\u00ba\u0003\u001e\u000f\u0000"+
		"\u00b9\u00b6\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00c3\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0014\u0000\u0000\u00bc\u00c0\u0005)\u0000\u0000\u00bd"+
		"\u00be\u0005#\u0000\u0000\u00be\u00bf\u0005,\u0000\u0000\u00bf\u00c1\u0005"+
		"$\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c3\u001d\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\t\u0000\u0000\u00c5\u00c6\u0005*\u0000"+
		"\u0000\u00c6\u00c7\u0005\n\u0000\u0000\u00c7\u00c8\u0005*\u0000\u0000"+
		"\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005!\u0000\u0000\u00ca"+
		"\u00cf\u0003$\u0012\u0000\u00cb\u00cc\u0005\u000b\u0000\u0000\u00cc\u00ce"+
		"\u0003$\u0012\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\"\u0000\u0000\u00d3!\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0006\u0011\uffff\uffff\u0000\u00d5\u00ee\u0005"+
		"\u0015\u0000\u0000\u00d6\u00ee\u0005\u0016\u0000\u0000\u00d7\u00ee\u0005"+
		"\u0017\u0000\u0000\u00d8\u00ee\u0005\u0018\u0000\u0000\u00d9\u00ee\u0005"+
		"\u0019\u0000\u0000\u00da\u00ee\u0005\u001a\u0000\u0000\u00db\u00ee\u0005"+
		"\u001b\u0000\u0000\u00dc\u00dd\u0005\u001c\u0000\u0000\u00dd\u00de\u0003"+
		"\"\u0011\u0000\u00de\u00df\u0005\u001d\u0000\u0000\u00df\u00ee\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005\u001e\u0000\u0000\u00e1\u00e2\u0003\"\u0011"+
		"\u0000\u00e2\u00e3\u0005\u001d\u0000\u0000\u00e3\u00ee\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005\u001f\u0000\u0000\u00e5\u00e6\u0003\"\u0011\u0000"+
		"\u00e6\u00e7\u0005\u001d\u0000\u0000\u00e7\u00ee\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0005 \u0000\u0000\u00e9\u00ea\u0003\"\u0011\u0000\u00ea"+
		"\u00eb\u0005\u001d\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ee\u0005)\u0000\u0000\u00ed\u00d4\u0001\u0000\u0000\u0000\u00ed\u00d6"+
		"\u0001\u0000\u0000\u0000\u00ed\u00d7\u0001\u0000\u0000\u0000\u00ed\u00d8"+
		"\u0001\u0000\u0000\u0000\u00ed\u00d9\u0001\u0000\u0000\u0000\u00ed\u00da"+
		"\u0001\u0000\u0000\u0000\u00ed\u00db\u0001\u0000\u0000\u0000\u00ed\u00dc"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e0\u0001\u0000\u0000\u0000\u00ed\u00e4"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ed\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f4\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\n\u0001\u0000\u0000\u00f0\u00f1\u0005!\u0000\u0000\u00f1\u00f3\u0005"+
		"\"\u0000\u0000\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f5#\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0007\u0000\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000"+
		"\u001c\'*-29?EKRX^bjw\u0082\u0086\u008b\u0094\u009a\u009e\u00ae\u00b3"+
		"\u00b9\u00c0\u00c2\u00cf\u00ed\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}