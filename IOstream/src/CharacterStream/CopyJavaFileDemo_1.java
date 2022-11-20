package CharacterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaFileDemo_1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IOstream\\ConversionStreamDemo1.java");
        FileWriter fw = new FileWriter("IOstream\\copy_demo.txt");

       /* int ch;
        while((ch= fr.read())!=-1){
            fw.write(ch);
        }
*/
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != 1) {
            fw.write(chs, 0, len);
        }

        fr.close();
        fw.close();
    }
}
