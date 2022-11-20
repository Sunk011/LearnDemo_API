package CharByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("D:\\ME\\微信图片_20221028142353.jpg");
        FileOutputStream fos= new FileOutputStream("IOstream\\image.jpg");
        byte[] by= new byte[2048];
        int len;
        while((len=fis.read(by))!=-1){
            fos.write(by, 0, len);
        }
        fos.close();
        fis.close();
    }
}
