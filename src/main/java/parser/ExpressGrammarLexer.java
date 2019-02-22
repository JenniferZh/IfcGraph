// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\ExpressGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		WS=25, BLOCK_COMMENT=26, INT=27, SCHEMA=28, END_SCHEMA=29, TYPE=30, END_TYPE=31, 
		ENTITY=32, END_ENTITY=33, FUNCTION=34, END_FUNCTION=35, RULE=36, END_RULE=37, 
		SUBTYPE_OF=38, SUPERTYPE_OF=39, ONEOF=40, ABSTRACT=41, OPTIONAL=42, FIXED=43, 
		OF=44, SET=45, ARRAY=46, LIST=47, BOOLEAN=48, REAL=49, INTEGER=50, BINARY=51, 
		NUMBER=52, STRING=53, ENUMERATION=54, SELECT=55, WHERE=56, DERIVE=57, 
		UNIQUE=58, INVERSE=59, SELF_=60, FOR=61, NAME=62;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "WS", "BLOCK_COMMENT", 
		"INT", "SCHEMA", "END_SCHEMA", "TYPE", "END_TYPE", "ENTITY", "END_ENTITY", 
		"FUNCTION", "END_FUNCTION", "RULE", "END_RULE", "SUBTYPE_OF", "SUPERTYPE_OF", 
		"ONEOF", "ABSTRACT", "OPTIONAL", "FIXED", "OF", "SET", "ARRAY", "LIST", 
		"BOOLEAN", "REAL", "INTEGER", "BINARY", "NUMBER", "STRING", "ENUMERATION", 
		"SELECT", "WHERE", "DERIVE", "UNIQUE", "INVERSE", "SELF_", "FOR", "NAME"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "':'", "'['", "'?'", "']'", "','", "'='", "'.'", 
		"':='", "'<'", "'>'", "'\\'", "'/'", "'|'", "'*'", "'''", "'\"'", "'!'", 
		"'-'", "'+'", "'{'", "'}'", null, null, null, "'SCHEMA'", "'END_SCHEMA;'", 
		"'TYPE'", "'END_TYPE;'", "'ENTITY'", "'END_ENTITY;'", "'FUNCTION'", "'END_FUNCTION;'", 
		"'RULE'", "'END_RULE;'", "'SUBTYPE OF'", "'SUPERTYPE OF'", "'ONEOF'", 
		"'ABSTRACT'", "'OPTIONAL'", "'FIXED'", "'OF'", "'SET'", "'ARRAY'", "'LIST'", 
		"'BOOLEAN'", "'REAL'", "'INTEGER'", "'BINARY'", "'NUMBER'", "'STRING'", 
		"'ENUMERATION'", "'SELECT'", "'WHERE'", "'DERIVE'", "'UNIQUE'", "'INVERSE'", 
		"'SELF\\'", "'FOR'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "BLOCK_COMMENT", "INT", "SCHEMA", "END_SCHEMA", "TYPE", "END_TYPE", 
		"ENTITY", "END_ENTITY", "FUNCTION", "END_FUNCTION", "RULE", "END_RULE", 
		"SUBTYPE_OF", "SUPERTYPE_OF", "ONEOF", "ABSTRACT", "OPTIONAL", "FIXED", 
		"OF", "SET", "ARRAY", "LIST", "BOOLEAN", "REAL", "INTEGER", "BINARY", 
		"NUMBER", "STRING", "ENUMERATION", "SELECT", "WHERE", "DERIVE", "UNIQUE", 
		"INVERSE", "SELF_", "FOR", "NAME"
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


	public ExpressGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpressGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2@\u01da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\6\32\u00b2\n\32\r\32\16\32\u00b3\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\7\33\u00bc\n\33\f\33\16\33\u00bf\13\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u00c9\n\34\f\34\16\34\u00cc\13"+
		"\34\5\34\u00ce\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3"+
		":\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3"+
		"=\3=\3=\3=\3>\3>\3>\3>\3?\6?\u01d7\n?\r?\16?\u01d8\3\u00bd\2@\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\3\2\6\5\2\13\f\17\17\"\"\3\2\63;\3\2\62;\6\2\62;C\\aac|\2\u01de"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0081\3\2\2\2\7\u0083\3\2\2\2\t\u0085"+
		"\3\2\2\2\13\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u008d\3"+
		"\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2\2\31\u0096\3\2"+
		"\2\2\33\u0098\3\2\2\2\35\u009a\3\2\2\2\37\u009c\3\2\2\2!\u009e\3\2\2\2"+
		"#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00a6\3\2\2\2+\u00a8\3"+
		"\2\2\2-\u00aa\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2\63\u00b1\3\2\2\2"+
		"\65\u00b7\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d6\3\2\2\2=\u00e2"+
		"\3\2\2\2?\u00e7\3\2\2\2A\u00f1\3\2\2\2C\u00f8\3\2\2\2E\u0104\3\2\2\2G"+
		"\u010d\3\2\2\2I\u011b\3\2\2\2K\u0120\3\2\2\2M\u012a\3\2\2\2O\u0135\3\2"+
		"\2\2Q\u0142\3\2\2\2S\u0148\3\2\2\2U\u0151\3\2\2\2W\u015a\3\2\2\2Y\u0160"+
		"\3\2\2\2[\u0163\3\2\2\2]\u0167\3\2\2\2_\u016d\3\2\2\2a\u0172\3\2\2\2c"+
		"\u017a\3\2\2\2e\u017f\3\2\2\2g\u0187\3\2\2\2i\u018e\3\2\2\2k\u0195\3\2"+
		"\2\2m\u019c\3\2\2\2o\u01a8\3\2\2\2q\u01af\3\2\2\2s\u01b5\3\2\2\2u\u01bc"+
		"\3\2\2\2w\u01c3\3\2\2\2y\u01cb\3\2\2\2{\u01d1\3\2\2\2}\u01d6\3\2\2\2\177"+
		"\u0080\7=\2\2\u0080\4\3\2\2\2\u0081\u0082\7*\2\2\u0082\6\3\2\2\2\u0083"+
		"\u0084\7+\2\2\u0084\b\3\2\2\2\u0085\u0086\7<\2\2\u0086\n\3\2\2\2\u0087"+
		"\u0088\7]\2\2\u0088\f\3\2\2\2\u0089\u008a\7A\2\2\u008a\16\3\2\2\2\u008b"+
		"\u008c\7_\2\2\u008c\20\3\2\2\2\u008d\u008e\7.\2\2\u008e\22\3\2\2\2\u008f"+
		"\u0090\7?\2\2\u0090\24\3\2\2\2\u0091\u0092\7\60\2\2\u0092\26\3\2\2\2\u0093"+
		"\u0094\7<\2\2\u0094\u0095\7?\2\2\u0095\30\3\2\2\2\u0096\u0097\7>\2\2\u0097"+
		"\32\3\2\2\2\u0098\u0099\7@\2\2\u0099\34\3\2\2\2\u009a\u009b\7^\2\2\u009b"+
		"\36\3\2\2\2\u009c\u009d\7\61\2\2\u009d \3\2\2\2\u009e\u009f\7~\2\2\u009f"+
		"\"\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7)\2\2\u00a3"+
		"&\3\2\2\2\u00a4\u00a5\7$\2\2\u00a5(\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7*"+
		"\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab.\3"+
		"\2\2\2\u00ac\u00ad\7}\2\2\u00ad\60\3\2\2\2\u00ae\u00af\7\177\2\2\u00af"+
		"\62\3\2\2\2\u00b0\u00b2\t\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2"+
		"\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6"+
		"\b\32\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\u00b9\7,\2\2\u00b9"+
		"\u00bd\3\2\2\2\u00ba\u00bc\13\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\7+\2\2\u00c2\u00c3\3\2\2"+
		"\2\u00c3\u00c4\b\33\2\2\u00c4\66\3\2\2\2\u00c5\u00ce\7\62\2\2\u00c6\u00ca"+
		"\t\3\2\2\u00c7\u00c9\t\4\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c6\3\2\2\2\u00ce8\3\2\2\2\u00cf\u00d0"+
		"\7U\2\2\u00d0\u00d1\7E\2\2\u00d1\u00d2\7J\2\2\u00d2\u00d3\7G\2\2\u00d3"+
		"\u00d4\7O\2\2\u00d4\u00d5\7C\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7G\2\2\u00d7"+
		"\u00d8\7P\2\2\u00d8\u00d9\7F\2\2\u00d9\u00da\7a\2\2\u00da\u00db\7U\2\2"+
		"\u00db\u00dc\7E\2\2\u00dc\u00dd\7J\2\2\u00dd\u00de\7G\2\2\u00de\u00df"+
		"\7O\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7=\2\2\u00e1<\3\2\2\2\u00e2\u00e3"+
		"\7V\2\2\u00e3\u00e4\7[\2\2\u00e4\u00e5\7R\2\2\u00e5\u00e6\7G\2\2\u00e6"+
		">\3\2\2\2\u00e7\u00e8\7G\2\2\u00e8\u00e9\7P\2\2\u00e9\u00ea\7F\2\2\u00ea"+
		"\u00eb\7a\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7[\2\2\u00ed\u00ee\7R\2\2"+
		"\u00ee\u00ef\7G\2\2\u00ef\u00f0\7=\2\2\u00f0@\3\2\2\2\u00f1\u00f2\7G\2"+
		"\2\u00f2\u00f3\7P\2\2\u00f3\u00f4\7V\2\2\u00f4\u00f5\7K\2\2\u00f5\u00f6"+
		"\7V\2\2\u00f6\u00f7\7[\2\2\u00f7B\3\2\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa"+
		"\7P\2\2\u00fa\u00fb\7F\2\2\u00fb\u00fc\7a\2\2\u00fc\u00fd\7G\2\2\u00fd"+
		"\u00fe\7P\2\2\u00fe\u00ff\7V\2\2\u00ff\u0100\7K\2\2\u0100\u0101\7V\2\2"+
		"\u0101\u0102\7[\2\2\u0102\u0103\7=\2\2\u0103D\3\2\2\2\u0104\u0105\7H\2"+
		"\2\u0105\u0106\7W\2\2\u0106\u0107\7P\2\2\u0107\u0108\7E\2\2\u0108\u0109"+
		"\7V\2\2\u0109\u010a\7K\2\2\u010a\u010b\7Q\2\2\u010b\u010c\7P\2\2\u010c"+
		"F\3\2\2\2\u010d\u010e\7G\2\2\u010e\u010f\7P\2\2\u010f\u0110\7F\2\2\u0110"+
		"\u0111\7a\2\2\u0111\u0112\7H\2\2\u0112\u0113\7W\2\2\u0113\u0114\7P\2\2"+
		"\u0114\u0115\7E\2\2\u0115\u0116\7V\2\2\u0116\u0117\7K\2\2\u0117\u0118"+
		"\7Q\2\2\u0118\u0119\7P\2\2\u0119\u011a\7=\2\2\u011aH\3\2\2\2\u011b\u011c"+
		"\7T\2\2\u011c\u011d\7W\2\2\u011d\u011e\7N\2\2\u011e\u011f\7G\2\2\u011f"+
		"J\3\2\2\2\u0120\u0121\7G\2\2\u0121\u0122\7P\2\2\u0122\u0123\7F\2\2\u0123"+
		"\u0124\7a\2\2\u0124\u0125\7T\2\2\u0125\u0126\7W\2\2\u0126\u0127\7N\2\2"+
		"\u0127\u0128\7G\2\2\u0128\u0129\7=\2\2\u0129L\3\2\2\2\u012a\u012b\7U\2"+
		"\2\u012b\u012c\7W\2\2\u012c\u012d\7D\2\2\u012d\u012e\7V\2\2\u012e\u012f"+
		"\7[\2\2\u012f\u0130\7R\2\2\u0130\u0131\7G\2\2\u0131\u0132\7\"\2\2\u0132"+
		"\u0133\7Q\2\2\u0133\u0134\7H\2\2\u0134N\3\2\2\2\u0135\u0136\7U\2\2\u0136"+
		"\u0137\7W\2\2\u0137\u0138\7R\2\2\u0138\u0139\7G\2\2\u0139\u013a\7T\2\2"+
		"\u013a\u013b\7V\2\2\u013b\u013c\7[\2\2\u013c\u013d\7R\2\2\u013d\u013e"+
		"\7G\2\2\u013e\u013f\7\"\2\2\u013f\u0140\7Q\2\2\u0140\u0141\7H\2\2\u0141"+
		"P\3\2\2\2\u0142\u0143\7Q\2\2\u0143\u0144\7P\2\2\u0144\u0145\7G\2\2\u0145"+
		"\u0146\7Q\2\2\u0146\u0147\7H\2\2\u0147R\3\2\2\2\u0148\u0149\7C\2\2\u0149"+
		"\u014a\7D\2\2\u014a\u014b\7U\2\2\u014b\u014c\7V\2\2\u014c\u014d\7T\2\2"+
		"\u014d\u014e\7C\2\2\u014e\u014f\7E\2\2\u014f\u0150\7V\2\2\u0150T\3\2\2"+
		"\2\u0151\u0152\7Q\2\2\u0152\u0153\7R\2\2\u0153\u0154\7V\2\2\u0154\u0155"+
		"\7K\2\2\u0155\u0156\7Q\2\2\u0156\u0157\7P\2\2\u0157\u0158\7C\2\2\u0158"+
		"\u0159\7N\2\2\u0159V\3\2\2\2\u015a\u015b\7H\2\2\u015b\u015c\7K\2\2\u015c"+
		"\u015d\7Z\2\2\u015d\u015e\7G\2\2\u015e\u015f\7F\2\2\u015fX\3\2\2\2\u0160"+
		"\u0161\7Q\2\2\u0161\u0162\7H\2\2\u0162Z\3\2\2\2\u0163\u0164\7U\2\2\u0164"+
		"\u0165\7G\2\2\u0165\u0166\7V\2\2\u0166\\\3\2\2\2\u0167\u0168\7C\2\2\u0168"+
		"\u0169\7T\2\2\u0169\u016a\7T\2\2\u016a\u016b\7C\2\2\u016b\u016c\7[\2\2"+
		"\u016c^\3\2\2\2\u016d\u016e\7N\2\2\u016e\u016f\7K\2\2\u016f\u0170\7U\2"+
		"\2\u0170\u0171\7V\2\2\u0171`\3\2\2\2\u0172\u0173\7D\2\2\u0173\u0174\7"+
		"Q\2\2\u0174\u0175\7Q\2\2\u0175\u0176\7N\2\2\u0176\u0177\7G\2\2\u0177\u0178"+
		"\7C\2\2\u0178\u0179\7P\2\2\u0179b\3\2\2\2\u017a\u017b\7T\2\2\u017b\u017c"+
		"\7G\2\2\u017c\u017d\7C\2\2\u017d\u017e\7N\2\2\u017ed\3\2\2\2\u017f\u0180"+
		"\7K\2\2\u0180\u0181\7P\2\2\u0181\u0182\7V\2\2\u0182\u0183\7G\2\2\u0183"+
		"\u0184\7I\2\2\u0184\u0185\7G\2\2\u0185\u0186\7T\2\2\u0186f\3\2\2\2\u0187"+
		"\u0188\7D\2\2\u0188\u0189\7K\2\2\u0189\u018a\7P\2\2\u018a\u018b\7C\2\2"+
		"\u018b\u018c\7T\2\2\u018c\u018d\7[\2\2\u018dh\3\2\2\2\u018e\u018f\7P\2"+
		"\2\u018f\u0190\7W\2\2\u0190\u0191\7O\2\2\u0191\u0192\7D\2\2\u0192\u0193"+
		"\7G\2\2\u0193\u0194\7T\2\2\u0194j\3\2\2\2\u0195\u0196\7U\2\2\u0196\u0197"+
		"\7V\2\2\u0197\u0198\7T\2\2\u0198\u0199\7K\2\2\u0199\u019a\7P\2\2\u019a"+
		"\u019b\7I\2\2\u019bl\3\2\2\2\u019c\u019d\7G\2\2\u019d\u019e\7P\2\2\u019e"+
		"\u019f\7W\2\2\u019f\u01a0\7O\2\2\u01a0\u01a1\7G\2\2\u01a1\u01a2\7T\2\2"+
		"\u01a2\u01a3\7C\2\2\u01a3\u01a4\7V\2\2\u01a4\u01a5\7K\2\2\u01a5\u01a6"+
		"\7Q\2\2\u01a6\u01a7\7P\2\2\u01a7n\3\2\2\2\u01a8\u01a9\7U\2\2\u01a9\u01aa"+
		"\7G\2\2\u01aa\u01ab\7N\2\2\u01ab\u01ac\7G\2\2\u01ac\u01ad\7E\2\2\u01ad"+
		"\u01ae\7V\2\2\u01aep\3\2\2\2\u01af\u01b0\7Y\2\2\u01b0\u01b1\7J\2\2\u01b1"+
		"\u01b2\7G\2\2\u01b2\u01b3\7T\2\2\u01b3\u01b4\7G\2\2\u01b4r\3\2\2\2\u01b5"+
		"\u01b6\7F\2\2\u01b6\u01b7\7G\2\2\u01b7\u01b8\7T\2\2\u01b8\u01b9\7K\2\2"+
		"\u01b9\u01ba\7X\2\2\u01ba\u01bb\7G\2\2\u01bbt\3\2\2\2\u01bc\u01bd\7W\2"+
		"\2\u01bd\u01be\7P\2\2\u01be\u01bf\7K\2\2\u01bf\u01c0\7S\2\2\u01c0\u01c1"+
		"\7W\2\2\u01c1\u01c2\7G\2\2\u01c2v\3\2\2\2\u01c3\u01c4\7K\2\2\u01c4\u01c5"+
		"\7P\2\2\u01c5\u01c6\7X\2\2\u01c6\u01c7\7G\2\2\u01c7\u01c8\7T\2\2\u01c8"+
		"\u01c9\7U\2\2\u01c9\u01ca\7G\2\2\u01cax\3\2\2\2\u01cb\u01cc\7U\2\2\u01cc"+
		"\u01cd\7G\2\2\u01cd\u01ce\7N\2\2\u01ce\u01cf\7H\2\2\u01cf\u01d0\7^\2\2"+
		"\u01d0z\3\2\2\2\u01d1\u01d2\7H\2\2\u01d2\u01d3\7Q\2\2\u01d3\u01d4\7T\2"+
		"\2\u01d4|\3\2\2\2\u01d5\u01d7\t\5\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8"+
		"\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9~\3\2\2\2\b\2\u00b3"+
		"\u00bd\u00ca\u00cd\u01d8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}