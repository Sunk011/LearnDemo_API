package InternetDemo.ServeReflect;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        BufferedWriter bw = new BufferedWriter(new FileWriter("Network\\copy.txt"));

        String line;
        while ((line = br.readLine()) != null) {//等待读取数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }


        //给出反馈
        BufferedWriter bwServe = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServe.write("完成!");
        bwServe.newLine();
        bwServe.close();

        bw.close();
        br.close();
        ss.close();

    }
}