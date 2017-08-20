package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VariableRefStatement implements Statement {
    
    private final String name;
    
    @Override
    public Object evaluate(Scope scope) {
        return scope.resolveVariable(name);
    }
}
