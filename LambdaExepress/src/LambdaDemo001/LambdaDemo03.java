package LambdaDemo001;
/*
 *带参无返回值
 *  1.定义一个接口（Flyable），里面有一个抽象方法void fly()
 * 2.定义一个测试类，在类中有两个方法
 *   useFlyable(Flyable f)
 *   主方法，调用useFlyable方法
 * */
public class LambdaDemo03 {
    public static void main(String[] args) {
        //实现类实现
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("fly");
            }
        });
        //lambda

        Flyable f=(String s)->{
            System.out.println(s);
        };
        f.fly("1");
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("FLY");
        });
    }
    private static void useFlyable(Flyable f){
        f.fly("adfahfgl");
    }
}

interface Flyable{
    void fly(String s);
}
