package in.kyle.yaml.internal.statements.array;

import java.util.List;

import in.kyle.yaml.internal.ObjectAdapterFactory;
import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ArraySetStatement implements Statement {
    
    private final Statement listStatement;
    private final Statement<Integer> indexStatement;
    private final Statement valueStatement;
    
    @Override
    public Object evaluate(Scope scope) {
        Object object = listStatement.evaluate(scope);
        List list = ObjectAdapterFactory.convertTo(object, List.class);
        int index;
        if (indexStatement != null) {
            Object evaluate = indexStatement.evaluate(scope);
            index = (Integer) evaluate;
        } else {
            index = list.size();
        }
        Object value = valueStatement.evaluate(scope);
        while (index >= list.size()) {
            list.add(new Object());
        }
        list.set(index, value);
        return null;
    }
}
