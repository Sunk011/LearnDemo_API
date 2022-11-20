package CharByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节流输出对象
        FileOutputStream fos= new FileOutputStream("IOstream\\fos.txt");
       /*
        调用系统功能创建文件
        创建字节输出流对象
        让字节输出流指向创建好的文件
        */
        //void write(int b)将指定的字节写入此文件输出流
        fos.write(97);
//        fos.write(57);
//        fos.write(55);
//        fos.write("徐强".getBytes());

        //最后要释放资源
        //void close()关闭文件输出流并释放与此流相关联的任何系统资源
        fos.close();
    }
}
