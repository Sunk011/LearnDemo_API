package ThreadDemo01;

/*
* 1. 定义一个类继承Thread类
2. 在类中重写run方法
3. 创建类的对象
4. 启动线程
* */
public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//        MyThread my3 = new MyThread();

//        my1.setName("徐强");
//        my2.setName("徐");

//        MyThread my1 = new MyThread("徐强");
//        MyThread my2 = new MyThread("虚弱");

        /*
        my1.run();
        my2.run();
        */

//        导致此线程开始执行; Java虚拟机调用此线程的run方法。
//        my1.start();
//        my2.start();
//        my3.start();
//      public static Thread currentThread()
        System.out.println(Thread.currentThread().getName());


    }
}
