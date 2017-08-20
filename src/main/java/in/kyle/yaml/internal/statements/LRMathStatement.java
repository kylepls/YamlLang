package in.kyle.yaml.internal.statements;

import java.util.function.BiFunction;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LRMathStatement implements Statement<Integer> {
    
    private final Statement left;
    private final Statement right;
    private final BiFunction<Integer, Integer, Integer> function;
    
    @Override
    public Integer evaluate(Scope scope) {
        return function.apply((int) left.evaluate(scope), (int) right.evaluate(scope));
    }
}
