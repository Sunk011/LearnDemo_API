package SellTicketDemo;

public class SellTicket implements Runnable {
//    private int tickets = 100;

    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    //相同的票出现多次
//    @Override
//    public void run() {
//        while (true) {
//            if (tickets > 0) {
//                System.out.println(Thread.currentThread().getName() + "出售第" + tickets + "张票");
//                tickets--;
//            try {
//                sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            }
//        }
//    }

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
//                synchronized (obj) {
//                    synchronized (this) {锁为this
                    synchronized (SellTicket.class) {//反射  类名.class得到类的字节码对象（静态同步方法的锁
                        if (tickets > 0) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println(Thread.currentThread().getName() + "出售第" + tickets + "张票");
                            tickets--;
                        }
                    }
                } else{
               /* synchronized (obj) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(Thread.currentThread().getName() + "出售第" + tickets + "张票");
                        tickets--;
                    }
                }*/
                    sellTicket();
                }
                x++;
            }
        }

    /* private void sellTicket() {
         synchronized (obj) {
             if (tickets > 0) {
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
                 System.out.println(Thread.currentThread().getName() + "出售第" + tickets + "张票");
                 tickets--;
             }
         }
     }*/
        /*private synchronized void sellTicket () {//锁为this
            if (tickets > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "出售第" + tickets + "张票");
                tickets--;
            }
        }*/
    private static synchronized void sellTicket () {//锁为
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "出售第" + tickets + "张票");
            tickets--;
        }
    }
    }
