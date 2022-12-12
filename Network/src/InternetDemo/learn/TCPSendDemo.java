package InternetDemo.learn;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*1. 创建客户端的Socket对象（Socket
2. 获取输出流、写数据
3. 释放资源*/
public class TCPSendDemo {
    public static void main(String[] args) throws IOException {
//        1. 创建客户端的Socket对象（Socket
//        Socket (InetAddress address, int port) 创建流套接字并将其连接到指定IP地址处的指定端口号
//        Socket (String host, int port) 创建流套接字并将其连接到指定主机上的指定端口号。
//        Socket s = new Socket(InetAddress.getByName("10.158.192.35"), 10000);
        Socket s = new Socket("10.158.192.35", 10000);

//        2. 获取输出流、写数据
        OutputStream os = s.getOutputStream();
        os.write("Hello,TCP,I`am coimng".getBytes());

//        3. 释放资源
        s.close();
    }
}

/*getInputStream() 返回此套接字的输入流。
 * getOutputStream() 返回此套接字的输出流。  */