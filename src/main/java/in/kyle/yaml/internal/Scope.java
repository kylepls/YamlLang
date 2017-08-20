package in.kyle.yaml.internal;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Scope {
    
    private final Scope parent;
    
    private final Map<String, Object> variables = new HashMap<>();
    private final Map<String, Function> functions = new HashMap<>();
    
    public Object resolveVariable(String name) {
        if (variables.containsKey(name)) {
            return variables.get(name);
        } else {
            if (parent != null) {
                return parent.resolveVariable(name);
            } else {
                throw new RuntimeException("No variable " + name);
            }
        }
    }
    
    public void setVariable(String name, Object value) {
        variables.put(name, value);
    }
    
    public void addFunction(String name, Function value) {
        functions.put(name, value);
    }
    
    public Function resolveFunction(String name) {
        if (functions.containsKey(name)) {
            return functions.get(name);
        } else {
            if (parent != null) {
                return parent.resolveFunction(name);
            } else {
                throw new RuntimeException("No function " + name);
            }
        }
    }
    
    public Scope getOwningScope(String variable) {
        if (variables.containsKey(variable)) {
            return this;
        } else {
            if (parent != null) {
                return parent.getOwningScope(variable);
            } else {
                return this;
            }
        }
    }
}
