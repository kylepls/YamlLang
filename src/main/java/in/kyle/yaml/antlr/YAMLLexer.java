// Generated from C:/Users/Kyle/Desktop/Projects/Java/YamlLang-New/src/main/antlr\YAML.g4 by ANTLR 4.7
package in.kyle.yaml.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class YAMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ARRAY_START=4, ARRAY_END=5, ARRAY_SET=6, NUMBER=7, 
		BOOL=8, WHILE=9, DO=10, IF=11, THEN=12, ELIF=13, ELSE=14, ADD=15, DIV=16, 
		MUL=17, SUB=18, NOTEQ=19, EQ=20, NOT=21, LT=22, GT=23, ID=24, FUNCTION_ID=25, 
		STRING=26, CO=27, LIST_START=28, NL_=29, SKIP_=30, COMMENT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "ARRAY_START", "ARRAY_END", "ARRAY_SET", "NUMBER", 
		"BOOL", "WHILE", "DO", "IF", "THEN", "ELIF", "ELSE", "ADD", "DIV", "MUL", 
		"SUB", "NOTEQ", "EQ", "NOT", "LT", "GT", "ID", "FUNCTION_ID", "STRING", 
		"CO", "LIST_START", "NL_", "SKIP_", "COMMENT", "SPACES", "ANY", "INT"
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
		"CO", "LIST_START", "NL_", "SKIP_", "COMMENT"
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


	    java.util.LinkedList<Token> extra = new java.util.LinkedList<>();
	    java.util.Stack<Integer> indents = new java.util.Stack<>();
	    
	    Token lastToken;
	    
	    @Override
	    public void emit(Token t) {
	//       super.setToken(t);
	       extra.offer(t);
	    }
	    
	    @Override
	    public Token nextToken() {
	       Token next = super.nextToken(); 
	       if (next != null && next.getChannel() == Token.DEFAULT_CHANNEL) {
	            lastToken = next;
	       }
	       return extra.isEmpty() ? next : extra.poll();
	    }
	    
	    public Token makeDedent() {
	        CommonToken ct = commonToken(YAMLParser.DEDENT, "\u2190");
	        ct.setLine(getCurrentLine());
	        return ct;
	    }
	    
	    public Token makeNL(String spaces) {
	        CommonToken ct = commonToken(YAMLParser.NL, "\n\u2424" + spaces);
	        ct.setLine(getCurrentLine());
	        return ct;
	    }
	    
	    public Token makeIndent() {
	        return commonToken(YAMLParser.INDENT, "\u2192");
	    }
	    
	    private CommonToken commonToken(int type, String text) {
	        int stop = this.getCharIndex() - 1;
	        int start = text.isEmpty() ? stop : stop - text.length() + 1;
	        CommonToken ct = new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	        ct.setText(text);
	        return ct;
	    }
	    
	    private int getCurrentLine() {
	        return lastToken != null ? lastToken.getLine() : 0;
	    }


	public YAMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "YAML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28:
			NL__action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NL__action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        String stringSpaces = getText().replaceAll("[\r\n]+", "");
			        int spaces = stringSpaces.length();
			        int indent = indents.isEmpty() ? 0 : indents.peek();
			        if (spaces > indent) {
			            indents.push(spaces);
			            emit(makeNL(stringSpaces));
			            emit(makeIndent());
			        } else if (spaces < indent) {
			            emit(makeNL(stringSpaces));
			            do {
			                if (!indents.isEmpty()) {
			                    indent = indents.pop();
			                }
			                emit(makeDedent());
			            } while (!indents.isEmpty() && spaces < indents.peek()); 
			        } else {
			            emit(makeNL(stringSpaces));
			        }
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\7\31\u0092\n\31\f\31\16\31\u0095\13\31\3\32\3\32\7\32\u0099\n\32\f\32"+
		"\16\32\u009c\13\32\3\33\3\33\5\33\u00a0\n\33\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\5\36\u00aa\n\36\3\36\3\36\5\36\u00ae\n\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\6!\u00be\n!\r!\16!\u00bf"+
		"\3\"\7\"\u00c3\n\"\f\"\16\"\u00c6\13\"\3#\6#\u00c9\n#\r#\16#\u00ca\3\u00c4"+
		"\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\2C\2E\2\3\2\t\3\2c|\5\2\62;C\\c|\3\2C\\\4\2\62;C\\\3\2\f\f\3"+
		"\2\"\"\3\2\62;\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3G\3\2\2\2\5I\3\2\2"+
		"\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17T\3\2\2\2\21_\3\2\2"+
		"\2\23a\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31m\3\2\2\2\33r\3\2\2\2\35w\3\2"+
		"\2\2\37|\3\2\2\2!~\3\2\2\2#\u0080\3\2\2\2%\u0082\3\2\2\2\'\u0084\3\2\2"+
		"\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2\2\2\61\u008f"+
		"\3\2\2\2\63\u0096\3\2\2\2\65\u009d\3\2\2\2\67\u00a3\3\2\2\29\u00a5\3\2"+
		"\2\2;\u00a9\3\2\2\2=\u00b3\3\2\2\2?\u00b7\3\2\2\2A\u00bd\3\2\2\2C\u00c4"+
		"\3\2\2\2E\u00c8\3\2\2\2GH\7*\2\2H\4\3\2\2\2IJ\7+\2\2J\6\3\2\2\2KL\7)\2"+
		"\2L\b\3\2\2\2MN\7]\2\2N\n\3\2\2\2OP\7_\2\2P\f\3\2\2\2QR\7>\2\2RS\7/\2"+
		"\2S\16\3\2\2\2TU\5E#\2U\20\3\2\2\2VW\7v\2\2WX\7t\2\2XY\7w\2\2Y`\7g\2\2"+
		"Z[\7h\2\2[\\\7c\2\2\\]\7n\2\2]^\7u\2\2^`\7g\2\2_V\3\2\2\2_Z\3\2\2\2`\22"+
		"\3\2\2\2ab\7y\2\2bc\7j\2\2cd\7k\2\2de\7n\2\2ef\7g\2\2f\24\3\2\2\2gh\7"+
		"f\2\2hi\7q\2\2i\26\3\2\2\2jk\7k\2\2kl\7h\2\2l\30\3\2\2\2mn\7v\2\2no\7"+
		"j\2\2op\7g\2\2pq\7p\2\2q\32\3\2\2\2rs\7g\2\2st\7n\2\2tu\7k\2\2uv\7h\2"+
		"\2v\34\3\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2\2z{\7g\2\2{\36\3\2\2\2|}\7-\2"+
		"\2} \3\2\2\2~\177\7\61\2\2\177\"\3\2\2\2\u0080\u0081\7,\2\2\u0081$\3\2"+
		"\2\2\u0082\u0083\7/\2\2\u0083&\3\2\2\2\u0084\u0085\7#\2\2\u0085\u0086"+
		"\7?\2\2\u0086(\3\2\2\2\u0087\u0088\7?\2\2\u0088*\3\2\2\2\u0089\u008a\7"+
		"#\2\2\u008a,\3\2\2\2\u008b\u008c\7>\2\2\u008c.\3\2\2\2\u008d\u008e\7@"+
		"\2\2\u008e\60\3\2\2\2\u008f\u0093\t\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\62\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u009a\t\4\2\2\u0097\u0099\t\5\2"+
		"\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\64\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\7$\2\2\u009e"+
		"\u00a0\5C\"\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a2\7$\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7<\2\2\u00a48\3\2"+
		"\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7\"\2\2\u00a7:\3\2\2\2\u00a8\u00aa"+
		"\7\17\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00ad\7\f\2\2\u00ac\u00ae\5A!\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\36\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00b2\b\36\3\2\u00b2<\3\2\2\2\u00b3\u00b4\5A!\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\b\37\3\2\u00b6>\3\2\2\2\u00b7\u00b8\7%\2\2\u00b8\u00b9"+
		"\n\6\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b \3\2\u00bb@\3\2\2\2\u00bc\u00be"+
		"\t\7\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0B\3\2\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5D\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\b\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cbF\3\2\2\2"+
		"\f\2_\u0093\u009a\u009f\u00a9\u00ad\u00bf\u00c4\u00ca\4\3\36\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}