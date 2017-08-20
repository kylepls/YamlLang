package in.kyle.yaml;

import java.util.ArrayList;
import java.util.function.BiFunction;

import in.kyle.yaml.antlr.YAMLBaseVisitor;
import in.kyle.yaml.antlr.YAMLParser;
import in.kyle.yaml.internal.Function;
import in.kyle.yaml.internal.Statement;
import in.kyle.yaml.internal.statements.AddStatement;
import in.kyle.yaml.internal.statements.AssignStatement;
import in.kyle.yaml.internal.statements.BlockStatement;
import in.kyle.yaml.internal.statements.CompareStatement;
import in.kyle.yaml.internal.statements.ElIfStatement;
import in.kyle.yaml.internal.statements.EqualityStatement;
import in.kyle.yaml.internal.statements.FunctionCall;
import in.kyle.yaml.internal.statements.IfStatement;
import in.kyle.yaml.internal.statements.LRMathStatement;
import in.kyle.yaml.internal.statements.NotStatement;
import in.kyle.yaml.internal.statements.ValueStatement;
import in.kyle.yaml.internal.statements.VariableRefStatement;
import in.kyle.yaml.internal.statements.WhileStatement;
import in.kyle.yaml.internal.statements.array.ArrayAccStatement;
import in.kyle.yaml.internal.statements.array.ArraySetStatement;

public class Constructor extends YAMLBaseVisitor<Statement> {
    
    @Override
    public Function visitFile(YAMLParser.FileContext ctx) {
        Function currentFunction = new Function();
        for (YAMLParser.ContentContext contentContext : ctx.content()) {
            Statement statement = visitContent(contentContext);
            if (statement != null) {
                currentFunction.addStatement(statement);
            }
        }
        return currentFunction;
    }
    
    @Override
    public Statement visitIf_stmt(YAMLParser.If_stmtContext ctx) {
        IfStatement ifStatement = new IfStatement(visitExpr(ctx.condition),
                                                  visitBlock(ctx.block()),
                                                  visitElse_stmt(ctx.else_stmt()));
        for (YAMLParser.Else_if_stmtContext context : ctx.else_if_stmt()) {
            ifStatement.addElse((ElIfStatement) visitElse_if_stmt(context));
        }
        return ifStatement;
    }
    
    @Override
    public Statement visitElse_if_stmt(YAMLParser.Else_if_stmtContext ctx) {
        return new ElIfStatement(visitExpr(ctx.expr()), visitBlock(ctx.block()));
    }
    
    @Override
    public Statement visitElse_stmt(YAMLParser.Else_stmtContext ctx) {
        if (ctx != null) {
            return visitBlock(ctx.block());
        } else {
            return Statement.EMPTY;
        }
    }
    
    @Override
    public Statement visitWhile_stmt(YAMLParser.While_stmtContext ctx) {
        return new WhileStatement(visitExpr(ctx.condition), visitBlock(ctx.block()));
    }
    
    @Override
    public Statement visitAssign(YAMLParser.AssignContext ctx) {
        return new AssignStatement(ctx.ID().getText(), visitExpr(ctx.expr()));
    }
    
    @Override
    public Statement visitBlock(YAMLParser.BlockContext ctx) {
        BlockStatement statement = new BlockStatement();
        for (YAMLParser.ContentContext context : ctx.content()) {
            statement.addStatement(visitContent(context));
        }
        return statement;
    }
    
    @Override
    public Statement visitFunction_call(YAMLParser.Function_callContext ctx) {
        if (ctx.function_expr() != null) {
            return visitFunction_expr(ctx.function_expr());
        } else {
            return visitFunction_list(ctx.function_list());
        }
    }
    
    @Override
    public Statement visitFunction_expr(YAMLParser.Function_exprContext ctx) {
        FunctionCall call = new FunctionCall(ctx.FUNCTION_ID().getText());
        call.addArg(visitExpr(ctx.expr()));
        return call;
    }
    
    @Override
    public Statement visitFunction_list(YAMLParser.Function_listContext ctx) {
        FunctionCall call = new FunctionCall(ctx.FUNCTION_ID().getText());
        for (YAMLParser.List_itemContext context : ctx.list().list_item()) {
            call.addArg(visitExpr(context.expr()));
        }
        return call;
    }
    
