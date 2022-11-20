package CharacterStream;

import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*

        FileInputStream fis= new FileInputStream("IOstream\\a.txt");

        int by;
        while ((by=fis.read())!=-1) {
            System.out.print((char) by);
        }

        fis.close();
        */

//        String s= "abc";//[97, 98, 99]
        String s= "中国";//[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
//        byte[] bys = s.getBytes("GBK");//[-42, -48, -71, -6]
        System.out.println(Arrays.toString(bys));


    }
}
