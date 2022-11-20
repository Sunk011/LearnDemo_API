package CharByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("IOstream\\fos.txt");

        byte[] bys = new byte[1024];//1024及其整数倍

        /*
        int len = fis.read(bys);//返回实际读取数据的长度
        System.out.println(len);
        System.out.println(new String(bys, 0, len));

        len = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys, 0, len));

        len = fis.read(bys);
        System.out.println(len);
        System.out.println(new String(bys, 0, len));
        len = fis.read(bys);
        System.out.println(len);
        */

        int len;
        while((len=fis.read(bys))!=-1){
            System.out.print(new String(bys, 0, len));
        }

        fis.close();
    }
}
