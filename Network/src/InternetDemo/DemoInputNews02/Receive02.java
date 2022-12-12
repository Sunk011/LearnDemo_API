package InternetDemo.DemoInputNews02;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive02 {
    public static void main(String[] args) throws IOException {
        int i = 0;
        ServerSocket ss = new ServerSocket(10000);
        Socket s = ss.accept();
        OutputStream os = s.getOutputStream();
        String str = "Request" + i++;
        os.write(str.getBytes());

//            获取输入流
//            InputStream is = s.getInputStream();
//            InputStreamReader isr= new InputStreamReader(is);
//            BufferedReader br= new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
//            byte[] by = new byte[1024];
//            int len = is.read(by);
//            String s1 = new String(by, 0, len);
        while ((line = br.readLine()) != null) {
            System.out.println("Clent Receive:\t" + line);
        }
        ss.close();
    }
}
