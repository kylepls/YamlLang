package in.kyle.yaml.internal;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Function implements Statement {
    
    private final List<String> argNames = new ArrayList<>();
    private final List<Statement> statements = new ArrayList<>();
    
    public void addStatement(Statement statement) {
        statements.add(statement);
    }
    
    public void addArg(String name) {
        argNames.add(name);
    }
    
    @Override
    public Object evaluate(Scope parent) {
        Scope scope = new Scope(parent);
        for (Statement statement : statements) {
            statement.evaluate(scope);
        }
        return null;
    }
}
