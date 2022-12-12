package Demo05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //get Class
        Class<?> c = Class.forName("Demo02.Student");

        //get ClassMethod
/*
方法 getMethod (String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此 类对象表示的类或接口的指定公共成员方法。

方法[] getMethods () 返回一个包含 方法对象的数组， 方法对象反映此 类对象所表示的类或接口的所有公共方法，包括由类或接口声明的那些以及从超类和超接口继承的那些。

方法 getDeclaredMethod (String name, 类<?>... parameterTypes) 返回 方法对象，该对象反映此 类对象表示的类或接口的指定声明方法。

方法[] getDeclaredMethods () 返回一个包含 方法对象的数组， 方法对象反映此 类对象表示的类或接口的所有已声明方法，包括public，protected，default（package）访问和私有方法，但不包括继承的方法。
*/
        Method[] declaredMethods = c.getDeclaredMethods();//包含继承的方法
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("------------------");

        Method[] methods = c.getMethods();//只有本类中的方法
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println("------------------");

        Method method1 = c.getMethod("method1");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        con.setAccessible(true);
        Object obj = con.newInstance();

//        方法提供有关类或接口上的单个方法的信息和访问权限
//        Object[返回值类型] invoke (Object[调用方法的对象] obj, Object[方法需要的参数]... args) 在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
        method1.invoke(obj);//调用对象obj的mothod1方法，参数为空

    }
}
