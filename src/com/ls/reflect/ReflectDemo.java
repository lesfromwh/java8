package src.com.ls.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author liushuang 2017/8/28
 * 获取字段值.
 */
public class ReflectDemo {
    public static void main(String[] args) {
        User user = new User();
        user.setName("ls");
        user.setAge(23);
        Class<? extends User> c = user.getClass();
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            //拿到字段值
            String name = field.getName();
            String methodName = "get"+name.substring(0,1).toUpperCase()+name.substring(1);
            try {
                Method method = c.getMethod(methodName);
//                Object value = method.invoke(user);   // value   name=ls  age=23
                Object value = method.invoke(c.newInstance());// newInstance()生产的对象是一个初始对象. value 都是默认值null.
                System.out.println(value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
