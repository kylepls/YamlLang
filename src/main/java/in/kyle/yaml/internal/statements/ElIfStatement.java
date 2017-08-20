package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;

public class ElIfStatement extends GenIfStatement {
    
    public ElIfStatement(Statement<Boolean> condition, Statement<Void> block) {
        super(condition, block);
    }
    
    @Override
    public Boolean evaluate(Scope scope) {
        if (condition.evaluate(scope)) {
            block.evaluate(scope);
            return true;
        } else {
            return false;
        }
    }
}
