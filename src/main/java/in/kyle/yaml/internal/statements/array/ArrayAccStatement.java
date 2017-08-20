package in.kyle.yaml.internal.statements.array;

import java.util.List;

import in.kyle.yaml.internal.ObjectAdapterFactory;
import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArrayAccStatement implements Statement {
    
    private final Statement expr; 
    private final Statement<Integer> indexExpr;
    
    @Override
    public Object evaluate(Scope scope) {
        Object o = expr.evaluate(scope);
        List list = ObjectAdapterFactory.convertTo(o, List.class);
        int index = indexExpr.evaluate(scope);
        return list.get(index);
    }
}
