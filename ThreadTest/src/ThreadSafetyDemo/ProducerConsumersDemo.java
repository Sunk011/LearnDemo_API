package ThreadSafetyDemo;

/*
 * Box类：定义一个成员变量，表示第i个产品，提供存储产品和获取产品的方法
 * Producer类：实现Runnable类的接口，重写run()方法,调用存储产品的方法
 * Customer类：实现Runnable类的接口，重写run()方法，调用获取产品的方法
 * 测试类PorducerCustomerDemo:main方法
 *   创建Box类，缓冲区
 *   创建生产者对象
 *   创建消费者对象
 *   创建两个线程
 *   启动线程*/
public class ProducerConsumersDemo {
    public static void main(String[] args) {
        Box box = new Box();

        Producer p = new Producer(box);
        Customer c = new Customer(box);

        Thread p1 = new Thread(p, "Producer");
        Thread c1 = new Thread(c, "Producer");
        p1.start();
        c1.start();
    }
}
