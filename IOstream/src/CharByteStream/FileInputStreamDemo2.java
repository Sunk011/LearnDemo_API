package CharByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("D:\\桌面\\SunKy\\demo.txt");
        FileOutputStream fos= new FileOutputStream("IOstream\\fos.txt");

        int by;
        while((by=fis.read())!=-1){
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
