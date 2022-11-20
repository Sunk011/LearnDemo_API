package CharByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos= new FileOutputStream("IOstream\\fos.txt");

//        File file= new File("IOstream\\fos.txt");
//        FileOutputStream fos1= new FileOutputStream(file);
//        FileOutputStream fos1= new FileOutputStream(new File("IOstream\\fos.txt"));

       /* fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);*/

        byte[] bys= {97, 98, 99, 100, 101, 102};
        fos.write(bys);

        fos.write("abcdefghijlkmnopqrstuvwxyz".getBytes());

        fos.write(bys, 0, 5);

    }
}
