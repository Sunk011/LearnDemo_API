package ThreadDemo01;

public class TheadDeamonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();
        ThreadDaemon td3 = new ThreadDaemon();

        td1.setName("张飞");
        td2.setName("关羽");
        //设置主线程
        Thread.currentThread().setName("刘备");
        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
        }

    }
}
