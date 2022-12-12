package Exercise;

//引用类的构造器
/*类Student      成员变量name，age    无参、带参构造方法、成员变量对应的get、set方法
 * 接口StudentBuilder  抽象方法Student build(String name, int age)
 * 测试类StudentDemo
 *   useStudentBuilder(StudentBuilder s)
 *   调用useStudentBuilder()*/
public class StudentDemo {
    public static void main(String[] args) {

        useStudentBuilder((String name, int age) -> {
//            Student s = new Student(name, age);
//            return s;
            return new Student(name, age);
        });
        System.out.println("---------");

        useStudentBuilder(((name, age) -> new Student(name, age)));
        System.out.println("---------");

        //方法引用--引用构造器
        useStudentBuilder(Student::new);
        System.out.println("---------");
        //lambda表达式被构造器替代时，它的形式参数全部传递给构造器作为参数

        StudentBuilder s = (String name, int age) -> {
            return new Student(name, age);
        };

        System.out.println(s.build("john", 19).toString());
    }

    private static void useStudentBuilder(StudentBuilder s) {
        Student stu = s.build("jake", 19);
        System.out.println(stu.toString());
    }
}

interface StudentBuilder {
    Student build(String name, int age);
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
