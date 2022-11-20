package OperatedStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
//        public static final InputStream in
//        InputStream is = System.in;//字节输入流的抽象基类

//        int by;
//        while ((by = is.read()) != -1) {
//            System.out.print((char) by);
//        }
        InputStream is = System.in;//字节输入流的抽象基类
//        如何把字节流转化为字符流
        InputStreamReader isr = new InputStreamReader(is);
//        字符流实现一次读一行    字符缓冲输入流的特有方法
        BufferedReader br = new BufferedReader(isr);
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("input String[]:");
        String line = br.readLine();
        System.out.println("Output:" + line);
        System.out.println("Input num:");
        int i = Integer.parseInt(br.readLine());
        System.out.print("Output:" + i);


//        java提供的键盘录入数据的类
        Scanner sc = new Scanner(System.in);



    }

}
