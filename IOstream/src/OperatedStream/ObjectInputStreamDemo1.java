package OperatedStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois= new ObjectInputStream(new FileInputStream("IOstream\\os.txt"));
        Object obj = ois.readObject();
        Student s= (Student) obj;
        System.out.println(s.getName()+"--"+s.getAge());
        ois.close();
    }
}
