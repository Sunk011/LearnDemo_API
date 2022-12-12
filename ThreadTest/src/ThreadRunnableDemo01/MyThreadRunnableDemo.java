package ThreadRunnableDemo01;

public class MyThreadRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my= new MyRunnable();

        Thread t1= new Thread(my, "动车");
        Thread t2= new Thread(my, "飞机");

        t1.start();
        t2.start();






    }
}
