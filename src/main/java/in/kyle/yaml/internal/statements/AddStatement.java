package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddStatement implements Statement {
    private final Statement left;
    private final Statement right;
    
    @Override
    public Object evaluate(Scope scope) {
        Object le = left.evaluate(scope);
        Object re = right.evaluate(scope);
        if (le instanceof Integer && re instanceof Integer) {
            return ((int) le) + ((int) re);
        } else if (le instanceof String || re instanceof String) {
            return le.toString() + re.toString();
        } else {
            throw new RuntimeException("Cannot concat " + le + " and " + re);
        }
    }
}
