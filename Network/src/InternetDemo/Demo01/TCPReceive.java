package InternetDemo.Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*客户端:发送数据,接受服务器反馈
 * 服务器端:接收数据,给出反馈*/
public class TCPReceive {
    public static void main(String[] args) throws IOException {
//        创建服务器端的Socket对象

        ServerSocket ss = new ServerSocket(10000);

//        监听客户端的连接,返回一个Socket对象
        Socket s = ss.accept();

//        获取输入流,读数据,并把数据显示在控制台
        InputStream is = s.getInputStream();
        byte[] by = new byte[1024];
        int len = is.read(by);

        String data = new String(by, 0, len);
        System.out.println("Serve data:\t" + data);
//      给出反馈
        OutputStream os = s.getOutputStream();
        os.write("Receive!".getBytes());
//        释放资源
        os.close();
        is.close();
        ss.close();

    }
}
