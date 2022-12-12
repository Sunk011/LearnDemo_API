package Exercise;
/*
    Student s=new Student();
    s.method1();
    s.method2("林青霞");
    String ss=s.method3("林青霞", 30);
    System.out.println(ss);
    s.function();
* */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SetMethodDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("Demo02.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method method1 = c.getMethod("method1");
        method1.setAccessible(true);


        Method method2 = c.getDeclaredMethod("method2", String.class);
        method2.setAccessible(true);


        Method method3 = c.getDeclaredMethod("method3", String.class, int.class);
        method3.setAccessible(true);


        Method function = c.getDeclaredMethod("function");
        function.setAccessible(true);


        Object i1 = method1.invoke(obj);


        Object i2 = method2.invoke(obj, "林青霞");

        Object i3 = method3.invoke(obj, "林青霞", 30);
        System.out.println(i3);


        Object f = function.invoke(obj);
    }
}
