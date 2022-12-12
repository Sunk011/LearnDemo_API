package Demo02;

/*
* 获取Class类型的对象的三种方法

- 使用类的class属性来获取该列对应的Class对象	Student.class将会返回Student类对应Class对象
- 调用对象的getClass()方法，返回该对象所属类对应的Class对象 *该方法时Object类中的方法，所有的Java对象都可以调用该方法*
- 使用Class类中的静态方法forName(String className)，该方法需要传入字符串作为参数，字符串的值时某个类的全路径，也就是完整包名的路径*/
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
//        使用类的class属性来获取该列对应的Class对象
        Class<Student> c1 = Student.class;
        System.out.println(c1);
        System.out.println("----------");

        Class<Student> c2 = Student.class;
        System.out.println(c1 == c2);
        System.out.println("----------");

//        调用对象的getClass()方法，返回该对象所属类对应的Class对象
        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1 == c3);
        System.out.println("----------");

//        使用Class类中的静态方法forName(String className)
        Class<?> c4 = Class.forName("Demo02.Student");
        System.out.println(c1 == c4);
    }
}
