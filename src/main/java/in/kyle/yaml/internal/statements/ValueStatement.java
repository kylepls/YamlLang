package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ValueStatement<T> implements Statement<T> {
    
    private final T value;
    
    @Override
    public T evaluate(Scope scope) {
        return value;
    }
}
