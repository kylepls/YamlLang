// Generated from C:/Users/Kyle/Desktop/Projects/Java/YamlLang-New/src/main/antlr\YAML.g4 by ANTLR 4.7
package in.kyle.yaml.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ARRAY_START=4, ARRAY_END=5, ARRAY_SET=6, NUMBER=7, 
		BOOL=8, WHILE=9, DO=10, IF=11, THEN=12, ELIF=13, ELSE=14, ADD=15, DIV=16, 
		MUL=17, SUB=18, NOTEQ=19, EQ=20, NOT=21, LT=22, GT=23, ID=24, FUNCTION_ID=25, 
		STRING=26, CO=27, LIST_START=28, NL_=29, SKIP_=30, COMMENT=31, INDENT=32, 
		DEDENT=33, NL=34;
	public static final int
		RULE_file = 0, RULE_content = 1, RULE_if_stmt = 2, RULE_else_if_stmt = 3, 
		RULE_else_stmt = 4, RULE_while_stmt = 5, RULE_assign = 6, RULE_function_call = 7, 
		RULE_function_list = 8, RULE_function_expr = 9, RULE_block = 10, RULE_list = 11, 
		RULE_list_item = 12, RULE_array_dec = 13, RULE_array_set = 14, RULE_array_acc = 15, 
		RULE_expr = 16;
	public static final String[] ruleNames = {
		"file", "content", "if_stmt", "else_if_stmt", "else_stmt", "while_stmt", 
		"assign", "function_call", "function_list", "function_expr", "block", 
		"list", "list_item", "array_dec", "array_set", "array_acc", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'''", "'['", "']'", "'<-'", null, null, "'while'", 
		"'do'", "'if'", "'then'", "'elif'", "'else'", "'+'", "'/'", "'*'", "'-'", 
		"'!='", "'='", "'!'", "'<'", "'>'", null, null, null, "':'", "'- '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ARRAY_START", "ARRAY_END", "ARRAY_SET", "NUMBER", 
		"BOOL", "WHILE", "DO", "IF", "THEN", "ELIF", "ELSE", "ADD", "DIV", "MUL", 
		"SUB", "NOTEQ", "EQ", "NOT", "LT", "GT", "ID", "FUNCTION_ID", "STRING", 
		"CO", "LIST_START", "NL_", "SKIP_", "COMMENT", "INDENT", "DEDENT", "NL"
	};
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
	public String getGrammarFileName() { return "YAML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public YAMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(YAMLParser.EOF, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				content();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << ID) | (1L << FUNCTION_ID) | (1L << NL))) != 0) );
			setState(39);
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

	public static class ContentContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Array_setContext array_set() {
			return getRuleContext(Array_setContext.class,0);
		}
		public Array_decContext array_dec() {
			return getRuleContext(Array_decContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				while_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				array_set();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				array_dec();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				assign();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				match(NL);
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

	public static class If_stmtContext extends ParserRuleContext {
		public ExprContext condition;
		public TerminalNode IF() { return getToken(YAMLParser.IF, 0); }
		public List<TerminalNode> CO() { return getTokens(YAMLParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(YAMLParser.CO, i);
		}
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public TerminalNode THEN() { return getToken(YAMLParser.THEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Else_if_stmtContext> else_if_stmt() {
			return getRuleContexts(Else_if_stmtContext.class);
		}
		public Else_if_stmtContext else_if_stmt(int i) {
			return getRuleContext(Else_if_stmtContext.class,i);
		}
		public Else_stmtContext else_stmt() {
			return getRuleContext(Else_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IF);
			setState(51);
			match(CO);
			setState(52);
			((If_stmtContext)_localctx).condition = expr(0);
			setState(53);
			match(NL);
			setState(54);
			match(THEN);
			setState(55);
			match(CO);
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(56);
				block();
				}
				break;
			}
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(59);
					else_if_stmt();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(65);
				else_stmt();
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

	public static class Else_if_stmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(YAMLParser.ELIF, 0); }
		public List<TerminalNode> CO() { return getTokens(YAMLParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(YAMLParser.CO, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public TerminalNode THEN() { return getToken(YAMLParser.THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterElse_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitElse_if_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitElse_if_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_stmtContext else_if_stmt() throws RecognitionException {
		Else_if_stmtContext _localctx = new Else_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_else_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ELIF);
			setState(69);
			match(CO);
			setState(70);
			expr(0);
			setState(71);
			match(NL);
			setState(72);
			match(THEN);
			setState(73);
			match(CO);
			setState(74);
			block();
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

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(YAMLParser.ELSE, 0); }
		public TerminalNode CO() { return getToken(YAMLParser.CO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitElse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitElse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ELSE);
			setState(77);
			match(CO);
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(78);
				block();
				}
				break;
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

	public static class While_stmtContext extends ParserRuleContext {
		public ExprContext condition;
		public TerminalNode WHILE() { return getToken(YAMLParser.WHILE, 0); }
		public List<TerminalNode> CO() { return getTokens(YAMLParser.CO); }
		public TerminalNode CO(int i) {
			return getToken(YAMLParser.CO, i);
		}
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public TerminalNode DO() { return getToken(YAMLParser.DO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(WHILE);
			setState(82);
			match(CO);
			setState(83);
			((While_stmtContext)_localctx).condition = expr(0);
			setState(84);
			match(NL);
			setState(85);
			match(DO);
			setState(86);
			match(CO);
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(87);
				block();
				}
				break;
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAMLParser.ID, 0); }
		public TerminalNode CO() { return getToken(YAMLParser.CO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(CO);
			setState(92);
			expr(0);
			setState(93);
			match(NL);
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

	public static class Function_callContext extends ParserRuleContext {
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_exprContext function_expr() {
			return getRuleContext(Function_exprContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_call);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				function_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				function_expr();
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

	public static class Function_listContext extends ParserRuleContext {
		public TerminalNode FUNCTION_ID() { return getToken(YAMLParser.FUNCTION_ID, 0); }
		public TerminalNode CO() { return getToken(YAMLParser.CO, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitFunction_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitFunction_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(FUNCTION_ID);
			setState(100);
			match(CO);
			setState(101);
			list();
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

	public static class Function_exprContext extends ParserRuleContext {
		public TerminalNode FUNCTION_ID() { return getToken(YAMLParser.FUNCTION_ID, 0); }
		public TerminalNode CO() { return getToken(YAMLParser.CO, 0); }
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Function_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterFunction_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitFunction_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitFunction_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_exprContext function_expr() throws RecognitionException {
		Function_exprContext _localctx = new Function_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FUNCTION_ID);
			setState(104);
			match(CO);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << NUMBER) | (1L << BOOL) | (1L << NOT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(105);
				expr(0);
				}
			}

			setState(108);
			match(NL);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public TerminalNode INDENT() { return getToken(YAMLParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(YAMLParser.DEDENT, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(NL);
			setState(111);
			match(INDENT);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(112);
					content();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(118);
			match(DEDENT);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(YAMLParser.INDENT, 0); }
		public List<List_itemContext> list_item() {
			return getRuleContexts(List_itemContext.class);
		}
		public List_itemContext list_item(int i) {
			return getRuleContext(List_itemContext.class,i);
		}
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public TerminalNode DEDENT() { return getToken(YAMLParser.DEDENT, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(INDENT);
			setState(121);
			list_item();
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					list_item();
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(128);
			match(NL);
			setState(129);
			match(DEDENT);
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

	public static class List_itemContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public TerminalNode LIST_START() { return getToken(YAMLParser.LIST_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterList_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitList_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitList_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_itemContext list_item() throws RecognitionException {
		List_itemContext _localctx = new List_itemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(NL);
			setState(132);
			match(LIST_START);
			setState(133);
			expr(0);
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

	public static class Array_decContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAMLParser.ID, 0); }
		public TerminalNode CO() { return getToken(YAMLParser.CO, 0); }
		public TerminalNode ARRAY_START() { return getToken(YAMLParser.ARRAY_START, 0); }
		public TerminalNode ARRAY_END() { return getToken(YAMLParser.ARRAY_END, 0); }
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public Array_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterArray_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitArray_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitArray_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_decContext array_dec() throws RecognitionException {
		Array_decContext _localctx = new Array_decContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_array_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(ID);
			setState(136);
			match(CO);
			setState(137);
			match(ARRAY_START);
			setState(138);
			match(ARRAY_END);
			setState(139);
			match(NL);
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

	public static class Array_setContext extends ParserRuleContext {
		public ExprContext index_expr;
		public ExprContext value_expr;
		public TerminalNode ID() { return getToken(YAMLParser.ID, 0); }
		public TerminalNode CO() { return getToken(YAMLParser.CO, 0); }
		public TerminalNode ARRAY_START() { return getToken(YAMLParser.ARRAY_START, 0); }
		public TerminalNode ARRAY_END() { return getToken(YAMLParser.ARRAY_END, 0); }
		public TerminalNode ARRAY_SET() { return getToken(YAMLParser.ARRAY_SET, 0); }
		public TerminalNode NL() { return getToken(YAMLParser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Array_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterArray_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitArray_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitArray_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_setContext array_set() throws RecognitionException {
		Array_setContext _localctx = new Array_setContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(CO);
			setState(143);
			match(ARRAY_START);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << NUMBER) | (1L << BOOL) | (1L << NOT) | (1L << ID) | (1L << STRING))) != 0)) {
				{
				setState(144);
				((Array_setContext)_localctx).index_expr = expr(0);
				}
			}

			setState(147);
			match(ARRAY_END);
			setState(148);
			match(ARRAY_SET);
			setState(149);
			((Array_setContext)_localctx).value_expr = expr(0);
			setState(150);
			match(NL);
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

	public static class Array_accContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(YAMLParser.ID, 0); }
		public TerminalNode ARRAY_START() { return getToken(YAMLParser.ARRAY_START, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ARRAY_END() { return getToken(YAMLParser.ARRAY_END, 0); }
		public Array_accContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_acc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterArray_acc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitArray_acc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitArray_acc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_accContext array_acc() throws RecognitionException {
		Array_accContext _localctx = new Array_accContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			match(ARRAY_START);
			setState(154);
			expr(0);
			setState(155);
			match(ARRAY_END);
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
	public static class ADDContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode ADD() { return getToken(YAMLParser.ADD, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ADDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterADD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitADD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitADD(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SUBContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode SUB() { return getToken(YAMLParser.SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SUBContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterSUB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitSUB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitSUB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WRAPContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WRAPContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterWRAP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitWRAP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitWRAP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NUMBERContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(YAMLParser.NUMBER, 0); }
		public NUMBERContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterNUMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitNUMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitNUMBER(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EQContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode EQ() { return getToken(YAMLParser.EQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EQContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LESSGREATContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(YAMLParser.LT, 0); }
		public TerminalNode GT() { return getToken(YAMLParser.GT, 0); }
		public LESSGREATContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterLESSGREAT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitLESSGREAT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitLESSGREAT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NOTEQContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode NOTEQ() { return getToken(YAMLParser.NOTEQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NOTEQContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterNOTEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitNOTEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitNOTEQ(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NOTContext extends ExprContext {
		public TerminalNode NOT() { return getToken(YAMLParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NOTContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitNOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PARENSContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PARENSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterPARENS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitPARENS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitPARENS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BOOLContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(YAMLParser.BOOL, 0); }
		public BOOLContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterBOOL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitBOOL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitBOOL(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class STRINGContext extends ExprContext {
		public TerminalNode STRING() { return getToken(YAMLParser.STRING, 0); }
		public STRINGContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterSTRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitSTRING(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitSTRING(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDContext extends ExprContext {
		public TerminalNode ID() { return getToken(YAMLParser.ID, 0); }
		public IDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MULDIVContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(YAMLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(YAMLParser.DIV, 0); }
		public MULDIVContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterMULDIV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitMULDIV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitMULDIV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ACCESSContext extends ExprContext {
		public Array_accContext array_acc() {
			return getRuleContext(Array_accContext.class,0);
		}
		public ACCESSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).enterACCESS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof YAMLListener ) ((YAMLListener)listener).exitACCESS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof YAMLVisitor ) return ((YAMLVisitor<? extends T>)visitor).visitACCESS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new PARENSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158);
				match(T__0);
				setState(159);
				expr(0);
				setState(160);
				match(T__1);
				}
				break;
			case 2:
				{
				_localctx = new WRAPContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__2);
				setState(163);
				expr(0);
				setState(164);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new NOTContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(NOT);
				setState(167);
				expr(6);
				}
				break;
			case 4:
				{
				_localctx = new ACCESSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				array_acc();
				}
				break;
			case 5:
				{
				_localctx = new NUMBERContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new STRINGContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BOOLContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(BOOL);
				}
				break;
			case 8:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MULDIVContext(new ExprContext(_parentctx, _parentState));
						((MULDIVContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(176);
						((MULDIVContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
							((MULDIVContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(177);
						((MULDIVContext)_localctx).right = expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ADDContext(new ExprContext(_parentctx, _parentState));
						((ADDContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(179);
						match(ADD);
						setState(180);
						((ADDContext)_localctx).right = expr(14);
						}
						break;
					case 3:
						{
						_localctx = new SUBContext(new ExprContext(_parentctx, _parentState));
						((SUBContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(182);
						match(SUB);
						setState(183);
						((SUBContext)_localctx).right = expr(13);
						}
						break;
					case 4:
						{
						_localctx = new EQContext(new ExprContext(_parentctx, _parentState));
						((EQContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(185);
						match(EQ);
						setState(186);
						((EQContext)_localctx).right = expr(12);
						}
						break;
					case 5:
						{
						_localctx = new NOTEQContext(new ExprContext(_parentctx, _parentState));
						((NOTEQContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(188);
						match(NOTEQ);
						setState(189);
						((NOTEQContext)_localctx).right = expr(11);
						}
						break;
					case 6:
						{
						_localctx = new LESSGREATContext(new ExprContext(_parentctx, _parentState));
						((LESSGREATContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(191);
						((LESSGREATContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LT || _la==GT) ) {
							((LESSGREATContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						((LESSGREATContext)_localctx).right = expr(10);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3"+
		"\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6R\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\td\n\t\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13m\n\13\3\13\3\13\3\f\3\f\3\f\7\ft\n"+
		"\f\f\f\16\fw\13\f\3\f\3\f\3\r\3\r\3\r\7\r~\n\r\f\r\16\r\u0081\13\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\5\20\u0094\n\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00b0\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c4\n\22\f\22"+
		"\16\22\u00c7\13\22\3\22\4@u\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"\2\4\3\2\22\23\3\2\30\31\2\u00d5\2%\3\2\2\2\4\62\3\2\2\2\6\64\3"+
		"\2\2\2\bF\3\2\2\2\nN\3\2\2\2\fS\3\2\2\2\16\\\3\2\2\2\20c\3\2\2\2\22e\3"+
		"\2\2\2\24i\3\2\2\2\26p\3\2\2\2\30z\3\2\2\2\32\u0085\3\2\2\2\34\u0089\3"+
		"\2\2\2\36\u008f\3\2\2\2 \u009a\3\2\2\2\"\u00af\3\2\2\2$&\5\4\3\2%$\3\2"+
		"\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\7\2\2\3*\3\3\2\2\2+"+
		"\63\5\6\4\2,\63\5\f\7\2-\63\5\36\20\2.\63\5\34\17\2/\63\5\16\b\2\60\63"+
		"\5\20\t\2\61\63\7$\2\2\62+\3\2\2\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2"+
		"\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\7\r\2\2\65"+
		"\66\7\35\2\2\66\67\5\"\22\2\678\7$\2\289\7\16\2\29;\7\35\2\2:<\5\26\f"+
		"\2;:\3\2\2\2;<\3\2\2\2<@\3\2\2\2=?\5\b\5\2>=\3\2\2\2?B\3\2\2\2@A\3\2\2"+
		"\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2CE\5\n\6\2DC\3\2\2\2DE\3\2\2\2E\7\3\2"+
		"\2\2FG\7\17\2\2GH\7\35\2\2HI\5\"\22\2IJ\7$\2\2JK\7\16\2\2KL\7\35\2\2L"+
		"M\5\26\f\2M\t\3\2\2\2NO\7\20\2\2OQ\7\35\2\2PR\5\26\f\2QP\3\2\2\2QR\3\2"+
		"\2\2R\13\3\2\2\2ST\7\13\2\2TU\7\35\2\2UV\5\"\22\2VW\7$\2\2WX\7\f\2\2X"+
		"Z\7\35\2\2Y[\5\26\f\2ZY\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\]\7\32\2\2]^\7\35"+
		"\2\2^_\5\"\22\2_`\7$\2\2`\17\3\2\2\2ad\5\22\n\2bd\5\24\13\2ca\3\2\2\2"+
		"cb\3\2\2\2d\21\3\2\2\2ef\7\33\2\2fg\7\35\2\2gh\5\30\r\2h\23\3\2\2\2ij"+
		"\7\33\2\2jl\7\35\2\2km\5\"\22\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7$\2\2"+
		"o\25\3\2\2\2pq\7$\2\2qu\7\"\2\2rt\5\4\3\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2"+
		"\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7#\2\2y\27\3\2\2\2z{\7\"\2\2{\177\5"+
		"\32\16\2|~\5\32\16\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7$\2\2\u0083"+
		"\u0084\7#\2\2\u0084\31\3\2\2\2\u0085\u0086\7$\2\2\u0086\u0087\7\36\2\2"+
		"\u0087\u0088\5\"\22\2\u0088\33\3\2\2\2\u0089\u008a\7\32\2\2\u008a\u008b"+
		"\7\35\2\2\u008b\u008c\7\6\2\2\u008c\u008d\7\7\2\2\u008d\u008e\7$\2\2\u008e"+
		"\35\3\2\2\2\u008f\u0090\7\32\2\2\u0090\u0091\7\35\2\2\u0091\u0093\7\6"+
		"\2\2\u0092\u0094\5\"\22\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7\7\2\2\u0096\u0097\7\b\2\2\u0097\u0098\5\""+
		"\22\2\u0098\u0099\7$\2\2\u0099\37\3\2\2\2\u009a\u009b\7\32\2\2\u009b\u009c"+
		"\7\6\2\2\u009c\u009d\5\"\22\2\u009d\u009e\7\7\2\2\u009e!\3\2\2\2\u009f"+
		"\u00a0\b\22\1\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\"\22\2\u00a2\u00a3\7"+
		"\4\2\2\u00a3\u00b0\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\5\"\22\2\u00a6"+
		"\u00a7\7\5\2\2\u00a7\u00b0\3\2\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00b0\5"+
		"\"\22\b\u00aa\u00b0\5 \21\2\u00ab\u00b0\7\t\2\2\u00ac\u00b0\7\34\2\2\u00ad"+
		"\u00b0\7\n\2\2\u00ae\u00b0\7\32\2\2\u00af\u009f\3\2\2\2\u00af\u00a4\3"+
		"\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00c5\3\2"+
		"\2\2\u00b1\u00b2\f\20\2\2\u00b2\u00b3\t\2\2\2\u00b3\u00c4\5\"\22\21\u00b4"+
		"\u00b5\f\17\2\2\u00b5\u00b6\7\21\2\2\u00b6\u00c4\5\"\22\20\u00b7\u00b8"+
		"\f\16\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00c4\5\"\22\17\u00ba\u00bb\f\r\2"+
		"\2\u00bb\u00bc\7\26\2\2\u00bc\u00c4\5\"\22\16\u00bd\u00be\f\f\2\2\u00be"+
		"\u00bf\7\25\2\2\u00bf\u00c4\5\"\22\r\u00c0\u00c1\f\13\2\2\u00c1\u00c2"+
		"\t\3\2\2\u00c2\u00c4\5\"\22\f\u00c3\u00b1\3\2\2\2\u00c3\u00b4\3\2\2\2"+
		"\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c0"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"#\3\2\2\2\u00c7\u00c5\3\2\2\2\21\'\62;@DQZclu\177\u0093\u00af\u00c3\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}