package Demo_1;

//函数式接口作为方法的参数
/*
 * 类 startThreadDemo     两个方法
 *   startThread(Runnable r) 方法参数是一个函数式接口
 *   主方法，调用startThread方法*/
public class startThreadDemo {
    public static void main(String[] args) {
        //主方法，调用startThread方法

        //匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start!");
                System.out.println();
            }
        });
        //lambda
        startThread(() -> System.out.println(Thread.currentThread().getName() + " start!!"));

    }

    private static void startThread(Runnable r) {
//        Thread t=new Thread(r);
//        t.start();
        new Thread(r).start();
    }

}
