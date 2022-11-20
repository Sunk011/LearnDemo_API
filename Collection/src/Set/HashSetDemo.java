package Set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Student> hs = new HashSet<Student>();

        Student s1 = new Student("张三", 32);
        Student s2 = new Student("张四", 31);
        Student s3 = new Student("张五", 30);
        Student s4 = new Student("张六", 22);
        Student s5 = new Student("张三", 32);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);

        for (Student s : hs)
            System.out.println(s.getName() + "," + s.getAge());
    }
}
