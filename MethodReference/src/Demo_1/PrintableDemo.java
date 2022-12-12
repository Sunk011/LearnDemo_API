package Demo_1;

/*
 *
 * 需求：
 *   1.定义一个接口Printable，里面有一个抽象方法
 *       void printString(Sting s)
 *   2..定义测试类，在测试类中提供两个方法
 *       usePrintable(Printable p)
 *       在主方法中，调用usePrintable方法
 * */
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable((String s) -> System.out.println(s));

        //省略优化
        usePrintable(s -> System.out.println(s));

        //使用方法引用改进
//        方法引用符  ::
        usePrintable(System.out::println);
//        可推导的就是可省略的

    }

    private static void usePrintable(Printable p) {
        p.printString("java");
    }
}

interface Printable {
    void printString(String s);
}