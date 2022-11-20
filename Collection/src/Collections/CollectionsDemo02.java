package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo02 {
    public static void main(String[] args) {
    ArrayList<Student> array= new ArrayList<Student>();

    Student s1= new Student("徐强", 21);
    Student s2= new Student("利尔", 20);
    Student s3= new Student("大脚", 23);
    Student s4= new Student("小六", 19);

    array.add(s1);
    array.add(s2);
    array.add(s3);
    array.add(s4);

    //排序
    Collections.sort(array, new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getAge()== s2.getAge()?s2.getName().compareTo(s1.getName()):s2.getAge()- s1.getAge();
        }
    });

        System.out.println(array.toString());

    }
}
