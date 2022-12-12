package Demo_2;
/*
 * 需求：
 *   1.定义一个接口Printable，里面有一个抽象方法
 *       void printInt(Int i)
 *   2..定义测试类，在测试类中提供两个方法
 *       usePrintable(Printable p)
 *       在主方法中，调用usePrintable方法
 * */

public class PrintableDemo {
    public static void main(String[] args) {
        Printable p = System.out::println;
         p.printInt(1);
    }
}
interface Printable {
    void printInt(int i);
}