    public Statement visitExpr(YAMLParser.ExprContext ctx) {
        if (ctx instanceof YAMLParser.MULDIVContext) {
            return visitMULDIV((YAMLParser.MULDIVContext) ctx);
        } else if (ctx instanceof YAMLParser.ADDContext) {
            return visitADD((YAMLParser.ADDContext) ctx);
        } else if (ctx instanceof YAMLParser.SUBContext) {
            return visitSUB((YAMLParser.SUBContext) ctx);
        } else if (ctx instanceof YAMLParser.EQContext) {
            return visitEQ((YAMLParser.EQContext) ctx);
        } else if (ctx instanceof YAMLParser.NOTEQContext) {
            return visitNOTEQ((YAMLParser.NOTEQContext) ctx);
        } else if (ctx instanceof YAMLParser.NOTContext) {
            return visitNOT((YAMLParser.NOTContext) ctx);
        } else if (ctx instanceof YAMLParser.PARENSContext) {
            return visitPARENS((YAMLParser.PARENSContext) ctx);
        } else if (ctx instanceof YAMLParser.WRAPContext) {
            return visitWRAP((YAMLParser.WRAPContext) ctx);
        } else if (ctx instanceof YAMLParser.STRINGContext) {
            return visitSTRING((YAMLParser.STRINGContext) ctx);
        } else if (ctx instanceof YAMLParser.NUMBERContext) {
            return visitNUMBER((YAMLParser.NUMBERContext) ctx);
        } else if (ctx instanceof YAMLParser.BOOLContext) {
            return visitBOOL((YAMLParser.BOOLContext) ctx);
        } else if (ctx instanceof YAMLParser.IDContext) {
            return visitID((YAMLParser.IDContext) ctx);
        } else if (ctx instanceof YAMLParser.LESSGREATContext) {
            return visitLESSGREAT((YAMLParser.LESSGREATContext) ctx);
        } else if (ctx instanceof YAMLParser.ACCESSContext) {
            return visitACCESS((YAMLParser.ACCESSContext) ctx);
        } else {
            return Statement.EMPTY;
        }
    }
    
    @Override
    public Statement visitACCESS(YAMLParser.ACCESSContext ctx) {
        return visitArray_acc(ctx.array_acc());
    }
    
    @Override
    public Statement visitArray_acc(YAMLParser.Array_accContext ctx) {
        return new ArrayAccStatement(new VariableRefStatement(ctx.ID().getText()),
                                     visitExpr(ctx.expr()));
    }
    
    @Override
    public Statement visitArray_set(YAMLParser.Array_setContext ctx) {
        return new ArraySetStatement(new VariableRefStatement(ctx.ID().getText()),
                                     ctx.index_expr != null ? visitExpr(ctx.index_expr) : null,
                                     visitExpr(ctx.value_expr));
    }
    
    @Override
    public Statement visitArray_dec(YAMLParser.Array_decContext ctx) {
        return new AssignStatement(ctx.ID().getText(), Statement.constant(new ArrayList<>()));
    }
    
    @Override
    public Statement visitLESSGREAT(YAMLParser.LESSGREATContext ctx) {
        BiFunction<Integer, Integer, Boolean> function;
        if (ctx.op.getType() == YAMLParser.LT) {
            function = (l, r) -> l < r;
        } else {
            function = (l, r) -> l > r;
        }
        return new CompareStatement(visitExpr(ctx.left), visitExpr(ctx.right), function);
    }
    
    @Override
    public Statement visitMULDIV(YAMLParser.MULDIVContext ctx) {
        BiFunction<Integer, Integer, Integer> function;
        if (ctx.op.getType() == YAMLParser.MUL) {
            function = (l, r) -> l * r;
        } else {
            function = (l, r) -> l / r;
        }
        return new LRMathStatement(visitExpr(ctx.left), visitExpr(ctx.right), function);
    }
    
    @Override
    public Statement visitADD(YAMLParser.ADDContext ctx) {
        return new AddStatement(visitExpr(ctx.left), visitExpr(ctx.right));
    }
    
    @Override
    public Statement visitSUB(YAMLParser.SUBContext ctx) {
        BiFunction<Integer, Integer, Integer> function = (l, r) -> l - r;
        return new LRMathStatement(visitExpr(ctx.left), visitExpr(ctx.right), function);
    }
    
    @Override
    public Statement visitEQ(YAMLParser.EQContext ctx) {
        return new EqualityStatement(false, visitExpr(ctx.left), visitExpr(ctx.right));
    }
    
    @Override
    public Statement visitNOTEQ(YAMLParser.NOTEQContext ctx) {
        return new EqualityStatement(true, visitExpr(ctx.left), visitExpr(ctx.right));
    }
    
    @Override
    public Statement visitPARENS(YAMLParser.PARENSContext ctx) {
        return visitExpr(ctx.expr());
    }
    
    @Override
    public Statement visitWRAP(YAMLParser.WRAPContext ctx) {
        return visitExpr(ctx.expr());
    }
    
    @Override
    public Statement visitNOT(YAMLParser.NOTContext ctx) {
        return new NotStatement(visitExpr(ctx.expr()));
    }
    
    @Override
    public Statement visitSTRING(YAMLParser.STRINGContext ctx) {
        String text = ctx.STRING().getText();
        return new ValueStatement(text.substring(1, text.length() - 1));
    }
    
    @Override
    public Statement visitNUMBER(YAMLParser.NUMBERContext ctx) {
        return new ValueStatement(Integer.parseInt(ctx.NUMBER().getText()));
    }
    
    @Override
    public Statement visitBOOL(YAMLParser.BOOLContext ctx) {
        return new ValueStatement(Boolean.parseBoolean(ctx.BOOL().getText()));
    }
    
    @Override
    public Statement visitID(YAMLParser.IDContext ctx) {
        return new VariableRefStatement(ctx.ID().getText());
    }
}
