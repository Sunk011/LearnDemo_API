package BufferedStream;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {

        //记录开始时间
        long startTime = System.currentTimeMillis();
        method1();
        long time1=System.currentTimeMillis();
        method2();
        long time2=System.currentTimeMillis();
        method3();
        long time3=System.currentTimeMillis();
        method4();
        long endTime = System.currentTimeMillis();

        System.out.println("耗时：" + (time1 - startTime) + "毫秒");
        System.out.println("耗时：" + (time2 - time1) + "毫秒");
        System.out.println("耗时：" + (time3 - time2) + "毫秒");
        System.out.println("耗时：" + ( endTime-time3) + "毫秒");
//        BufferedInputStream bis= new BufferedInputStream(new FileInputStream("D:\\Captures\\双人成行 2022-10-14 20-46-55.mp4"));
//        BufferedOutputStream bos= new BufferedOutputStream(new FilterOutputStream("IOstream\\demo.mp3"));


    }

    //基本字节流一次读写一个字节
    public static void method1() throws IOException {//耗时：118658毫秒
        FileInputStream fis = new FileInputStream("D:\\Captures\\双人成行 2022-10-14 20-46-39.mp4");
        FileOutputStream fos = new FileOutputStream("IOstream\\demo1.mp4");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }

    //基本字节流一次读写一个字节数组
    public static void method2() throws IOException {//耗时：461毫秒
        FileInputStream fis = new FileInputStream("D:\\Captures\\双人成行 2022-10-14 20-45-51.mp4");
        FileOutputStream fos = new FileOutputStream("IOstream\\demo2.mp4");

        byte[] bys = new byte[2048];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }

    //字节缓冲流每次读写一个字节
    public static void method3() throws IOException {//耗时：765毫秒
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Captures\\双人成行 2022-10-14 20-45-51.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IOstream\\demo3.mp4"));

        int by;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    //字节缓冲流每次读写一个字节数组
    public static void method4() throws IOException {//耗时：173毫秒
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Captures\\双人成行 2022-10-14 20-45-51.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("IOstream\\demo4.mp4"));

        byte[] bys = new byte[8192];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys);
        }
        bis.close();
        bos.close();
    }
}
