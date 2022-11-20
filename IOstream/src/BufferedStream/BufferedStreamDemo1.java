package BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos= new FileOutputStream("IOstream\\fos.txt");
//        BufferedOutputStream bos= new BufferedOutputStream(fos);
        /*
        BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("IOstream\\bos.txt"));

        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());

        bos.close();
        */

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("IOstream\\bos.txt"));

        //一次一个字节数据
        int by;
        while((by=bis.read())!=-1){
            System.out.print((char) by);
        }

        //一次读取一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }
        bis.close();

    }
}
