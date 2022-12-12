package Exercise;

/*
Student s=new Student("林青霞");
System.out.println(s);
*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo_02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("Demo02.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class);
       /* 使用私有构造方法异常
        Object obj = con.newInstance("林青霞");*/

        //暴力反射
//void setAccessible (boolean flag) 将此反射对象的 accessible标志设置为指示的布尔值。  值true表示反射对象在使用时应禁止检查Java语言访问控制
        con.setAccessible(true);
        Object obj = con.newInstance("林青霞");


        System.out.println(obj);


    }
}
