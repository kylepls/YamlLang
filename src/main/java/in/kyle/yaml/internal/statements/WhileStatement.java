package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WhileStatement implements Statement {
    
    private final Statement<Boolean> condition;
    private final Statement block;
    
    @Override
    public Object evaluate(Scope scope) {
        while (condition.evaluate(scope)) {
            block.evaluate(scope);
        }
        return null;
    }
}
