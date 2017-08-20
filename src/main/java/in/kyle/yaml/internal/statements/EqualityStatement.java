package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EqualityStatement implements Statement<Boolean> {
    
    private final boolean inverse;
    private final Statement left;
    private final Statement right;
    
    @Override
    public Boolean evaluate(Scope scope) {
        boolean equals = left.evaluate(scope).equals(right.evaluate(scope));
        if (inverse) {
            equals = !equals;
        }
        return equals;
    }
}
