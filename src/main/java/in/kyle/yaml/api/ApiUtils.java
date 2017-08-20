package in.kyle.yaml.api;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import in.kyle.yaml.internal.ObjectAdapterFactory;
import in.kyle.yaml.internal.Scope;
import in.kyle.yaml.internal.statements.SystemFunction;

public class ApiUtils {
    public static void registerMethods(Class<?> clazz, Scope scope) {
        for (Method method : clazz.getDeclaredMethods()) {
            scope.addFunction(method.getName(), toSystemFunction(method));
        }
    }
    
    public static SystemFunction toSystemFunction(Method method) {
        return new SystemFunction(getParamNames(method)) {
            @Override
            protected Object call(Map<String, Object> args) {
                try {
                    Object[] params = args.values().toArray();
                    for (int i = 0; i < params.length; i++) {
                        Object o = params[i];
                        Class<?> target = method.getParameters()[i].getType();
                        Class<?> current = o.getClass();
                        if (!target.isAssignableFrom(current)) {
                            params[i] = ObjectAdapterFactory.convertTo(o, target);
                        }
                    }
                    return method.invoke(null, params);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }
    
    private static String[] getParamNames(Method method) {
        String[] names = new String[method.getParameters().length];
        for (int i = 0; i < method.getParameters().length; i++) {
            names[i] = method.getParameters()[i].getName();
        }
        return names;
    }
}
