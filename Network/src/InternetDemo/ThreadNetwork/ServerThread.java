package InternetDemo.ThreadNetwork;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        //接收数据写入文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

//            BufferedWriter bw = new BufferedWriter(new FileWriter("Network\\copy.txt"));
//名称冲突
            int count = 0;
            File file = new File("Network\\Copy[" + count++ + "].txt");
            while (file.exists()) {
                count++;
                file = new File("Network\\Copy[" + count + "].txt");
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //给出反馈
            BufferedWriter bws = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bws.write("Finish!");
            bws.newLine();
            bws.flush();

            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
