package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AssignStatement implements Statement<Void> {
    
    private final String name;
    private final Statement<Object> value;
    
    @Override
    public Void evaluate(Scope scope) {
        Scope owningScope = scope.getOwningScope(name);
        owningScope.setVariable(name, value.evaluate(scope));
        return null;
    }
}
