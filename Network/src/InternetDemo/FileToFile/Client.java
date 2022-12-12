package InternetDemo.FileToFile;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端对象
        Socket s= new Socket("10.158.192.35", 10000);

        //封装文本文件的数据
        BufferedReader br= new BufferedReader(new FileReader("Network\\TCPsend.java"));
        //封装输出流写数据
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
        s.close();





    }
}
