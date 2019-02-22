// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\STEPGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STEPGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, BLOCK_COMMENT=12, LINE_COMMENT=13, NONDEF=14, OVERRIDE=15, 
		BOOLEAN=16, INT=17, NEGINT=18, INTEXP=19, FLOAT=20, ENUM=21, STRING=22, 
		ISOSTEPSTART=23, ISOSTEPEND=24, HEADER=25, DATA=26, ENDSEC=27, NAME=28;
	public static final int
		RULE_ifcFile = 0, RULE_header = 1, RULE_headerLine = 2, RULE_data = 3, 
		RULE_dataLine = 4, RULE_typedListArgument = 5, RULE_argument = 6, RULE_listArgument = 7, 
		RULE_argumentList = 8;
	public static final String[] ruleNames = {
		"ifcFile", "header", "headerLine", "data", "dataLine", "typedListArgument", 
		"argument", "listArgument", "argumentList"
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

	@Override
	public String getGrammarFileName() { return "STEPGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public STEPGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IfcFileContext extends ParserRuleContext {
		public TerminalNode ISOSTEPSTART() { return getToken(STEPGrammarParser.ISOSTEPSTART, 0); }
		public TerminalNode ISOSTEPEND() { return getToken(STEPGrammarParser.ISOSTEPEND, 0); }
		public TerminalNode EOF() { return getToken(STEPGrammarParser.EOF, 0); }
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public IfcFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcFile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitIfcFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcFileContext ifcFile() throws RecognitionException {
		IfcFileContext _localctx = new IfcFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ifcFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ISOSTEPSTART);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HEADER) {
				{
				setState(19);
				header();
				}
			}

			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATA) {
				{
				setState(22);
				data();
				}
			}

			setState(25);
			match(ISOSTEPEND);
			setState(26);
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

	public static class HeaderContext extends ParserRuleContext {
		public List<HeaderLineContext> headerLine() {
			return getRuleContexts(HeaderLineContext.class);
		}
		public HeaderLineContext headerLine(int i) {
			return getRuleContext(HeaderLineContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(HEADER);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6))) != 0)) {
				{
				{
				setState(29);
				headerLine();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(ENDSEC);
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

	public static class HeaderLineContext extends ParserRuleContext {
		public HeaderLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerLine; }
	 
		public HeaderLineContext() { }
		public void copyFrom(HeaderLineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilenameContext extends HeaderLineContext {
		public TerminalNode STRING() { return getToken(STEPGrammarParser.STRING, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FilenameContext(HeaderLineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileschemaContext extends HeaderLineContext {
		public TerminalNode STRING() { return getToken(STEPGrammarParser.STRING, 0); }
		public FileschemaContext(HeaderLineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitFileschema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FiledesciptContext extends HeaderLineContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FiledesciptContext(HeaderLineContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitFiledescipt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderLineContext headerLine() throws RecognitionException {
		HeaderLineContext _localctx = new HeaderLineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_headerLine);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new FiledesciptContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(T__0);
				setState(38);
				match(T__1);
				setState(39);
				argumentList();
				setState(40);
				match(T__2);
				setState(41);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new FilenameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__4);
				setState(44);
				match(T__1);
				setState(45);
				match(STRING);
				setState(46);
				match(T__5);
				setState(47);
				argumentList();
				setState(48);
				match(T__2);
				setState(49);
				match(T__3);
				}
				break;
			case T__6:
				_localctx = new FileschemaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(T__6);
				setState(52);
				match(T__1);
				setState(53);
				match(T__1);
				setState(54);
				match(STRING);
				setState(55);
				match(T__2);
				setState(56);
				match(T__2);
				setState(57);
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

	public static class DataContext extends ParserRuleContext {
		public List<DataLineContext> dataLine() {
			return getRuleContexts(DataLineContext.class);
		}
		public DataLineContext dataLine(int i) {
			return getRuleContext(DataLineContext.class,i);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(DATA);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(61);
				dataLine();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(ENDSEC);
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

	public static class DataLineContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(STEPGrammarParser.INT, 0); }
		public TypedListArgumentContext typedListArgument() {
			return getRuleContext(TypedListArgumentContext.class,0);
		}
		public DataLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitDataLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataLineContext dataLine() throws RecognitionException {
		DataLineContext _localctx = new DataLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__7);
			setState(70);
			match(INT);
			setState(71);
			match(T__8);
			setState(72);
			typedListArgument();
			setState(73);
			match(T__3);
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

	public static class TypedListArgumentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(STEPGrammarParser.NAME, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TypedListArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedListArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitTypedListArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedListArgumentContext typedListArgument() throws RecognitionException {
		TypedListArgumentContext _localctx = new TypedListArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedListArgument);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(NAME);
				setState(76);
				match(T__1);
				setState(77);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(NAME);
				setState(79);
				match(T__1);
				setState(80);
				argumentList();
				setState(81);
				match(T__2);
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

	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(STEPGrammarParser.INT, 0); }
		public TypedListArgumentContext typedListArgument() {
			return getRuleContext(TypedListArgumentContext.class,0);
		}
		public TerminalNode NEGINT() { return getToken(STEPGrammarParser.NEGINT, 0); }
		public TerminalNode INTEXP() { return getToken(STEPGrammarParser.INTEXP, 0); }
		public TerminalNode FLOAT() { return getToken(STEPGrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(STEPGrammarParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(STEPGrammarParser.BOOLEAN, 0); }
		public TerminalNode ENUM() { return getToken(STEPGrammarParser.ENUM, 0); }
		public TerminalNode OVERRIDE() { return getToken(STEPGrammarParser.OVERRIDE, 0); }
		public TerminalNode NONDEF() { return getToken(STEPGrammarParser.NONDEF, 0); }
		public ListArgumentContext listArgument() {
			return getRuleContext(ListArgumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(T__7);
				setState(86);
				match(INT);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				typedListArgument();
				}
				break;
			case NONDEF:
			case OVERRIDE:
			case BOOLEAN:
			case INT:
			case NEGINT:
			case INTEXP:
			case FLOAT:
			case ENUM:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONDEF) | (1L << OVERRIDE) | (1L << BOOLEAN) | (1L << INT) | (1L << NEGINT) | (1L << INTEXP) | (1L << FLOAT) | (1L << ENUM) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__1:
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				listArgument();
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

	public static class ListArgumentContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ListArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitListArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListArgumentContext listArgument() throws RecognitionException {
		ListArgumentContext _localctx = new ListArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listArgument);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__9);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__1);
				setState(94);
				argumentList();
				setState(95);
				match(T__2);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof STEPGrammarVisitor ) return ((STEPGrammarVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			argument();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(100);
				match(T__5);
				setState(101);
				argument();
				}
				}
				setState(106);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36n\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\5\2"+
		"\27\n\2\3\2\5\2\32\n\2\3\2\3\2\3\2\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\5\b]\n\b\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\n\3\n\3\n\7\ni"+
		"\n\n\f\n\16\nl\13\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\20\30\2p\2"+
		"\24\3\2\2\2\4\36\3\2\2\2\6<\3\2\2\2\b>\3\2\2\2\nG\3\2\2\2\fU\3\2\2\2\16"+
		"\\\3\2\2\2\20c\3\2\2\2\22e\3\2\2\2\24\26\7\31\2\2\25\27\5\4\3\2\26\25"+
		"\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\32\5\b\5\2\31\30\3\2\2\2\31\32"+
		"\3\2\2\2\32\33\3\2\2\2\33\34\7\32\2\2\34\35\7\2\2\3\35\3\3\2\2\2\36\""+
		"\7\33\2\2\37!\5\6\4\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3"+
		"\2\2\2$\"\3\2\2\2%&\7\35\2\2&\5\3\2\2\2\'(\7\3\2\2()\7\4\2\2)*\5\22\n"+
		"\2*+\7\5\2\2+,\7\6\2\2,=\3\2\2\2-.\7\7\2\2./\7\4\2\2/\60\7\30\2\2\60\61"+
		"\7\b\2\2\61\62\5\22\n\2\62\63\7\5\2\2\63\64\7\6\2\2\64=\3\2\2\2\65\66"+
		"\7\t\2\2\66\67\7\4\2\2\678\7\4\2\289\7\30\2\29:\7\5\2\2:;\7\5\2\2;=\7"+
		"\6\2\2<\'\3\2\2\2<-\3\2\2\2<\65\3\2\2\2=\7\3\2\2\2>B\7\34\2\2?A\5\n\6"+
		"\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\35"+
		"\2\2F\t\3\2\2\2GH\7\n\2\2HI\7\23\2\2IJ\7\13\2\2JK\5\f\7\2KL\7\6\2\2L\13"+
		"\3\2\2\2MN\7\36\2\2NO\7\4\2\2OV\7\5\2\2PQ\7\36\2\2QR\7\4\2\2RS\5\22\n"+
		"\2ST\7\5\2\2TV\3\2\2\2UM\3\2\2\2UP\3\2\2\2V\r\3\2\2\2WX\7\n\2\2X]\7\23"+
		"\2\2Y]\5\f\7\2Z]\t\2\2\2[]\5\20\t\2\\W\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\"+
		"[\3\2\2\2]\17\3\2\2\2^d\7\f\2\2_`\7\4\2\2`a\5\22\n\2ab\7\5\2\2bd\3\2\2"+
		"\2c^\3\2\2\2c_\3\2\2\2d\21\3\2\2\2ej\5\16\b\2fg\7\b\2\2gi\5\16\b\2hf\3"+
		"\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\23\3\2\2\2lj\3\2\2\2\13\26\31\""+
		"<BU\\cj";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}