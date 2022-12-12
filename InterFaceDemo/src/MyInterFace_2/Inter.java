package MyInterFace_2;

public interface Inter {
    //抽象方法
    void show();

    //默认方法
    default void method() {
        System.out.println("defalut method");
    }

    //静态方法
    /*public static void test() {
        System.out.println("static method");
    }*/
    static void test() {
        System.out.println("static method");
    }
}
