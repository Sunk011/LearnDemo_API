package OperatedStream;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream out = System.out;
        //能够方便地打印各种数据值

//        out.print("hello");
//        out.print(100);
        out.println("hello");
        out.println(1000);
//        System.out的本质是字节输出流
        System.out.println("hello world");
        System.out.println(100);
        System.out.println();
//        System.out.print();

    }
}
