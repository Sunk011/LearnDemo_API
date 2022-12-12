package LambdaDemo001;

/*无参无返回值
 * 1.定义一个接口（Eatable），里面有一个抽象方法void eat()
 * 2.定义一个测试类，在类中有两个方法
 *   useEatable(Eatable e)
 *   主方法，调用useEatable=方法
 * */
public class LambdaDemo02 {
    public static void main(String[] args) {
        //实现类
        Eatabale e = new EatableImpl();
        useEatable(e);

        //匿名内部类
        useEatable(new Eatabale() {
            @Override
            public void eat() {
                System.out.println("EAT");
            }
        });

//        lambda表达式
        useEatable(()->{
            System.out.println("Eat");
        });
    }

    public static void useEatable(Eatabale e) {
        e.eat();
    }
}

class EatableImpl implements Eatabale {

    @Override
    public void eat() {
        System.out.println("eat!");
    }
}

interface Eatabale {
    void eat();
}

