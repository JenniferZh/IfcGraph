// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\STEPGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STEPGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, BLOCK_COMMENT=12, LINE_COMMENT=13, NONDEF=14, OVERRIDE=15, 
		BOOLEAN=16, INT=17, NEGINT=18, INTEXP=19, FLOAT=20, ENUM=21, STRING=22, 
		ISOSTEPSTART=23, ISOSTEPEND=24, HEADER=25, DATA=26, ENDSEC=27, NAME=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "WS", "BLOCK_COMMENT", "LINE_COMMENT", "NONDEF", "OVERRIDE", "BOOLEAN", 
		"INT", "NEGINT", "INTEXP", "FLOAT", "EXP", "ENUM", "STRING", "ISOSTEPSTART", 
		"ISOSTEPEND", "HEADER", "DATA", "ENDSEC", "NAME"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FILE_DESCRIPTION'", "'('", "')'", "';'", "'FILE_NAME'", "','", 
		"'FILE_SCHEMA'", "'#'", "'='", "'()'", null, null, null, "'$'", "'*'", 
		null, null, null, null, null, null, null, null, null, "'HEADER;'", "'DATA;'", 
		"'ENDSEC;'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WS", 
		"BLOCK_COMMENT", "LINE_COMMENT", "NONDEF", "OVERRIDE", "BOOLEAN", "INT", 
		"NEGINT", "INTEXP", "FLOAT", "ENUM", "STRING", "ISOSTEPSTART", "ISOSTEPEND", 
		"HEADER", "DATA", "ENDSEC", "NAME"
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


	public STEPGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "STEPGrammar.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u012a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\6\fu\n\f\r\f\16\fv\3\f\3\f\3\r\3\r\3\r\3\r\7\r\177\n\r\f\r\16\r\u0082"+
		"\13\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u008d\n\16\f\16\16"+
		"\16\u0090\13\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u009e\n\21\3\22\3\22\3\22\7\22\u00a3\n\22\f\22\16\22\u00a6"+
		"\13\22\5\22\u00a8\n\22\3\23\3\23\3\23\3\24\3\24\5\24\u00af\n\24\3\24\3"+
		"\24\3\25\3\25\6\25\u00b5\n\25\r\25\16\25\u00b6\3\25\5\25\u00ba\n\25\3"+
		"\25\3\25\5\25\u00be\n\25\3\25\3\25\7\25\u00c2\n\25\f\25\16\25\u00c5\13"+
		"\25\3\25\5\25\u00c8\n\25\5\25\u00ca\n\25\3\26\3\26\5\26\u00ce\n\26\3\26"+
		"\7\26\u00d1\n\26\f\26\16\26\u00d4\13\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00de\n\30\f\30\16\30\u00e1\13\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00ef\n\31\f\31\16\31\u00f2"+
		"\13\31\3\31\5\31\u00f5\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0108\n\32\f\32\16\32"+
		"\u010b\13\32\3\32\5\32\u010e\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\6\36\u0127\n\36\r\36\16\36\u0128\3\u0080\2\37\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\2-\27/\30\61\31\63\32\65\33\67\349\35;\36\3\2\13\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\3\2\63;\3\2\62;\4\2GGgg\4\2--//\3\2))\4\2//\62;"+
		"\6\2\62;C\\aac|\2\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5N\3\2\2\2\7P\3\2\2\2\tR\3\2\2\2\13T\3\2"+
		"\2\2\r^\3\2\2\2\17`\3\2\2\2\21l\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27t\3"+
		"\2\2\2\31z\3\2\2\2\33\u0088\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2"+
		"!\u009d\3\2\2\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'\u00ae\3\2\2\2)\u00c9\3"+
		"\2\2\2+\u00cb\3\2\2\2-\u00d5\3\2\2\2/\u00d9\3\2\2\2\61\u00f4\3\2\2\2\63"+
		"\u010d\3\2\2\2\65\u010f\3\2\2\2\67\u0117\3\2\2\29\u011d\3\2\2\2;\u0126"+
		"\3\2\2\2=>\7H\2\2>?\7K\2\2?@\7N\2\2@A\7G\2\2AB\7a\2\2BC\7F\2\2CD\7G\2"+
		"\2DE\7U\2\2EF\7E\2\2FG\7T\2\2GH\7K\2\2HI\7R\2\2IJ\7V\2\2JK\7K\2\2KL\7"+
		"Q\2\2LM\7P\2\2M\4\3\2\2\2NO\7*\2\2O\6\3\2\2\2PQ\7+\2\2Q\b\3\2\2\2RS\7"+
		"=\2\2S\n\3\2\2\2TU\7H\2\2UV\7K\2\2VW\7N\2\2WX\7G\2\2XY\7a\2\2YZ\7P\2\2"+
		"Z[\7C\2\2[\\\7O\2\2\\]\7G\2\2]\f\3\2\2\2^_\7.\2\2_\16\3\2\2\2`a\7H\2\2"+
		"ab\7K\2\2bc\7N\2\2cd\7G\2\2de\7a\2\2ef\7U\2\2fg\7E\2\2gh\7J\2\2hi\7G\2"+
		"\2ij\7O\2\2jk\7C\2\2k\20\3\2\2\2lm\7%\2\2m\22\3\2\2\2no\7?\2\2o\24\3\2"+
		"\2\2pq\7*\2\2qr\7+\2\2r\26\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wx\3\2\2\2xy\b\f\2\2y\30\3\2\2\2z{\7\61\2\2{|\7,\2\2|\u0080"+
		"\3\2\2\2}\177\13\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7"+
		",\2\2\u0084\u0085\7\61\2\2\u0085\u0086\3\2\2\2\u0086\u0087\b\r\2\2\u0087"+
		"\32\3\2\2\2\u0088\u0089\7\61\2\2\u0089\u008a\7\61\2\2\u008a\u008e\3\2"+
		"\2\2\u008b\u008d\n\3\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0091\u0092\b\16\2\2\u0092\34\3\2\2\2\u0093\u0094\7&\2\2\u0094\36"+
		"\3\2\2\2\u0095\u0096\7,\2\2\u0096 \3\2\2\2\u0097\u0098\7\60\2\2\u0098"+
		"\u0099\7V\2\2\u0099\u009e\7\60\2\2\u009a\u009b\7\60\2\2\u009b\u009c\7"+
		"H\2\2\u009c\u009e\7\60\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e"+
		"\"\3\2\2\2\u009f\u00a8\7\62\2\2\u00a0\u00a4\t\4\2\2\u00a1\u00a3\t\5\2"+
		"\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7"+
		"\u00a0\3\2\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7/\2\2\u00aa\u00ab\5#\22\2\u00ab"+
		"&\3\2\2\2\u00ac\u00af\5#\22\2\u00ad\u00af\5%\23\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5+\26\2\u00b1(\3"+
		"\2\2\2\u00b2\u00b4\7\60\2\2\u00b3\u00b5\t\5\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2"+
		"\2\2\u00b8\u00ba\5+\26\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00ca\3\2\2\2\u00bb\u00be\5#\22\2\u00bc\u00be\5%\23\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c3\7\60\2\2\u00c0"+
		"\u00c2\t\5\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c8\5+\26\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00bd\3\2\2\2\u00ca*\3\2\2\2\u00cb\u00cd"+
		"\t\6\2\2\u00cc\u00ce\t\7\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d2\3\2\2\2\u00cf\u00d1\t\5\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3,\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d6\7\60\2\2\u00d6\u00d7\5;\36\2\u00d7\u00d8\7\60\2\2"+
		"\u00d8.\3\2\2\2\u00d9\u00df\7)\2\2\u00da\u00de\n\b\2\2\u00db\u00dc\7)"+
		"\2\2\u00dc\u00de\7)\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3\60\3\2\2\2\u00e4\u00e5"+
		"\7U\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7R\2\2\u00e8"+
		"\u00f5\7=\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7Q\2\2"+
		"\u00ec\u00f0\3\2\2\2\u00ed\u00ef\t\t\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f5\7=\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00e9\3\2"+
		"\2\2\u00f5\62\3\2\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8\7P\2\2\u00f8\u00f9"+
		"\7F\2\2\u00f9\u00fa\7U\2\2\u00fa\u00fb\7V\2\2\u00fb\u00fc\7G\2\2\u00fc"+
		"\u00fd\7R\2\2\u00fd\u010e\7=\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7P\2\2"+
		"\u0100\u0101\7F\2\2\u0101\u0102\7/\2\2\u0102\u0103\7K\2\2\u0103\u0104"+
		"\7U\2\2\u0104\u0105\7Q\2\2\u0105\u0109\3\2\2\2\u0106\u0108\t\t\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e\7=\2\2\u010d"+
		"\u00f6\3\2\2\2\u010d\u00fe\3\2\2\2\u010e\64\3\2\2\2\u010f\u0110\7J\2\2"+
		"\u0110\u0111\7G\2\2\u0111\u0112\7C\2\2\u0112\u0113\7F\2\2\u0113\u0114"+
		"\7G\2\2\u0114\u0115\7T\2\2\u0115\u0116\7=\2\2\u0116\66\3\2\2\2\u0117\u0118"+
		"\7F\2\2\u0118\u0119\7C\2\2\u0119\u011a\7V\2\2\u011a\u011b\7C\2\2\u011b"+
		"\u011c\7=\2\2\u011c8\3\2\2\2\u011d\u011e\7G\2\2\u011e\u011f\7P\2\2\u011f"+
		"\u0120\7F\2\2\u0120\u0121\7U\2\2\u0121\u0122\7G\2\2\u0122\u0123\7E\2\2"+
		"\u0123\u0124\7=\2\2\u0124:\3\2\2\2\u0125\u0127\t\n\2\2\u0126\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"<\3\2\2\2\31\2v\u0080\u008e\u009d\u00a4\u00a7\u00ae\u00b6\u00b9\u00bd"+
		"\u00c3\u00c7\u00c9\u00cd\u00d2\u00dd\u00df\u00f0\u00f4\u0109\u010d\u0128"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}