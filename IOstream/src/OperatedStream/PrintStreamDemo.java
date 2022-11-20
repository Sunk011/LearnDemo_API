package OperatedStream;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args)throws IOException {
        PrintStream ps= new PrintStream("IOstream\\ps.txt");
//        写数据
//        字节输出流 会转码
//        ps.write(97);
//        特有方法 不会进行转码操作
        ps.println(97);
        ps.print(98);
        ps.close();
    }
}
