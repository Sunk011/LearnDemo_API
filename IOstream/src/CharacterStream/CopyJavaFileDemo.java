package CharacterStream;

import java.io.*;

public class CopyJavaFileDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IOstream\\ConversionStreamDemo1.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IOstream\\copy.java"));
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, chs.length);
        }
        osw.close();
        isr.close();
    }
}
