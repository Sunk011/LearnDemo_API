package Exercise;
//引用对象的实例方法
/*
 * 1.定义一个类PrintString    方法
 *   public void printUpper(String s)
 * 2.定义一个接口Printer   抽象方法
 *   void printUpperCase(String s)
 * 3.定义一个测试类PrintDemo
 *   usePrinter(Printer p)
 *   主方法，调用usePrinter()*/

public class PrinterDemo {
    public static void main(String[] args) {
/*        //lambda
        usePrinter((String s) -> {
//            String result = s.toUpperCase();
//            System.out.println(result);
            System.out.println(s.toUpperCase());
        });*/

        usePrinter(s -> System.out.println(s.toUpperCase()));
        //方法引用：对象的实例方法
        PrintString ps=new PrintString();
        usePrinter(ps::printUpper);
        //lambda表达式被对象的实例方法替代时，它的形式参数全部传递给该方法作为参数

    }

    private static void usePrinter(Printer p) {
        p.printUpperCase("HelloWorld");
    }
}

interface Printer {
    void printUpperCase(String s);
}

class PrintString {
    public void printUpper(String s) {
        String result = s.toUpperCase();
        System.out.println(result);
    }

    ;
}