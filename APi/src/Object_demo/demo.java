package Object_demo;

public class demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("徐强");
        s.setAge(21);
        Student s2 = new Student("徐强", 21);
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s2.toString());
        System.out.println(s.equals(s2));
    }
}
