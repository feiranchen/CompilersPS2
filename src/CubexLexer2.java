// Generated from CubexLexer2.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CubexLexer2 extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRING=1, IF=2, ELSE=3, WHILE=4, FOR=5, IN=6, RETURN=7, INTERFACE=8, EXTENDS=9, 
		FUN=10, CLASS=11, SUPER=12, THING=13, NOTHING=14, TRUE=15, FALSE=16, CLSINTF=17, 
		TPARA=18, VAR=19, INTEGER=20, LBRACKET=21, RBRACKET=22, COLON=23, EQUAL=24, 
		LPAREN=25, RPAREN=26, COMMA=27, SEMICOLON=28, LBRACE=29, RBRACE=30, STAR=31, 
		SLASH=32, PERCENT=33, PLUS=34, DASH=35, LANGLE=36, RANGLE=37, BANG=38, 
		AMPERSAND=39, PIPE=40, DOT=41, APPEND=42, THR=43, LTHR=44, RTHR=45, LRTHR=46, 
		ONW=47, LONW=48, LTE=49, GTE=50, EQEQUAL=51, INEQUAL=52, ASSIGN=53, COMMENTS=54, 
		COMMENTS_POND=55, SPACE=56, ERROR=57;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"STRING", "'if'", "'else'", "'while'", "'for'", "'in'", "'return'", "'interface'", 
		"'extends'", "'fun'", "'class'", "'super'", "'Thing'", "'Nothing'", "'true'", 
		"'false'", "CLSINTF", "TPARA", "VAR", "INTEGER", "'['", "']'", "':'", 
		"'='", "'('", "')'", "','", "';'", "'{'", "'}'", "'*'", "'/'", "'%'", 
		"'+'", "'-'", "'<'", "'>'", "'!'", "'&'", "'|'", "'.'", "'++'", "'..'", 
		"'<.'", "'.<'", "'<<'", "'...'", "'<..'", "'<='", "'>='", "'=='", "'!='", 
		"':='", "COMMENTS", "COMMENTS_POND", "SPACE", "ERROR"
	};
	public static final String[] ruleNames = {
		"STRING", "IF", "ELSE", "WHILE", "FOR", "IN", "RETURN", "INTERFACE", "EXTENDS", 
		"FUN", "CLASS", "SUPER", "THING", "NOTHING", "TRUE", "FALSE", "CLSINTF", 
		"TPARA", "VAR", "INTEGER", "LBRACKET", "RBRACKET", "COLON", "EQUAL", "LPAREN", 
		"RPAREN", "COMMA", "SEMICOLON", "LBRACE", "RBRACE", "STAR", "SLASH", "PERCENT", 
		"PLUS", "DASH", "LANGLE", "RANGLE", "BANG", "AMPERSAND", "PIPE", "DOT", 
		"APPEND", "THR", "LTHR", "RTHR", "LRTHR", "ONW", "LONW", "LTE", "GTE", 
		"EQEQUAL", "INEQUAL", "ASSIGN", "COMMENTS", "COMMENTS_POND", "SPACE", 
		"ERROR"
	};


	public CubexLexer2(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CubexLexer2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: STRING_action((RuleContext)_localctx, actionIndex); break;

		case 53: COMMENTS_action((RuleContext)_localctx, actionIndex); break;

		case 54: COMMENTS_POND_action((RuleContext)_localctx, actionIndex); break;

		case 55: SPACE_action((RuleContext)_localctx, actionIndex); break;

		case 56: ERROR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void COMMENTS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("lexer error"); System.exit(0); break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: skip();  break;
		}
	}
	private void COMMENTS_POND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip();  break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: setText("\"\""); break;
		}
	}

	public static final String _serializedATN =
		"\2\4;\u0160\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\3\2\3\2\7\2x\n\2\f\2\16\2{\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\6\22\u00da\n\22\r\22\16\22\u00db\3\23\3\23\3\24\3"+
		"\24\7\24\u00e2\n\24\f\24\16\24\u00e5\13\24\3\25\6\25\u00e8\n\25\r\25\16"+
		"\25\u00e9\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3"+
		".\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\7\67\u013f\n\67\f\67\16\67\u0142\13\67\3\67\3\67\3\67\3\67\38\3"+
		"8\78\u014a\n8\f8\168\u014d\138\38\38\38\38\39\69\u0154\n9\r9\169\u0155"+
		"\39\39\3:\6:\u015b\n:\r:\16:\u015c\3:\3:\5\u0140\u014b\u015c;\3\3\2\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1"+
		"/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$"+
		"\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63"+
		"\1e\64\1g\65\1i\66\1k\67\1m8\4o9\5q:\6s;\3\3\2\f\4\13\f\17\17\3C\\\6\62"+
		";C\\aac|\3C\\\3c|\6\62;C\\aac|\3\62;\4\f\f\17\17\4\f\f\17\17\5\13\f\17"+
		"\17\"\"\u0168\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5\u0080\3\2"+
		"\2\2\7\u0083\3\2\2\2\t\u0088\3\2\2\2\13\u008e\3\2\2\2\r\u0092\3\2\2\2"+
		"\17\u0095\3\2\2\2\21\u009c\3\2\2\2\23\u00a6\3\2\2\2\25\u00ae\3\2\2\2\27"+
		"\u00b2\3\2\2\2\31\u00b8\3\2\2\2\33\u00be\3\2\2\2\35\u00c4\3\2\2\2\37\u00cc"+
		"\3\2\2\2!\u00d1\3\2\2\2#\u00d7\3\2\2\2%\u00dd\3\2\2\2\'\u00df\3\2\2\2"+
		")\u00e7\3\2\2\2+\u00eb\3\2\2\2-\u00ed\3\2\2\2/\u00ef\3\2\2\2\61\u00f1"+
		"\3\2\2\2\63\u00f3\3\2\2\2\65\u00f5\3\2\2\2\67\u00f7\3\2\2\29\u00f9\3\2"+
		"\2\2;\u00fb\3\2\2\2=\u00fd\3\2\2\2?\u00ff\3\2\2\2A\u0101\3\2\2\2C\u0103"+
		"\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I\u0109\3\2\2\2K\u010b\3\2\2\2M"+
		"\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0111\3\2\2\2S\u0113\3\2\2\2U\u0115\3\2"+
		"\2\2W\u0118\3\2\2\2Y\u011b\3\2\2\2[\u011e\3\2\2\2]\u0121\3\2\2\2_\u0124"+
		"\3\2\2\2a\u0128\3\2\2\2c\u012c\3\2\2\2e\u012f\3\2\2\2g\u0132\3\2\2\2i"+
		"\u0135\3\2\2\2k\u0138\3\2\2\2m\u013b\3\2\2\2o\u0147\3\2\2\2q\u0153\3\2"+
		"\2\2s\u015a\3\2\2\2uy\7$\2\2vx\n\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2y"+
		"z\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7$\2\2}~\3\2\2\2~\177\b\2\2\2\177\4\3"+
		"\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7h\2\2\u0082\6\3\2\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7n\2\2\u0085\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087"+
		"\b\3\2\2\2\u0088\u0089\7y\2\2\u0089\u008a\7j\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7g\2\2\u008d\n\3\2\2\2\u008e\u008f\7h\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\f\3\2\2\2\u0092\u0093\7k\2\2\u0093"+
		"\u0094\7p\2\2\u0094\16\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7v\2\2\u0098\u0099\7w\2\2\u0099\u009a\7t\2\2\u009a\u009b\7p\2\2"+
		"\u009b\20\3\2\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7"+
		"v\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7e\2\2\u00a4\u00a5\7g\2\2\u00a5\22\3\2\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7z\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7g\2\2\u00aa"+
		"\u00ab\7p\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7u\2\2\u00ad\24\3\2\2\2\u00ae"+
		"\u00af\7h\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7p\2\2\u00b1\26\3\2\2\2\u00b2"+
		"\u00b3\7e\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7u\2\2"+
		"\u00b6\u00b7\7u\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7"+
		"w\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7t\2\2\u00bd\32"+
		"\3\2\2\2\u00be\u00bf\7V\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7i\2\2\u00c3\34\3\2\2\2\u00c4\u00c5\7P\2\2\u00c5"+
		"\u00c6\7q\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7p\2\2\u00ca\u00cb\7i\2\2\u00cb\36\3\2\2\2\u00cc\u00cd\7"+
		"v\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2\u00d0 "+
		"\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"\u00d5\7u\2\2\u00d5\u00d6\7g\2\2\u00d6\"\3\2\2\2\u00d7\u00d9\t\3\2\2\u00d8"+
		"\u00da\t\4\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc$\3\2\2\2\u00dd\u00de\t\5\2\2\u00de&\3\2"+
		"\2\2\u00df\u00e3\t\6\2\2\u00e0\u00e2\t\7\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4(\3\2\2\2"+
		"\u00e5\u00e3\3\2\2\2\u00e6\u00e8\t\b\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea*\3\2\2\2\u00eb"+
		"\u00ec\7]\2\2\u00ec,\3\2\2\2\u00ed\u00ee\7_\2\2\u00ee.\3\2\2\2\u00ef\u00f0"+
		"\7<\2\2\u00f0\60\3\2\2\2\u00f1\u00f2\7?\2\2\u00f2\62\3\2\2\2\u00f3\u00f4"+
		"\7*\2\2\u00f4\64\3\2\2\2\u00f5\u00f6\7+\2\2\u00f6\66\3\2\2\2\u00f7\u00f8"+
		"\7.\2\2\u00f88\3\2\2\2\u00f9\u00fa\7=\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7"+
		"}\2\2\u00fc<\3\2\2\2\u00fd\u00fe\7\177\2\2\u00fe>\3\2\2\2\u00ff\u0100"+
		"\7,\2\2\u0100@\3\2\2\2\u0101\u0102\7\61\2\2\u0102B\3\2\2\2\u0103\u0104"+
		"\7\'\2\2\u0104D\3\2\2\2\u0105\u0106\7-\2\2\u0106F\3\2\2\2\u0107\u0108"+
		"\7/\2\2\u0108H\3\2\2\2\u0109\u010a\7>\2\2\u010aJ\3\2\2\2\u010b\u010c\7"+
		"@\2\2\u010cL\3\2\2\2\u010d\u010e\7#\2\2\u010eN\3\2\2\2\u010f\u0110\7("+
		"\2\2\u0110P\3\2\2\2\u0111\u0112\7~\2\2\u0112R\3\2\2\2\u0113\u0114\7\60"+
		"\2\2\u0114T\3\2\2\2\u0115\u0116\7-\2\2\u0116\u0117\7-\2\2\u0117V\3\2\2"+
		"\2\u0118\u0119\7\60\2\2\u0119\u011a\7\60\2\2\u011aX\3\2\2\2\u011b\u011c"+
		"\7>\2\2\u011c\u011d\7\60\2\2\u011dZ\3\2\2\2\u011e\u011f\7\60\2\2\u011f"+
		"\u0120\7>\2\2\u0120\\\3\2\2\2\u0121\u0122\7>\2\2\u0122\u0123\7>\2\2\u0123"+
		"^\3\2\2\2\u0124\u0125\7\60\2\2\u0125\u0126\7\60\2\2\u0126\u0127\7\60\2"+
		"\2\u0127`\3\2\2\2\u0128\u0129\7>\2\2\u0129\u012a\7\60\2\2\u012a\u012b"+
		"\7\60\2\2\u012bb\3\2\2\2\u012c\u012d\7>\2\2\u012d\u012e\7?\2\2\u012ed"+
		"\3\2\2\2\u012f\u0130\7@\2\2\u0130\u0131\7?\2\2\u0131f\3\2\2\2\u0132\u0133"+
		"\7?\2\2\u0133\u0134\7?\2\2\u0134h\3\2\2\2\u0135\u0136\7#\2\2\u0136\u0137"+
		"\7?\2\2\u0137j\3\2\2\2\u0138\u0139\7<\2\2\u0139\u013a\7?\2\2\u013al\3"+
		"\2\2\2\u013b\u0140\7b\2\2\u013c\u013f\5m\67\2\u013d\u013f\13\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0140\u013e\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\7)\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b\67\4\2\u0146n\3\2\2\2"+
		"\u0147\u014b\7%\2\2\u0148\u014a\n\t\2\2\u0149\u0148\3\2\2\2\u014a\u014d"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u014f\t\n\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b8"+
		"\5\2\u0151p\3\2\2\2\u0152\u0154\t\13\2\2\u0153\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\b9\6\2\u0158r\3\2\2\2\u0159\u015b\13\2\2\2\u015a\u0159\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e\u015f\b:\3\2\u015ft\3\2\2\2\f\2y\u00db\u00e3\u00e9\u013e"+
		"\u0140\u014b\u0155\u015c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}