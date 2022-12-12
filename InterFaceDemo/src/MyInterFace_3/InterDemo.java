package MyInterFace_3;
/*
 * 需求：
 *       1.接口Inter中有两个默认方法，两个静态方法、
 *           default void show1(){ }
 *           default void show2(){ }
 *           static void method1(){ }
 *           static void method2(){ }
 *       2.接口的实现类
 *           InterImpl
 *       3.测试类
 *           InterDemo
 *           在主方法中，按照多态的方法创建对象并使用
 * */

public class InterDemo {
    public static void main(String[] args) {
//        按照多态的方法创建对象并使用
        Inter i = new InterImpl();

        i.show1();
        System.out.println("---------");
        i.show2();
        System.out.println("---------");

        Inter.method1();
        System.out.println("---------");
        Inter.method2();


    }
}
