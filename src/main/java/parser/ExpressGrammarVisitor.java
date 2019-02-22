// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\ExpressGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(ExpressGrammarParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#beginSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginSchema(ExpressGrammarParser.BeginSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(ExpressGrammarParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#beginEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginEntity(ExpressGrammarParser.BeginEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#entityType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityType(ExpressGrammarParser.EntityTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subtype}
	 * labeled alternative in {@link ExpressGrammarParser#subtypeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype(ExpressGrammarParser.SubtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#supertypeOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupertypeOf(ExpressGrammarParser.SupertypeOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attr}
	 * labeled alternative in {@link ExpressGrammarParser#entityArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(ExpressGrammarParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#collectionOf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOf(ExpressGrammarParser.CollectionOfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#collectionArgPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionArgPart(ExpressGrammarParser.CollectionArgPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#beginNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginNameList(ExpressGrammarParser.BeginNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#endNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndNameList(ExpressGrammarParser.EndNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(ExpressGrammarParser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames(ExpressGrammarParser.NamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(ExpressGrammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExpressGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#inversePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInversePart(ExpressGrammarParser.InversePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#inverseSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInverseSentence(ExpressGrammarParser.InverseSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#derivePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivePart(ExpressGrammarParser.DerivePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#deriveOverrideSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriveOverrideSentence(ExpressGrammarParser.DeriveOverrideSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#deriveSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriveSentence(ExpressGrammarParser.DeriveSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#uniquePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniquePart(ExpressGrammarParser.UniquePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#uniqueSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueSentence(ExpressGrammarParser.UniqueSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#wherePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWherePart(ExpressGrammarParser.WherePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#whereSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereSentence(ExpressGrammarParser.WhereSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ExpressGrammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#therule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTherule(ExpressGrammarParser.TheruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#commonKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonKeyword(ExpressGrammarParser.CommonKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#commonSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonSentence(ExpressGrammarParser.CommonSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#typeSingleKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSingleKeyword(ExpressGrammarParser.TypeSingleKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#typeArrayKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArrayKeyword(ExpressGrammarParser.TypeArrayKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#typeKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeKeyword(ExpressGrammarParser.TypeKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#innerKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerKeyword(ExpressGrammarParser.InnerKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressGrammarParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(ExpressGrammarParser.SignContext ctx);
}