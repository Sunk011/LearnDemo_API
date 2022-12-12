package InternetDemo.learn;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*1. 创建服务器端的ServeSocket对象
2. 获取输入流，读取资源，并把数据显示在控制台
3. 释放资源*/
public class TCPReceiveDemo {
    public static void main(String[] args) throws IOException {
//        1. 创建服务器端的ServeSocket对象
//        ServerSocket (int port) 创建绑定到指定端口的服务器套接字。
        ServerSocket ss = new ServerSocket(10000);
//        accept() 侦听对此套接字的连接并接受它。
        Socket s = ss.accept();

//        2. 获取输入流，读取资源，并把数据显示在控制台
        InputStream is = s.getInputStream();
//        字节读入/字符读入
        byte[] by = new byte[1024];
        int len = is.read(by);
        String data = new String(by, 0, len);
        System.out.println("DATA:\t" + data);
//        3. 释放资源
        s.close();
        ss.close();
    }
}
