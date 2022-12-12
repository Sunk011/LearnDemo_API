package Demo_1;

/*
 * 函数式接口：有且仅有一个抽象方法的接口
 * */
public class MyFunctionInterfaceDemo01 {
    public static void main(String[] args) {
        MyInterface my = () -> System.out.println("函数式接口");
        my.show();
    }
}

@FunctionalInterface//标记函数式接口
interface MyInterface {
    void show();
}