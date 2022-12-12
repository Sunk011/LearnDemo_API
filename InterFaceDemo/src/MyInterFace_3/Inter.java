package MyInterFace_3;

public interface Inter {
    default void show1() {
        System.out.println("default show1 start");
        show();
        System.out.println("default show1 end");
    }

    default void show2() {
        System.out.println("default show2 start");
        show();
        //非静态方法可以调用静态方法
        method();
        System.out.println("default show2 end");
    }

    private void show() {
        System.out.println("1111111");
        System.out.println("2222222");
        System.out.println("3333333");
        System.out.println("4444444");
    }

    static void method1() {
        //静态方法不能调用非静态方法
        System.out.println("static method1 start");
        method();
        System.out.println("static method1 end");
    }


    static void method2() {
        System.out.println("static method2 start");
        method();
        System.out.println("static method2 end");
    }

    private static void method() {
        System.out.println("1111111");
        System.out.println("2222222");
        System.out.println("3333333");
        System.out.println("4444444");
    }
}
