package Generics.Class;

public class ClassDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(34);
        System.out.println(t.getAge());
        System.out.println("-------------------");


        Generic<String> g1= new Generic<>();
        g1.setT("徐强");
        System.out.println(g1.getT());

        Generic<Integer> g2= new Generic<>();
        g2.setT(34);
        System.out.println(g2.getT());
    }
}
