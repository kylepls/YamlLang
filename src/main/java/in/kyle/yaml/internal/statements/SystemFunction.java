package in.kyle.yaml.internal.statements;

import java.util.HashMap;
import java.util.Map;

import in.kyle.yaml.internal.Function;
import in.kyle.yaml.internal.Scope;

public abstract class SystemFunction extends Function {
    
    public SystemFunction(String... args) {
        for (String arg : args) {
            addArg(arg);
        }
    }
    
    @Override
    public Object evaluate(Scope parent) {
        Map<String, Object> args = new HashMap<>();
        for (String s : getArgNames()) {
            args.put(s, parent.resolveVariable(s));
        }
        return call(args);
    }
    
    protected abstract Object call(Map<String, Object> args);
}
