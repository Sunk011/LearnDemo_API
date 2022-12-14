package MyInterFace_2;

/*
 * 需求：
 *       1.定义一个接口Inter，里面有三个方法：抽象方法、默认方法、静态方法
 *           void show()
 *           default void method(){ }
 *           public static void test() {  }
 *       2.定义接口的一个实现类
 *           InterImpl
 *       3.定义测试类
 *           InterDemo
 *           在主方法中，按照多态的方式创建对象并使用
 * */
public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
//        i.test();静态方法只能被接口调用
        Inter.test();
//        InterImpl.test();
        Flyable.test();
    }
}
