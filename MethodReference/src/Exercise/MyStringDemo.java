package Exercise;

//引用类的实例方法
/*
 * 接口MyString    String mySubstring(String s, int x, int y)
 * 测试列 MyStringDemo
 *   useMyString(MyString my)
 *   调用useMyString*/
public class MyStringDemo {
    public static void main(String[] args) {
        useMyString((String s, int x, int y) -> {
            return s.substring(x, y);
        });

        System.out.println("--------------");

        useMyString((s, x, y) -> s.substring(x, y));

        System.out.println("--------------");

        //引用类的实例方法
        useMyString(String::substring);
        //lambda表达式被类的实例方法替代时，第一个参数作为调用者，后面的参数全部传递给该方法作为参数
    }


    private static void useMyString(MyString my) {
        String s = my.myString("HelloWorld", 2, 5);
        System.out.println(s);
    }
}

interface MyString {
    String myString(String s, int x, int y);
}