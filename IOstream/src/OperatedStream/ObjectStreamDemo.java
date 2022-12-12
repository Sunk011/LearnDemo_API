package OperatedStream;

import java.io.*;
/*
    用对象序列化一个对象后，修改了对象所属的类文件，读取文件是否会出问题？
    final和long类型的字段来显式声明其自己的serialVersionUID：
        Exception in thread "main" java.io.InvalidClassException:
        OperatedStream.Student;
        local class incompatible: stream classdesc serialVersionUID = -6190788115286738158,
        local class serialVersionUID = -520528922981945268
    Serialization运行时检测到类的以下问题之一时抛出。
        "该类的串行版本与从流中读取的类描述符的版本不匹配"
        该类包含未知的数据类型
        该类没有可访问的no-arg构造函数

    该如何解决？
    对象所属的类加一个值:    private static final long serialVersionUID = 42L;

    一个对象中的某个成员变量的值不想被序列化，该如何实现？
    为成员变量添加 transient        private transient int age;

    */

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    //    对象序列化
    private static void write() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IOstream\\os.txt"));
        Student s = new Student("jake", 19);
        oos.writeObject(s);
        Student s1 = new Student("jake", 19);
        oos.writeObject(s1);
        oos.close();
    }

    //    对象反序列化
    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IOstream\\os.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s.getName() + "  " + s.getAge());
        ois.close();

    }
}
