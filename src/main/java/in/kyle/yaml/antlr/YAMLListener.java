// Generated from C:/Users/Kyle/Desktop/Projects/Java/YamlLang-New/src/main/antlr\YAML.g4 by ANTLR 4.7
package in.kyle.yaml.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YAMLParser}.
 */
public interface YAMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link YAMLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(YAMLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(YAMLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(YAMLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(YAMLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(YAMLParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(YAMLParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_stmt(YAMLParser.Else_if_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#else_if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_stmt(YAMLParser.Else_if_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(YAMLParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(YAMLParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(YAMLParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(YAMLParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(YAMLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(YAMLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(YAMLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(YAMLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(YAMLParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(YAMLParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expr(YAMLParser.Function_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expr(YAMLParser.Function_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(YAMLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(YAMLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(YAMLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(YAMLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#list_item}.
	 * @param ctx the parse tree
	 */
	void enterList_item(YAMLParser.List_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#list_item}.
	 * @param ctx the parse tree
	 */
	void exitList_item(YAMLParser.List_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#array_dec}.
	 * @param ctx the parse tree
	 */
	void enterArray_dec(YAMLParser.Array_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#array_dec}.
	 * @param ctx the parse tree
	 */
	void exitArray_dec(YAMLParser.Array_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#array_set}.
	 * @param ctx the parse tree
	 */
	void enterArray_set(YAMLParser.Array_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#array_set}.
	 * @param ctx the parse tree
	 */
	void exitArray_set(YAMLParser.Array_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link YAMLParser#array_acc}.
	 * @param ctx the parse tree
	 */
	void enterArray_acc(YAMLParser.Array_accContext ctx);
	/**
	 * Exit a parse tree produced by {@link YAMLParser#array_acc}.
	 * @param ctx the parse tree
	 */
	void exitArray_acc(YAMLParser.Array_accContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADD(YAMLParser.ADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADD}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADD(YAMLParser.ADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSUB(YAMLParser.SUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUB}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSUB(YAMLParser.SUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WRAP}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWRAP(YAMLParser.WRAPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WRAP}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWRAP(YAMLParser.WRAPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNUMBER(YAMLParser.NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMBER}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNUMBER(YAMLParser.NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEQ(YAMLParser.EQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EQ}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEQ(YAMLParser.EQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LESSGREAT}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLESSGREAT(YAMLParser.LESSGREATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LESSGREAT}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLESSGREAT(YAMLParser.LESSGREATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOTEQ}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNOTEQ(YAMLParser.NOTEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOTEQ}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNOTEQ(YAMLParser.NOTEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNOT(YAMLParser.NOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNOT(YAMLParser.NOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENS}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENS(YAMLParser.PARENSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENS}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENS(YAMLParser.PARENSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBOOL(YAMLParser.BOOLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BOOL}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBOOL(YAMLParser.BOOLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSTRING(YAMLParser.STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSTRING(YAMLParser.STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(YAMLParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(YAMLParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULDIV}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULDIV(YAMLParser.MULDIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULDIV}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULDIV(YAMLParser.MULDIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ACCESS}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterACCESS(YAMLParser.ACCESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACCESS}
	 * labeled alternative in {@link YAMLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitACCESS(YAMLParser.ACCESSContext ctx);
}