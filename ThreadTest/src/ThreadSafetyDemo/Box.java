package ThreadSafetyDemo;

public class Box {
    private int num;

    //    定义一个成员变量表示缓冲池的状态
    private boolean status = false;

    public synchronized void put(int num) {
        //缓冲池有产品就，等待消费
        if (this.status) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //无产品,生产
        this.num = num;
        System.out.println("PUT!\t" + this.num);
        //生产后修改状态
        this.status = true;
        //唤醒其他等待线程
        notifyAll();
    }

    public synchronized void get() {
        //没有产品，等待生产
        if (!this.status) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //有产品，消费
        System.out.println("GET!\t" + this.num);
        //消费后修改状态
        this.status = false;
        //唤醒其他等待线程
        notifyAll();
    }
}
