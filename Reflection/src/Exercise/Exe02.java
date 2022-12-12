package Exercise;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//通过配置文件运行类中的方法
public class Exe02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
/*        Student s=new Student();
        s.study();

        Teacher t=new Teacher();
        t.teach();*/

       /*
       * class.txt中配置
       *    className=xxxx
       *    methodName=xxxx*/
//        通过配置文件运行
        //加载数据
        Properties prop=new Properties();
        FileReader fr=new FileReader("Reflection\\class.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //通过反射使用
        Class<?> c = Class.forName(className);

        Constructor<?> con = c.getConstructor();

        Object obj = con.newInstance();

        Method method = c.getMethod(methodName);
        method.invoke(obj);


    }
}
