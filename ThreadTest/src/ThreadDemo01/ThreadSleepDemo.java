package ThreadDemo01;

public class ThreadSleepDemo {
    public static void main(String[] args) {

        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("刘备");
        ts2.setName("张飞");
        ts3.setName("关羽");

        ts1.start();
        ts2.start();
        ts3.start();



    }
}
