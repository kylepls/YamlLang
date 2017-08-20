package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotStatement implements Statement<Boolean> {
    
    private final Statement<Boolean> statement;
    
    @Override
    public Boolean evaluate(Scope scope) {
        return !statement.evaluate(scope);
    }
}
