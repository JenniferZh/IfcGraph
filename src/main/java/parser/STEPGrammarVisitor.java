// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\STEPGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link STEPGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface STEPGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#ifcFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcFile(STEPGrammarParser.IfcFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(STEPGrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filedescipt}
	 * labeled alternative in {@link STEPGrammarParser#headerLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiledescipt(STEPGrammarParser.FiledesciptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filename}
	 * labeled alternative in {@link STEPGrammarParser#headerLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(STEPGrammarParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fileschema}
	 * labeled alternative in {@link STEPGrammarParser#headerLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileschema(STEPGrammarParser.FileschemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(STEPGrammarParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#dataLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataLine(STEPGrammarParser.DataLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#typedListArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedListArgument(STEPGrammarParser.TypedListArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(STEPGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#listArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListArgument(STEPGrammarParser.ListArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link STEPGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(STEPGrammarParser.ArgumentListContext ctx);
}