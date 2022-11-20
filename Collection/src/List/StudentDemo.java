package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();

        Student s1 = new Student(19, "张三", "male ");
        Student s2 = new Student(23, "李四", "male");
        Student s3 = new Student(21, "徐强", "female");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        printByIterator(list);
        printByfor(list);
    }

    public static void printByIterator(List<Student> list) {
        Iterator l_it = list.iterator();
        System.out.println("迭代器输出");
        System.out.println(l_it.getClass().getName().toString());
        while (l_it.hasNext()) {
            Object it = l_it.next();
            System.out.println(it);
        }
    }
    public static void printByfor(List<Student> list){
        System.out.println("for循环输出");
        for(int x=0; x<list.size();x++){
            Student student = list.get(x);
            System.out.println(student);
        }
    }
}
