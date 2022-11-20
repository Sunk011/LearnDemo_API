package CharByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IOstream\\fos.txt");

        //读取数据
        //int read()从输入流读入一个字符的数据

        /*//第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char) by);

        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char) by);
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);
        by = fis.read();
        System.out.println(by);*/

        /*
        int by = fis.read();
        while (by != -1) {
            System.out.print((char) by);
            by = fis.read();
        }
        */
        int bytes;

        while((bytes=fis.read())!=-1){
            System.out.print((char)bytes);
        }
        fis.close();
    }
}
