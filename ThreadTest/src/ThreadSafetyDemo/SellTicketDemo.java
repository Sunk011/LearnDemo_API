package ThreadSafetyDemo;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st1 = new SellTicket();

        Thread t1 = new Thread(st1, "No1");
        Thread t2 = new Thread(st1, "No2");
        Thread t3 = new Thread(st1, "No3");


        t1.start();
        t2.start();
        t3.start();
    }
}
