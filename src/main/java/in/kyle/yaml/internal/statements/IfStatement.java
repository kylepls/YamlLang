package in.kyle.yaml.internal.statements;

import java.util.ArrayList;
import java.util.List;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;

public class IfStatement extends GenIfStatement {
    
    private final List<ElIfStatement> elifs = new ArrayList<>();
    private final Statement<Void> elseBlock;
    
    public IfStatement(Statement<Boolean> condition,
                       Statement<Void> block,
                       Statement<Void> elseBlock) {
        super(condition, block);
        this.elseBlock = elseBlock;
    }
    
    public void addElse(ElIfStatement elIfStatement) {
        elifs.add(elIfStatement);
    }
    
    @Override
    public Boolean evaluate(Scope scope) {
        if (condition.evaluate(scope)) {
            block.evaluate(scope);
            return true;
        } else {
            for (ElIfStatement elif : elifs) {
                if (elif.evaluate(scope)) {
                    return true;
                }
            }
            elseBlock.evaluate(scope);
            return true;
        }
    }
}
