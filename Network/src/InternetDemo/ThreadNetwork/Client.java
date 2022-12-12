package InternetDemo.ThreadNetwork;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //客户端对象
        Socket s = new Socket("10.158.192.35", 10000);

        //封装文本文件的数据
        BufferedReader br = new BufferedReader(new FileReader("Network\\s.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //自定义结束标记
        s.shutdownOutput();

        //接受反馈
        BufferedReader bwClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = bwClient.readLine();//等待读取数据
        System.out.println("反馈为" + data);
//        bwClient.close();


        br.close();
        s.close();


    }
}
