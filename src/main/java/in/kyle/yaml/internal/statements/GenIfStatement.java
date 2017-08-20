package in.kyle.yaml.internal.statements;

import in.kyle.yaml.internal.Statement;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class GenIfStatement implements Statement<Boolean> {
    
    protected final Statement<Boolean> condition;
    protected final Statement<Void> block;
}
