package Demo04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
反射获取成员变量并使用
*/
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("Demo02.Student");

        //获取成员变量并使用
/*
字段[] getFields() 返回一个包含 字段对象的数组， 字段对象反映此 类对象所表示的类或接口的所有可访问公共字段。 **获取全部成员变量**

字段[] getDeclaredFields() 返回 字段对象的数组， 字段对象反映由此 类对象表示的类或接口声明的所有字段。 **获取全部公共成员变量**

字段 getField (String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定公共成员字段   **根据指定名称获取成员变量**

字段 getDeclaredField (String name) 返回 字段对象，该对象反映此 类对象表示的类或接口的指定声明字段。  **根据指定名称获取公共成员变量**

*/

        /*Field[] fields = c.getFields();
        for(Field f:fields){
            System.out.println(f);
        }*/

       /* Field[] declaredFields = c.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }*/

        Field addressField = c.getField("address");
        System.out.println(addressField + "\n");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //obj的成员变量赋值
//        obj.addressField="西安";

//        字段提供有关类或接口的单个字段的信息和动态访问。
        addressField.set(obj, "西安");//对象obj的addressFiled字段赋值为"西安"
        System.out.println(obj);


    }
}
