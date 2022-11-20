package Map.HashMapStudentDemo;

import java.util.HashMap;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<Student, String> hm= new HashMap<>();

        Student s1= new Student("徐强", 21);
        Student s2= new Student("徐若", 24);
        Student s3= new Student("徐偌", 23);
        Student s4= new Student("徐偌", 23);


        hm.put(s1, "青岛");
        hm.put(s2, "北京");
        hm.put(s3, "太原");
        hm.put(s4, "上海");

        Set<Student> keySet = hm.keySet();
        for(Student key: keySet)
            System.out.println(key.toString()+", "+hm.get(key));
    }
}
