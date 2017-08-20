package in.kyle.yaml.internal.statements;

import java.util.function.BiFunction;

import in.kyle.yaml.internal.ObjectAdapterFactory;
import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompareStatement implements Statement<Boolean> {
    
    private final Statement left;
    private final Statement right; 
    private final BiFunction<Integer, Integer, Boolean> function;
    
    @Override
    public Boolean evaluate(Scope scope) {
        Object le = left.evaluate(scope);
        Object re = right.evaluate(scope);
        
        int left = ObjectAdapterFactory.convertTo(le, Integer.class);
        int right = ObjectAdapterFactory.convertTo(re, Integer.class);
        
        return function.apply(left, right);
    }
}
