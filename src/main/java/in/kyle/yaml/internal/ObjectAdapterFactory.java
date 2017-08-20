package in.kyle.yaml.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectAdapterFactory {
    
    private static final Map<Class<?>, ObjectAdapter<?>> adapters = new HashMap<>();
    
    static {
        for (Method method : ObjectAdapterFactory.class.getDeclaredMethods()) {
            if (Modifier.isStatic(method.getModifiers()) &&
                Modifier.isPrivate(method.getModifiers())) {
                adapters.put(method.getReturnType(), o -> {
                    try {
                        return method.invoke(null, o);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException();
                    }
                });
            }
        }
    }
    
    private static Integer convertInt(Object o) {
        return Integer.parseInt(o.toString());
    }
    
    private static String convertString(Object o) {
        return o.toString();
    }
    
    private static <T> List<T> convertList(Object o) {
        if (o instanceof List) {
            return (List<T>) o;
        } else {
            throw new RuntimeException("Invalid type for list " + o);
        }
    }
    
    private static Object[] convertArray(Object o) {
        return (Object[]) o;
    }
    
    public static <T> T convertTo(Object object, Class<T> target) {
        if (adapters.containsKey(target)) {
            return (T) adapters.get(target).convert(object);
        } else {
            throw new RuntimeException(
                    "No adapter for " + object + " to " + target.getSimpleName());
        }
    }
    
    interface ObjectAdapter<T> {
        T convert(Object o);
    }
}
