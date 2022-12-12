package LambdaDemo001;

/*启动一个线程，在控制台输出*/
public class LambdaDemo01 {
    public static void main(String[] args) {
        //实现类的方法实现需求
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my);
        t1.start();


        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始");
            }
        }).start();


        //lambda表达式
        new Thread(() -> {
            System.out.println("started!");
        }).start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("start");
    }
}