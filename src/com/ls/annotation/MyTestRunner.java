package src.com.ls.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射注解
 */
public class MyTestRunner {
    public static void main(String[] args) throws Exception {
        Class<AnnotationDemoTest> clazz = AnnotationDemoTest.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            boolean hasMyTest = method.isAnnotationPresent(MyTest.class);
            if (hasMyTest) {
                method.invoke(clazz.newInstance());
            }
        }
    }
}
