// Generated from C:/Users/Kyle/Desktop/Projects/Java/YamlLang-New/src/main/antlr\YAML.g4 by ANTLR 4.7
package in.kyle.yaml.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YAMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YAMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link YAMLParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(YAMLParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(YAMLParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(YAMLParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#else_if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_stmt(YAMLParser.Else_if_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(YAMLParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(YAMLParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(YAMLParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(YAMLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_list(YAMLParser.Function_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#function_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_expr(YAMLParser.Function_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(YAMLParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(YAMLParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_item(YAMLParser.List_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#array_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_dec(YAMLParser.Array_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#array_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_set(YAMLParser.Array_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link YAMLParser#array_acc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_acc(YAMLParser.Array_accContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADD(YAMLParser.ADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUB(YAMLParser.SUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WRAP}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWRAP(YAMLParser.WRAPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMBER(YAMLParser.NUMBERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEQ(YAMLParser.EQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LESSGREAT}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLESSGREAT(YAMLParser.LESSGREATContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOTEQ}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOTEQ(YAMLParser.NOTEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT(YAMLParser.NOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENS}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENS(YAMLParser.PARENSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBOOL(YAMLParser.BOOLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRING(YAMLParser.STRINGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(YAMLParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULDIV}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULDIV(YAMLParser.MULDIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ACCESS}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitACCESS(YAMLParser.ACCESSContext ctx);
}