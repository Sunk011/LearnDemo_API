package Demo03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Demo02.Student");
//        构造器<?>[]  getConstructors()   返回一个包含 构造器对象的数组， 构造器对象反映了此类对象所表示的类的所有公共构造函数。
        Constructor<?>[] cons1 = c.getConstructors();//返回公共的构造方法
        for (Constructor con : cons1) {
            System.out.println(con);
        }
        System.out.println("-----------------");

//        构造器<?>[] getDeclaredConstructors() 返回 构造器对象的数组， 构造器对象反映由此 类对象表示的类声明的所有构造函数。
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        for (Constructor con : cons2) {
            System.out.println(con);
        }
        System.out.println("-----------------");

//        构造器<T> getConstructor(类<?>... parameterTypes) 返回一个 构造器对象，该对象反映此 类对象所表示的类的指定公共构造函数。
        Constructor<?> con3 = c.getConstructor();
        System.out.println(con3);
        System.out.println("-----------------");

//构造器提供有关类的单个构造函数的信息和访问权限。
//T newInstance (Object... initargs) 使用此 构造器对象表示的构造方法，使用指定的初始化参数创建和初始化构造函数声明类的新实例
        Object obj = con3.newInstance();
//        Student s=new Student();
//        System.out.println(s);
        System.out.println(obj);
        System.out.println("-----------------");



//构造器<T> getDeclaredConstructor(类<?>... parameterTypes) 返回一个 构造器对象，该对象反映此 类对象所表示的类或接口的指定构造函数。
//      参数：要获取的构造方法的参数的个数和数据类型对应的字节码文件对象
//        c.getConstructor(Class)

    }
}
