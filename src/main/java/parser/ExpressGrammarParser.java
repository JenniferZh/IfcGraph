// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\ExpressGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressGrammarParser extends Parser {
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
	public static final int
		RULE_schema = 0, RULE_beginSchema = 1, RULE_entity = 2, RULE_beginEntity = 3, 
		RULE_entityType = 4, RULE_subtypeOf = 5, RULE_supertypeOf = 6, RULE_entityArgument = 7, 
		RULE_collectionOf = 8, RULE_collectionArgPart = 9, RULE_beginNameList = 10, 
		RULE_endNameList = 11, RULE_nameList = 12, RULE_names = 13, RULE_typeName = 14, 
		RULE_type = 15, RULE_inversePart = 16, RULE_inverseSentence = 17, RULE_derivePart = 18, 
		RULE_deriveOverrideSentence = 19, RULE_deriveSentence = 20, RULE_uniquePart = 21, 
		RULE_uniqueSentence = 22, RULE_wherePart = 23, RULE_whereSentence = 24, 
		RULE_function = 25, RULE_therule = 26, RULE_commonKeyword = 27, RULE_commonSentence = 28, 
		RULE_typeSingleKeyword = 29, RULE_typeArrayKeyword = 30, RULE_typeKeyword = 31, 
		RULE_innerKeyword = 32, RULE_sign = 33;
	public static final String[] ruleNames = {
		"schema", "beginSchema", "entity", "beginEntity", "entityType", "subtypeOf", 
		"supertypeOf", "entityArgument", "collectionOf", "collectionArgPart", 
		"beginNameList", "endNameList", "nameList", "names", "typeName", "type", 
		"inversePart", "inverseSentence", "derivePart", "deriveOverrideSentence", 
		"deriveSentence", "uniquePart", "uniqueSentence", "wherePart", "whereSentence", 
		"function", "therule", "commonKeyword", "commonSentence", "typeSingleKeyword", 
		"typeArrayKeyword", "typeKeyword", "innerKeyword", "sign"
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

	@Override
	public String getGrammarFileName() { return "ExpressGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SchemaContext extends ParserRuleContext {
		public BeginSchemaContext beginSchema() {
			return getRuleContext(BeginSchemaContext.class,0);
		}
		public TerminalNode END_SCHEMA() { return getToken(ExpressGrammarParser.END_SCHEMA, 0); }
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<TheruleContext> therule() {
			return getRuleContexts(TheruleContext.class);
		}
		public TheruleContext therule(int i) {
			return getRuleContext(TheruleContext.class,i);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			beginSchema();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << ENTITY) | (1L << FUNCTION) | (1L << RULE))) != 0)) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENTITY:
					{
					setState(69);
					entity();
					}
					break;
				case TYPE:
					{
					setState(70);
					type();
					}
					break;
				case FUNCTION:
					{
					setState(71);
					function();
					}
					break;
				case RULE:
					{
					setState(72);
					therule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(END_SCHEMA);
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

	public static class BeginSchemaContext extends ParserRuleContext {
		public TerminalNode SCHEMA() { return getToken(ExpressGrammarParser.SCHEMA, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public BeginSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginSchema; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitBeginSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginSchemaContext beginSchema() throws RecognitionException {
		BeginSchemaContext _localctx = new BeginSchemaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_beginSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(SCHEMA);
			setState(81);
			match(NAME);
			setState(82);
			match(T__0);
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

	public static class EntityContext extends ParserRuleContext {
		public BeginEntityContext beginEntity() {
			return getRuleContext(BeginEntityContext.class,0);
		}
		public TerminalNode END_ENTITY() { return getToken(ExpressGrammarParser.END_ENTITY, 0); }
		public List<EntityTypeContext> entityType() {
			return getRuleContexts(EntityTypeContext.class);
		}
		public EntityTypeContext entityType(int i) {
			return getRuleContext(EntityTypeContext.class,i);
		}
		public List<EntityArgumentContext> entityArgument() {
			return getRuleContexts(EntityArgumentContext.class);
		}
		public EntityArgumentContext entityArgument(int i) {
			return getRuleContext(EntityArgumentContext.class,i);
		}
		public List<InversePartContext> inversePart() {
			return getRuleContexts(InversePartContext.class);
		}
		public InversePartContext inversePart(int i) {
			return getRuleContext(InversePartContext.class,i);
		}
		public List<DerivePartContext> derivePart() {
			return getRuleContexts(DerivePartContext.class);
		}
		public DerivePartContext derivePart(int i) {
			return getRuleContext(DerivePartContext.class,i);
		}
		public List<WherePartContext> wherePart() {
			return getRuleContexts(WherePartContext.class);
		}
		public WherePartContext wherePart(int i) {
			return getRuleContext(WherePartContext.class,i);
		}
		public List<UniquePartContext> uniquePart() {
			return getRuleContexts(UniquePartContext.class);
		}
		public UniquePartContext uniquePart(int i) {
			return getRuleContext(UniquePartContext.class,i);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			beginEntity();
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case SUBTYPE_OF:
				case SUPERTYPE_OF:
				case ABSTRACT:
					{
					setState(85);
					entityType();
					}
					break;
				case NAME:
					{
					setState(86);
					entityArgument();
					}
					break;
				case INVERSE:
					{
					setState(87);
					inversePart();
					}
					break;
				case DERIVE:
					{
					setState(88);
					derivePart();
					}
					break;
				case WHERE:
					{
					setState(89);
					wherePart();
					}
					break;
				case UNIQUE:
					{
					setState(90);
					uniquePart();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SUBTYPE_OF) | (1L << SUPERTYPE_OF) | (1L << ABSTRACT) | (1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE) | (1L << NAME))) != 0) );
			setState(95);
			match(END_ENTITY);
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

	public static class BeginEntityContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(ExpressGrammarParser.ENTITY, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public BeginEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginEntity; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitBeginEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginEntityContext beginEntity() throws RecognitionException {
		BeginEntityContext _localctx = new BeginEntityContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_beginEntity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ENTITY);
			setState(98);
			match(NAME);
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

	public static class EntityTypeContext extends ParserRuleContext {
		public List<SubtypeOfContext> subtypeOf() {
			return getRuleContexts(SubtypeOfContext.class);
		}
		public SubtypeOfContext subtypeOf(int i) {
			return getRuleContext(SubtypeOfContext.class,i);
		}
		public List<SupertypeOfContext> supertypeOf() {
			return getRuleContexts(SupertypeOfContext.class);
		}
		public SupertypeOfContext supertypeOf(int i) {
			return getRuleContext(SupertypeOfContext.class,i);
		}
		public EntityTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEntityType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityTypeContext entityType() throws RecognitionException {
		EntityTypeContext _localctx = new EntityTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_entityType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBTYPE_OF) | (1L << SUPERTYPE_OF) | (1L << ABSTRACT))) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUBTYPE_OF:
					{
					setState(100);
					subtypeOf();
					}
					break;
				case SUPERTYPE_OF:
				case ABSTRACT:
					{
					setState(101);
					supertypeOf();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__0);
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

	public static class SubtypeOfContext extends ParserRuleContext {
		public SubtypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtypeOf; }
	 
		public SubtypeOfContext() { }
		public void copyFrom(SubtypeOfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubtypeContext extends SubtypeOfContext {
		public TerminalNode SUBTYPE_OF() { return getToken(ExpressGrammarParser.SUBTYPE_OF, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public SubtypeContext(SubtypeOfContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSubtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubtypeOfContext subtypeOf() throws RecognitionException {
		SubtypeOfContext _localctx = new SubtypeOfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subtypeOf);
		try {
			_localctx = new SubtypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(SUBTYPE_OF);
			setState(110);
			match(T__1);
			setState(111);
			match(NAME);
			setState(112);
			match(T__2);
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

	public static class SupertypeOfContext extends ParserRuleContext {
		public TerminalNode SUPERTYPE_OF() { return getToken(ExpressGrammarParser.SUPERTYPE_OF, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode ABSTRACT() { return getToken(ExpressGrammarParser.ABSTRACT, 0); }
		public TerminalNode ONEOF() { return getToken(ExpressGrammarParser.ONEOF, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public SupertypeOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supertypeOf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSupertypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupertypeOfContext supertypeOf() throws RecognitionException {
		SupertypeOfContext _localctx = new SupertypeOfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_supertypeOf);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT) {
					{
					setState(114);
					match(ABSTRACT);
					}
				}

				setState(117);
				match(SUPERTYPE_OF);
				setState(118);
				match(T__1);
				setState(119);
				match(NAME);
				setState(120);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ABSTRACT) {
					{
					setState(121);
					match(ABSTRACT);
					}
				}

				setState(124);
				match(SUPERTYPE_OF);
				setState(125);
				match(T__1);
				setState(126);
				match(ONEOF);
				setState(127);
				nameList();
				setState(128);
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

	public static class EntityArgumentContext extends ParserRuleContext {
		public EntityArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityArgument; }
	 
		public EntityArgumentContext() { }
		public void copyFrom(EntityArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrContext extends EntityArgumentContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public TerminalNode OPTIONAL() { return getToken(ExpressGrammarParser.OPTIONAL, 0); }
		public AttrContext(EntityArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityArgumentContext entityArgument() throws RecognitionException {
		EntityArgumentContext _localctx = new EntityArgumentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_entityArgument);
		int _la;
		try {
			_localctx = new AttrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(NAME);
			setState(133);
			match(T__3);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL) {
				{
				setState(134);
				match(OPTIONAL);
				}
			}

			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(137);
				typeName();
				}
				break;
			case 2:
				{
				setState(138);
				collectionOf();
				setState(139);
				typeName();
				}
				break;
			case 3:
				{
				setState(141);
				collectionOf();
				setState(142);
				collectionArgPart();
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

	public static class CollectionOfContext extends ParserRuleContext {
		public TypeArrayKeywordContext typeArrayKeyword() {
			return getRuleContext(TypeArrayKeywordContext.class,0);
		}
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public List<TerminalNode> INT() { return getTokens(ExpressGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExpressGrammarParser.INT, i);
		}
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode UNIQUE() { return getToken(ExpressGrammarParser.UNIQUE, 0); }
		public CollectionOfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionOf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCollectionOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionOfContext collectionOf() throws RecognitionException {
		CollectionOfContext _localctx = new CollectionOfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_collectionOf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			typeArrayKeyword();
			{
			setState(147);
			match(T__4);
			setState(148);
			match(INT);
			setState(149);
			match(T__3);
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << INT) | (1L << NAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			match(T__6);
			}
			setState(153);
			match(OF);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(154);
				match(UNIQUE);
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

	public static class CollectionArgPartContext extends ParserRuleContext {
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public CollectionArgPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionArgPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCollectionArgPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionArgPartContext collectionArgPart() throws RecognitionException {
		CollectionArgPartContext _localctx = new CollectionArgPartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_collectionArgPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(157);
				collectionOf();
				setState(158);
				typeName();
				}
				break;
			case 2:
				{
				setState(160);
				collectionOf();
				setState(161);
				collectionArgPart();
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

	public static class BeginNameListContext extends ParserRuleContext {
		public BeginNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitBeginNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginNameListContext beginNameList() throws RecognitionException {
		BeginNameListContext _localctx = new BeginNameListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_beginNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__1);
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

	public static class EndNameListContext extends ParserRuleContext {
		public EndNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endNameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitEndNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndNameListContext endNameList() throws RecognitionException {
		EndNameListContext _localctx = new EndNameListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endNameList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__2);
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

	public static class NameListContext extends ParserRuleContext {
		public BeginNameListContext beginNameList() {
			return getRuleContext(BeginNameListContext.class,0);
		}
		public EndNameListContext endNameList() {
			return getRuleContext(EndNameListContext.class,0);
		}
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nameList);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				beginNameList();
				setState(170);
				endNameList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				beginNameList();
				setState(173);
				names(0);
				setState(174);
				endNameList();
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

	public static class NamesContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public NamesContext names() {
			return getRuleContext(NamesContext.class,0);
		}
		public NamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamesContext names() throws RecognitionException {
		return names(0);
	}

	private NamesContext names(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NamesContext _localctx = new NamesContext(_ctx, _parentState);
		NamesContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_names, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(179);
			match(NAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NamesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_names);
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					match(T__7);
					setState(183);
					match(NAME);
					}
					} 
				}
				setState(188);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode INT() { return getToken(ExpressGrammarParser.INT, 0); }
		public TypeSingleKeywordContext typeSingleKeyword() {
			return getRuleContext(TypeSingleKeywordContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeName);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(NAME);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(190);
					match(T__1);
					setState(191);
					match(INT);
					setState(192);
					match(T__2);
					}
				}

				}
				break;
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				typeSingleKeyword();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(196);
					match(T__1);
					setState(197);
					match(INT);
					setState(198);
					match(T__2);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ExpressGrammarParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode END_TYPE() { return getToken(ExpressGrammarParser.END_TYPE, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public TerminalNode ENUMERATION() { return getToken(ExpressGrammarParser.ENUMERATION, 0); }
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(ExpressGrammarParser.SELECT, 0); }
		public TerminalNode FIXED() { return getToken(ExpressGrammarParser.FIXED, 0); }
		public List<WherePartContext> wherePart() {
			return getRuleContexts(WherePartContext.class);
		}
		public WherePartContext wherePart(int i) {
			return getRuleContext(WherePartContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(TYPE);
			setState(204);
			match(NAME);
			setState(205);
			match(T__8);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(206);
				typeName();
				}
				break;
			case 2:
				{
				setState(207);
				collectionOf();
				setState(208);
				typeName();
				}
				break;
			case 3:
				{
				setState(210);
				collectionOf();
				setState(211);
				collectionArgPart();
				}
				break;
			case 4:
				{
				setState(213);
				match(ENUMERATION);
				setState(214);
				match(OF);
				setState(215);
				nameList();
				}
				break;
			case 5:
				{
				setState(216);
				match(SELECT);
				setState(217);
				nameList();
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FIXED) {
				{
				setState(220);
				match(FIXED);
				}
			}

			setState(223);
			match(T__0);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHERE) {
				{
				{
				setState(224);
				wherePart();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(END_TYPE);
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

	public static class InversePartContext extends ParserRuleContext {
		public TerminalNode INVERSE() { return getToken(ExpressGrammarParser.INVERSE, 0); }
		public List<InverseSentenceContext> inverseSentence() {
			return getRuleContexts(InverseSentenceContext.class);
		}
		public InverseSentenceContext inverseSentence(int i) {
			return getRuleContext(InverseSentenceContext.class,i);
		}
		public InversePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitInversePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InversePartContext inversePart() throws RecognitionException {
		InversePartContext _localctx = new InversePartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inversePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(INVERSE);
			setState(234); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(233);
					inverseSentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class InverseSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public TerminalNode FOR() { return getToken(ExpressGrammarParser.FOR, 0); }
		public CollectionOfContext collectionOf() {
			return getRuleContext(CollectionOfContext.class,0);
		}
		public InverseSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inverseSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitInverseSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InverseSentenceContext inverseSentence() throws RecognitionException {
		InverseSentenceContext _localctx = new InverseSentenceContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inverseSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			match(NAME);
			setState(239);
			match(T__3);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ARRAY) | (1L << LIST))) != 0)) {
				{
				setState(240);
				collectionOf();
				}
			}

			setState(243);
			match(NAME);
			setState(244);
			match(FOR);
			setState(245);
			match(NAME);
			setState(246);
			match(T__0);
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

	public static class DerivePartContext extends ParserRuleContext {
		public DeriveOverrideSentenceContext ov;
		public TerminalNode DERIVE() { return getToken(ExpressGrammarParser.DERIVE, 0); }
		public List<DeriveSentenceContext> deriveSentence() {
			return getRuleContexts(DeriveSentenceContext.class);
		}
		public DeriveSentenceContext deriveSentence(int i) {
			return getRuleContext(DeriveSentenceContext.class,i);
		}
		public List<DeriveOverrideSentenceContext> deriveOverrideSentence() {
			return getRuleContexts(DeriveOverrideSentenceContext.class);
		}
		public DeriveOverrideSentenceContext deriveOverrideSentence(int i) {
			return getRuleContext(DeriveOverrideSentenceContext.class,i);
		}
		public DerivePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitDerivePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivePartContext derivePart() throws RecognitionException {
		DerivePartContext _localctx = new DerivePartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_derivePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(DERIVE);
			setState(251); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(249);
						deriveSentence();
						}
						break;
					case 2:
						{
						setState(250);
						((DerivePartContext)_localctx).ov = deriveOverrideSentence();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(253); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeriveOverrideSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CommonSentenceContext commonSentence() {
			return getRuleContext(CommonSentenceContext.class,0);
		}
		public DeriveOverrideSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriveOverrideSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitDeriveOverrideSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeriveOverrideSentenceContext deriveOverrideSentence() throws RecognitionException {
		DeriveOverrideSentenceContext _localctx = new DeriveOverrideSentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_deriveOverrideSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SELF_) {
				{
				{
				setState(255);
				match(SELF_);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(NAME);
			setState(262);
			match(T__9);
			setState(263);
			match(NAME);
			setState(264);
			match(T__3);
			setState(265);
			typeName();
			setState(266);
			match(T__10);
			setState(267);
			commonSentence();
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

	public static class DeriveSentenceContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public CommonSentenceContext commonSentence() {
			return getRuleContext(CommonSentenceContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CollectionArgPartContext collectionArgPart() {
			return getRuleContext(CollectionArgPartContext.class,0);
		}
		public DeriveSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriveSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitDeriveSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeriveSentenceContext deriveSentence() throws RecognitionException {
		DeriveSentenceContext _localctx = new DeriveSentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_deriveSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(NAME);
			setState(270);
			match(T__3);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
			case NAME:
				{
				setState(271);
				typeName();
				}
				break;
			case SET:
			case ARRAY:
			case LIST:
				{
				setState(272);
				collectionArgPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			match(T__10);
			setState(276);
			commonSentence();
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

	public static class UniquePartContext extends ParserRuleContext {
		public TerminalNode UNIQUE() { return getToken(ExpressGrammarParser.UNIQUE, 0); }
		public List<UniqueSentenceContext> uniqueSentence() {
			return getRuleContexts(UniqueSentenceContext.class);
		}
		public UniqueSentenceContext uniqueSentence(int i) {
			return getRuleContext(UniqueSentenceContext.class,i);
		}
		public UniquePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniquePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitUniquePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniquePartContext uniquePart() throws RecognitionException {
		UniquePartContext _localctx = new UniquePartContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_uniquePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(UNIQUE);
			setState(280); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(279);
					uniqueSentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class UniqueSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public UniqueSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uniqueSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitUniqueSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniqueSentenceContext uniqueSentence() throws RecognitionException {
		UniqueSentenceContext _localctx = new UniqueSentenceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uniqueSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(NAME);
			setState(285);
			match(T__3);
			setState(286);
			match(NAME);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(287);
				match(T__7);
				setState(288);
				match(NAME);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__0);
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

	public static class WherePartContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExpressGrammarParser.WHERE, 0); }
		public List<WhereSentenceContext> whereSentence() {
			return getRuleContexts(WhereSentenceContext.class);
		}
		public WhereSentenceContext whereSentence(int i) {
			return getRuleContext(WhereSentenceContext.class,i);
		}
		public WherePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherePart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitWherePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WherePartContext wherePart() throws RecognitionException {
		WherePartContext _localctx = new WherePartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_wherePart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(WHERE);
			setState(298); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(297);
					whereSentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class WhereSentenceContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public CommonSentenceContext commonSentence() {
			return getRuleContext(CommonSentenceContext.class,0);
		}
		public WhereSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitWhereSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereSentenceContext whereSentence() throws RecognitionException {
		WhereSentenceContext _localctx = new WhereSentenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whereSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(NAME);
			setState(303);
			match(T__3);
			setState(304);
			commonSentence();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ExpressGrammarParser.FUNCTION, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode END_FUNCTION() { return getToken(ExpressGrammarParser.END_FUNCTION, 0); }
		public List<CommonKeywordContext> commonKeyword() {
			return getRuleContexts(CommonKeywordContext.class);
		}
		public CommonKeywordContext commonKeyword(int i) {
			return getRuleContext(CommonKeywordContext.class,i);
		}
		public List<CommonSentenceContext> commonSentence() {
			return getRuleContexts(CommonSentenceContext.class);
		}
		public CommonSentenceContext commonSentence(int i) {
			return getRuleContext(CommonSentenceContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(FUNCTION);
			setState(307);
			match(NAME);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHERE:
				case DERIVE:
				case UNIQUE:
				case INVERSE:
					{
					setState(308);
					commonKeyword();
					}
					break;
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case INT:
				case ONEOF:
				case ABSTRACT:
				case OPTIONAL:
				case FIXED:
				case OF:
				case SET:
				case ARRAY:
				case LIST:
				case BOOLEAN:
				case REAL:
				case INTEGER:
				case BINARY:
				case NUMBER:
				case STRING:
				case ENUMERATION:
				case SELECT:
				case SELF_:
				case FOR:
				case NAME:
					{
					setState(309);
					commonSentence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << INT) | (1L << ONEOF) | (1L << ABSTRACT) | (1L << OPTIONAL) | (1L << FIXED) | (1L << OF) | (1L << SET) | (1L << ARRAY) | (1L << LIST) | (1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING) | (1L << ENUMERATION) | (1L << SELECT) | (1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE) | (1L << SELF_) | (1L << FOR) | (1L << NAME))) != 0) );
			setState(314);
			match(END_FUNCTION);
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

	public static class TheruleContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(ExpressGrammarParser.RULE, 0); }
		public TerminalNode NAME() { return getToken(ExpressGrammarParser.NAME, 0); }
		public TerminalNode END_RULE() { return getToken(ExpressGrammarParser.END_RULE, 0); }
		public List<CommonKeywordContext> commonKeyword() {
			return getRuleContexts(CommonKeywordContext.class);
		}
		public CommonKeywordContext commonKeyword(int i) {
			return getRuleContext(CommonKeywordContext.class,i);
		}
		public List<CommonSentenceContext> commonSentence() {
			return getRuleContexts(CommonSentenceContext.class);
		}
		public CommonSentenceContext commonSentence(int i) {
			return getRuleContext(CommonSentenceContext.class,i);
		}
		public TheruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_therule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTherule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TheruleContext therule() throws RecognitionException {
		TheruleContext _localctx = new TheruleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_therule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(RULE);
			setState(317);
			match(NAME);
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHERE:
				case DERIVE:
				case UNIQUE:
				case INVERSE:
					{
					setState(318);
					commonKeyword();
					}
					break;
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case INT:
				case ONEOF:
				case ABSTRACT:
				case OPTIONAL:
				case FIXED:
				case OF:
				case SET:
				case ARRAY:
				case LIST:
				case BOOLEAN:
				case REAL:
				case INTEGER:
				case BINARY:
				case NUMBER:
				case STRING:
				case ENUMERATION:
				case SELECT:
				case SELF_:
				case FOR:
				case NAME:
					{
					setState(319);
					commonSentence();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << INT) | (1L << ONEOF) | (1L << ABSTRACT) | (1L << OPTIONAL) | (1L << FIXED) | (1L << OF) | (1L << SET) | (1L << ARRAY) | (1L << LIST) | (1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING) | (1L << ENUMERATION) | (1L << SELECT) | (1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE) | (1L << SELF_) | (1L << FOR) | (1L << NAME))) != 0) );
			setState(324);
			match(END_RULE);
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

	public static class CommonKeywordContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExpressGrammarParser.WHERE, 0); }
		public TerminalNode DERIVE() { return getToken(ExpressGrammarParser.DERIVE, 0); }
		public TerminalNode UNIQUE() { return getToken(ExpressGrammarParser.UNIQUE, 0); }
		public TerminalNode INVERSE() { return getToken(ExpressGrammarParser.INVERSE, 0); }
		public CommonKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCommonKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonKeywordContext commonKeyword() throws RecognitionException {
		CommonKeywordContext _localctx = new CommonKeywordContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_commonKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHERE) | (1L << DERIVE) | (1L << UNIQUE) | (1L << INVERSE))) != 0)) ) {
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

	public static class CommonSentenceContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ExpressGrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ExpressGrammarParser.NAME, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExpressGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExpressGrammarParser.INT, i);
		}
		public List<SignContext> sign() {
			return getRuleContexts(SignContext.class);
		}
		public SignContext sign(int i) {
			return getRuleContext(SignContext.class,i);
		}
		public List<InnerKeywordContext> innerKeyword() {
			return getRuleContexts(InnerKeywordContext.class);
		}
		public InnerKeywordContext innerKeyword(int i) {
			return getRuleContext(InnerKeywordContext.class,i);
		}
		public CommonSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitCommonSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonSentenceContext commonSentence() throws RecognitionException {
		CommonSentenceContext _localctx = new CommonSentenceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_commonSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NAME:
					{
					setState(328);
					match(NAME);
					}
					break;
				case INT:
					{
					setState(329);
					match(INT);
					}
					break;
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
					{
					setState(330);
					sign();
					}
					break;
				case ONEOF:
				case ABSTRACT:
				case OPTIONAL:
				case FIXED:
				case OF:
				case SET:
				case ARRAY:
				case LIST:
				case BOOLEAN:
				case REAL:
				case INTEGER:
				case BINARY:
				case NUMBER:
				case STRING:
				case ENUMERATION:
				case SELECT:
				case SELF_:
				case FOR:
					{
					setState(331);
					innerKeyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << INT) | (1L << ONEOF) | (1L << ABSTRACT) | (1L << OPTIONAL) | (1L << FIXED) | (1L << OF) | (1L << SET) | (1L << ARRAY) | (1L << LIST) | (1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING) | (1L << ENUMERATION) | (1L << SELECT) | (1L << SELF_) | (1L << FOR) | (1L << NAME))) != 0) );
			setState(336);
			match(T__0);
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

	public static class TypeSingleKeywordContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ExpressGrammarParser.BOOLEAN, 0); }
		public TerminalNode REAL() { return getToken(ExpressGrammarParser.REAL, 0); }
		public TerminalNode INTEGER() { return getToken(ExpressGrammarParser.INTEGER, 0); }
		public TerminalNode BINARY() { return getToken(ExpressGrammarParser.BINARY, 0); }
		public TerminalNode NUMBER() { return getToken(ExpressGrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ExpressGrammarParser.STRING, 0); }
		public TypeSingleKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSingleKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeSingleKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSingleKeywordContext typeSingleKeyword() throws RecognitionException {
		TypeSingleKeywordContext _localctx = new TypeSingleKeywordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeSingleKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << REAL) | (1L << INTEGER) | (1L << BINARY) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
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

	public static class TypeArrayKeywordContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ExpressGrammarParser.SET, 0); }
		public TerminalNode ARRAY() { return getToken(ExpressGrammarParser.ARRAY, 0); }
		public TerminalNode LIST() { return getToken(ExpressGrammarParser.LIST, 0); }
		public TypeArrayKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArrayKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeArrayKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayKeywordContext typeArrayKeyword() throws RecognitionException {
		TypeArrayKeywordContext _localctx = new TypeArrayKeywordContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeArrayKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SET) | (1L << ARRAY) | (1L << LIST))) != 0)) ) {
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

	public static class TypeKeywordContext extends ParserRuleContext {
		public TypeSingleKeywordContext typeSingleKeyword() {
			return getRuleContext(TypeSingleKeywordContext.class,0);
		}
		public TypeArrayKeywordContext typeArrayKeyword() {
			return getRuleContext(TypeArrayKeywordContext.class,0);
		}
		public TerminalNode ENUMERATION() { return getToken(ExpressGrammarParser.ENUMERATION, 0); }
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public TerminalNode SELECT() { return getToken(ExpressGrammarParser.SELECT, 0); }
		public TypeKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitTypeKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeKeywordContext typeKeyword() throws RecognitionException {
		TypeKeywordContext _localctx = new TypeKeywordContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeKeyword);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				typeSingleKeyword();
				}
				break;
			case SET:
			case ARRAY:
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				typeArrayKeyword();
				}
				break;
			case ENUMERATION:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(ENUMERATION);
				setState(345);
				match(OF);
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				match(SELECT);
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

	public static class InnerKeywordContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(ExpressGrammarParser.ONEOF, 0); }
		public TerminalNode ABSTRACT() { return getToken(ExpressGrammarParser.ABSTRACT, 0); }
		public TerminalNode OPTIONAL() { return getToken(ExpressGrammarParser.OPTIONAL, 0); }
		public TerminalNode OF() { return getToken(ExpressGrammarParser.OF, 0); }
		public TerminalNode FIXED() { return getToken(ExpressGrammarParser.FIXED, 0); }
		public TerminalNode SELF_() { return getToken(ExpressGrammarParser.SELF_, 0); }
		public TerminalNode FOR() { return getToken(ExpressGrammarParser.FOR, 0); }
		public TypeKeywordContext typeKeyword() {
			return getRuleContext(TypeKeywordContext.class,0);
		}
		public InnerKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerKeyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitInnerKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerKeywordContext innerKeyword() throws RecognitionException {
		InnerKeywordContext _localctx = new InnerKeywordContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_innerKeyword);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONEOF:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(ONEOF);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(ABSTRACT);
				}
				break;
			case OPTIONAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(351);
				match(OPTIONAL);
				}
				break;
			case OF:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(OF);
				}
				break;
			case FIXED:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(FIXED);
				}
				break;
			case SELF_:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				match(SELF_);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				match(FOR);
				}
				break;
			case SET:
			case ARRAY:
			case LIST:
			case BOOLEAN:
			case REAL:
			case INTEGER:
			case BINARY:
			case NUMBER:
			case STRING:
			case ENUMERATION:
			case SELECT:
				enterOuterAlt(_localctx, 8);
				{
				setState(356);
				typeKeyword();
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

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressGrammarVisitor ) return ((ExpressGrammarVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		case 13:
			return names_sempred((NamesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean names_sempred(NamesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3@\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4^\n\4\r\4\16\4_\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\5\bv\n\b\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0085\n\b\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0093\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00a6\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00bb\n\17\f\17\16\17\u00be\13\17\3\20\3\20\3\20\3\20\5\20\u00c4\n\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00ca\n\20\5\20\u00cc\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dd"+
		"\n\21\3\21\5\21\u00e0\n\21\3\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7"+
		"\13\21\3\21\3\21\3\22\3\22\6\22\u00ed\n\22\r\22\16\22\u00ee\3\23\3\23"+
		"\3\23\5\23\u00f4\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\6\24\u00fe"+
		"\n\24\r\24\16\24\u00ff\3\25\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0114\n\26"+
		"\3\26\3\26\3\26\3\27\3\27\6\27\u011b\n\27\r\27\16\27\u011c\3\30\3\30\3"+
		"\30\3\30\3\30\7\30\u0124\n\30\f\30\16\30\u0127\13\30\3\30\3\30\3\31\3"+
		"\31\6\31\u012d\n\31\r\31\16\31\u012e\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\6\33\u0139\n\33\r\33\16\33\u013a\3\33\3\33\3\34\3\34\3\34\3\34\6"+
		"\34\u0143\n\34\r\34\16\34\u0144\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\6\36\u014f\n\36\r\36\16\36\u0150\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3"+
		"!\3!\5!\u015e\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0168\n\"\3#\3#\3"+
		"#\2\3\34$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BD\2\7\5\2\b\b\35\35@@\3\2:=\3\2\62\67\3\2/\61\3\2\4\32\2\u0183\2"+
		"F\3\2\2\2\4R\3\2\2\2\6V\3\2\2\2\bc\3\2\2\2\nj\3\2\2\2\fo\3\2\2\2\16\u0084"+
		"\3\2\2\2\20\u0086\3\2\2\2\22\u0094\3\2\2\2\24\u00a5\3\2\2\2\26\u00a7\3"+
		"\2\2\2\30\u00a9\3\2\2\2\32\u00b2\3\2\2\2\34\u00b4\3\2\2\2\36\u00cb\3\2"+
		"\2\2 \u00cd\3\2\2\2\"\u00ea\3\2\2\2$\u00f0\3\2\2\2&\u00fa\3\2\2\2(\u0104"+
		"\3\2\2\2*\u010f\3\2\2\2,\u0118\3\2\2\2.\u011e\3\2\2\2\60\u012a\3\2\2\2"+
		"\62\u0130\3\2\2\2\64\u0134\3\2\2\2\66\u013e\3\2\2\28\u0148\3\2\2\2:\u014e"+
		"\3\2\2\2<\u0154\3\2\2\2>\u0156\3\2\2\2@\u015d\3\2\2\2B\u0167\3\2\2\2D"+
		"\u0169\3\2\2\2FM\5\4\3\2GL\5\6\4\2HL\5 \21\2IL\5\64\33\2JL\5\66\34\2K"+
		"G\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"NP\3\2\2\2OM\3\2\2\2PQ\7\37\2\2Q\3\3\2\2\2RS\7\36\2\2ST\7@\2\2TU\7\3\2"+
		"\2U\5\3\2\2\2V]\5\b\5\2W^\5\n\6\2X^\5\20\t\2Y^\5\"\22\2Z^\5&\24\2[^\5"+
		"\60\31\2\\^\5,\27\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2\2]Z\3\2\2\2][\3\2\2\2"+
		"]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7#\2\2b\7\3\2\2"+
		"\2cd\7\"\2\2de\7@\2\2e\t\3\2\2\2fi\5\f\7\2gi\5\16\b\2hf\3\2\2\2hg\3\2"+
		"\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\3\2\2n\13\3"+
		"\2\2\2op\7(\2\2pq\7\4\2\2qr\7@\2\2rs\7\5\2\2s\r\3\2\2\2tv\7+\2\2ut\3\2"+
		"\2\2uv\3\2\2\2vw\3\2\2\2wx\7)\2\2xy\7\4\2\2yz\7@\2\2z\u0085\7\5\2\2{}"+
		"\7+\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7)\2\2\177\u0080\7\4\2\2\u0080"+
		"\u0081\7*\2\2\u0081\u0082\5\32\16\2\u0082\u0083\7\5\2\2\u0083\u0085\3"+
		"\2\2\2\u0084u\3\2\2\2\u0084|\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\7@\2"+
		"\2\u0087\u0089\7\6\2\2\u0088\u008a\7,\2\2\u0089\u0088\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u0092\3\2\2\2\u008b\u0093\5\36\20\2\u008c\u008d\5\22\n"+
		"\2\u008d\u008e\5\36\20\2\u008e\u0093\3\2\2\2\u008f\u0090\5\22\n\2\u0090"+
		"\u0091\5\24\13\2\u0091\u0093\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008c\3"+
		"\2\2\2\u0092\u008f\3\2\2\2\u0093\21\3\2\2\2\u0094\u0095\5> \2\u0095\u0096"+
		"\7\7\2\2\u0096\u0097\7\35\2\2\u0097\u0098\7\6\2\2\u0098\u0099\t\2\2\2"+
		"\u0099\u009a\7\t\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7.\2\2\u009c\u009e"+
		"\7<\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\23\3\2\2\2\u009f"+
		"\u00a0\5\22\n\2\u00a0\u00a1\5\36\20\2\u00a1\u00a6\3\2\2\2\u00a2\u00a3"+
		"\5\22\n\2\u00a3\u00a4\5\24\13\2\u00a4\u00a6\3\2\2\2\u00a5\u009f\3\2\2"+
		"\2\u00a5\u00a2\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\27\3"+
		"\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\31\3\2\2\2\u00ab\u00ac\5\26\f\2\u00ac"+
		"\u00ad\5\30\r\2\u00ad\u00b3\3\2\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\5"+
		"\34\17\2\u00b0\u00b1\5\30\r\2\u00b1\u00b3\3\2\2\2\u00b2\u00ab\3\2\2\2"+
		"\u00b2\u00ae\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\b\17\1\2\u00b5\u00b6"+
		"\7@\2\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8\f\4\2\2\u00b8\u00b9\7\n\2\2\u00b9"+
		"\u00bb\7@\2\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3"+
		"\7@\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2\7\35\2\2\u00c2\u00c4\7\5\2\2\u00c3"+
		"\u00c0\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5\u00c9\5<"+
		"\37\2\u00c6\u00c7\7\4\2\2\u00c7\u00c8\7\35\2\2\u00c8\u00ca\7\5\2\2\u00c9"+
		"\u00c6\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00bf\3\2"+
		"\2\2\u00cb\u00c5\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00ce\7 \2\2\u00ce\u00cf"+
		"\7@\2\2\u00cf\u00dc\7\13\2\2\u00d0\u00dd\5\36\20\2\u00d1\u00d2\5\22\n"+
		"\2\u00d2\u00d3\5\36\20\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\5\22\n\2\u00d5"+
		"\u00d6\5\24\13\2\u00d6\u00dd\3\2\2\2\u00d7\u00d8\78\2\2\u00d8\u00d9\7"+
		".\2\2\u00d9\u00dd\5\32\16\2\u00da\u00db\79\2\2\u00db\u00dd\5\32\16\2\u00dc"+
		"\u00d0\3\2\2\2\u00dc\u00d1\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d7\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\7-\2\2\u00df"+
		"\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e5\7\3"+
		"\2\2\u00e2\u00e4\5\60\31\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e9\7!\2\2\u00e9!\3\2\2\2\u00ea\u00ec\7=\2\2\u00eb\u00ed"+
		"\5$\23\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef#\3\2\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f3\7\6\2\2\u00f2"+
		"\u00f4\5\22\n\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3"+
		"\2\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8\7@\2\2\u00f8"+
		"\u00f9\7\3\2\2\u00f9%\3\2\2\2\u00fa\u00fd\7;\2\2\u00fb\u00fe\5*\26\2\u00fc"+
		"\u00fe\5(\25\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\'\3\2\2\2\u0101\u0103"+
		"\7>\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7@"+
		"\2\2\u0108\u0109\7\f\2\2\u0109\u010a\7@\2\2\u010a\u010b\7\6\2\2\u010b"+
		"\u010c\5\36\20\2\u010c\u010d\7\r\2\2\u010d\u010e\5:\36\2\u010e)\3\2\2"+
		"\2\u010f\u0110\7@\2\2\u0110\u0113\7\6\2\2\u0111\u0114\5\36\20\2\u0112"+
		"\u0114\5\24\13\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3"+
		"\2\2\2\u0115\u0116\7\r\2\2\u0116\u0117\5:\36\2\u0117+\3\2\2\2\u0118\u011a"+
		"\7<\2\2\u0119\u011b\5.\30\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d-\3\2\2\2\u011e\u011f\7@\2\2\u011f"+
		"\u0120\7\6\2\2\u0120\u0125\7@\2\2\u0121\u0122\7\n\2\2\u0122\u0124\7@\2"+
		"\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\3\2\2\u0129"+
		"/\3\2\2\2\u012a\u012c\7:\2\2\u012b\u012d\5\62\32\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\61"+
		"\3\2\2\2\u0130\u0131\7@\2\2\u0131\u0132\7\6\2\2\u0132\u0133\5:\36\2\u0133"+
		"\63\3\2\2\2\u0134\u0135\7$\2\2\u0135\u0138\7@\2\2\u0136\u0139\58\35\2"+
		"\u0137\u0139\5:\36\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\7%\2\2\u013d\65\3\2\2\2\u013e\u013f\7&\2\2\u013f\u0142\7@\2\2\u0140"+
		"\u0143\58\35\2\u0141\u0143\5:\36\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\7\'\2\2\u0147\67\3\2\2\2\u0148\u0149\t\3\2"+
		"\2\u01499\3\2\2\2\u014a\u014f\7@\2\2\u014b\u014f\7\35\2\2\u014c\u014f"+
		"\5D#\2\u014d\u014f\5B\"\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7\3\2\2\u0153"+
		";\3\2\2\2\u0154\u0155\t\4\2\2\u0155=\3\2\2\2\u0156\u0157\t\5\2\2\u0157"+
		"?\3\2\2\2\u0158\u015e\5<\37\2\u0159\u015e\5> \2\u015a\u015b\78\2\2\u015b"+
		"\u015e\7.\2\2\u015c\u015e\79\2\2\u015d\u0158\3\2\2\2\u015d\u0159\3\2\2"+
		"\2\u015d\u015a\3\2\2\2\u015d\u015c\3\2\2\2\u015eA\3\2\2\2\u015f\u0168"+
		"\7*\2\2\u0160\u0168\7+\2\2\u0161\u0168\7,\2\2\u0162\u0168\7.\2\2\u0163"+
		"\u0168\7-\2\2\u0164\u0168\7>\2\2\u0165\u0168\7?\2\2\u0166\u0168\5@!\2"+
		"\u0167\u015f\3\2\2\2\u0167\u0160\3\2\2\2\u0167\u0161\3\2\2\2\u0167\u0162"+
		"\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0166\3\2\2\2\u0168C\3\2\2\2\u0169\u016a\t\6\2\2\u016aE\3\2\2\2(KM]_"+
		"hju|\u0084\u0089\u0092\u009d\u00a5\u00b2\u00bc\u00c3\u00c9\u00cb\u00dc"+
		"\u00df\u00e5\u00ee\u00f3\u00fd\u00ff\u0104\u0113\u011c\u0125\u012e\u0138"+
		"\u013a\u0142\u0144\u014e\u0150\u015d\u0167";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}