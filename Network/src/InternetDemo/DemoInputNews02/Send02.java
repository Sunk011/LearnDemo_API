package InternetDemo.DemoInputNews02;

import java.io.*;
import java.net.Socket;

public class Send02 {
    public static void main(String[] args) throws IOException {
//        客户端对象
        Socket s = new Socket("10.158.192.35", 10000);


//        键盘录入数据，直到输入886，发送结束
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

//            发送数据
//            获取输出流对象
           /*写字节数组
            OutputStream os= s.getOutputStream();
            os.write(line.getBytes());
            */
//            写字符串
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        释放资源
        s.close();
    }
}
