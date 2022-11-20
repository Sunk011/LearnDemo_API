package CharByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建文件输出流以写入由指定的File对象表示的文件。 如果第二个参数是true ，则字节将写入文件的末尾而不是开头。
//        FileOutputStream fos = new FileOutputStream("IOstream\\fos.txt");
        FileOutputStream fos = new FileOutputStream("IOstream\\fos.txt", true);

        for (int x = 0; x < 10; x++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());//win:\r\n   linux:\n  mac:\r
        }
        fos.close();
    }
}
