package in.kyle.yaml.internal.statements;

import java.util.ArrayList;
import java.util.List;

import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.Statement;

public class BlockStatement<T> implements Statement<T> {
    
    private final List<Statement> statements = new ArrayList<>();
    
    public void addStatement(Statement statement) {
        statements.add(statement);
    }
    
    @Override
    public T evaluate(Scope scope) {
        for (Statement statement : statements) {
            statement.evaluate(scope);
        }
        return null;
    }
}
