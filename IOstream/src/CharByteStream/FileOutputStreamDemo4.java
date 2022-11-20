package CharByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo4 {
    public static void main(String[] args) {
        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream("IOstream\\fos.txt");
            fos.write("hello".getBytes());
        } catch(IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null)
            {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
