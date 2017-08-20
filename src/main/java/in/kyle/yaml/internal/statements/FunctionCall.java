package in.kyle.yaml.internal.statements;

import java.util.ArrayList;
import java.util.List;

import in.kyle.yaml.internal.Function;
import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FunctionCall implements Statement{
    
    private final String name;
    private final List<Statement> args = new ArrayList<>();
    
    public void addArg(Statement statement) {
        args.add(statement);
    }
    
    @Override
    public Object evaluate(Scope scope) {
        Scope evalScope = new Scope(scope); // TODO: 8/19/2017 Fix 
        Function function = scope.resolveFunction(name);
        for (int i = 0; i < args.size(); i++) {
            String name = function.getArgNames().get(i);
            Object value = args.get(i).evaluate(scope);
            evalScope.setVariable(name, value);
        }
        return function.evaluate(evalScope);
    }
}
