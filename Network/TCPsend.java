package InternetDemo.Demo01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*客户端:发送数据,接受服务器反馈
 * 服务器端:接收数据,给出反馈*/
public class TCPsend {
    public static void main(String[] args) throws IOException {
//        创建客户端的Socket对象
        Socket s = new Socket("10.158.192.35", 10000);

//        获取输出流,写数据
        OutputStream os = s.getOutputStream();
        os.write("来了".getBytes());

//        接收服务器反馈
        InputStream is = s.getInputStream();
        byte[] by = new byte[1024];
        int len = is.read(by);
        String data = new String(by, 0, len);
        System.out.println("客户端\t" + data);

//        释放资源
//       is.close();
//       os.close();
        s.close();

    }
}
