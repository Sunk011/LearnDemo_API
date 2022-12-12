package OperatedStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// NotSerializableException
// 当实例需要具有Serializable接口时抛出。 序列化运行时或实例的类可以抛出此异常。 参数应该是类的名称。未实现Serializable的类将不会将其任何状态序列化或反序列化。 可序列化类的所有子类型本身都是可序列化的。 序列化接口没有方法或字段，仅用于标识可序列化的语义。
public class ObjectOutputStreamDemo {
    public static void main(String[] args)throws IOException {
        ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("IOstream\\os.txt"));

        Student s = new Student("张三", 29);

        os.writeObject(s);
        os.close();


    }
}
