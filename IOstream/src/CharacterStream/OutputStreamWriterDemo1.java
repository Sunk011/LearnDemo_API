package CharacterStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("IOstream\\osw.txt"));

        osw.write(97);
        osw.flush();//字符刷新流
        osw.write(98);
        osw.flush();//字符刷新流
        osw.write(99);

//        写入字符数组
        char[] chs= {'a', 'b', 'c', 'd', 'e'};
//        osw.write(chs);
        osw.write(chs, 1, chs.length-1);

        osw.write("faiuoyfp\n");
        osw.write("abcdefghijklmnopqrstuvwxyz",0, 13);
        osw.close();//先刷新，再释放资源
    }
}
