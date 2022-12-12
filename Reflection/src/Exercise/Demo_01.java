package Exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * Student s=new Student("林青霞", 30, "西安");
 * System.out.println(s);*/
public class Demo_01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("Demo02.Student");

        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);

    }
}
