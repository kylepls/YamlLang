package in.kyle.yaml.internal;

public interface Statement<T> {
    
    Statement EMPTY = scope -> "";
    
    static <R> Statement<R> constant(R value) {
        return scope -> value;
    }
    
    T evaluate(Scope scope);
}
