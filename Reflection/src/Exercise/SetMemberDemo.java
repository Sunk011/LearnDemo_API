package Exercise;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
*  Student s=new Student();
        s.name= "林青霞";
        s.age= 30;
        s.address= "西安";
        System.out.println(s);*/
public class SetMemberDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取类对象
        Class<?> c = Class.forName("Demo02.Student");
        //获取类构造器
        Constructor<?> con = c.getConstructor();
        //暴力反射
        con.setAccessible(true);
        //创建对象
        Object obj = con.newInstance();

        //获取类的成员变量
        Field name = c.getDeclaredField("name");
        name.setAccessible(true);

        Field age = c.getDeclaredField("age");
        age.setAccessible(true);
        Field address = c.getDeclaredField("address");
        address.setAccessible(true);

        //为类的成员变量赋值
        name.set(obj, "林青霞");
        age.set(obj, 30);
        address.set(obj, "西安");

        System.out.println(obj);

    }
}
