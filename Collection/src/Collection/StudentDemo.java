package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDemo {
    public static void main(String[] args) {
        Collection<Student> c =new ArrayList<Student>();

        Student s1= new Student(21, "徐强", "男");
        Student s2= new Student(22, "张三", "男");
        Student s3= new Student(23, "李四", "男");

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()){
            Student stu = it.next();
            System.out.println(stu);

        }
    }
}
