package InternetDemo.learn;

import java.io.IOException;
import java.net.*;

/*1. 创建发送端的Socket对象（DatagramSocket
2. 创建数据，并打包数据
3. 调用DatagramSocket对象的方法发送数据
4. 关闭发送端*/
public class UDPSendMessageDemo01 {
    public static void main(String[] args) throws IOException {
//        1. 创建发送端的Socket对象（DatagramSocket
        DatagramSocket dgs = new DatagramSocket();
//        2. 创建数据，并打包数据
//        DatagramPacket ( byte[] buf, int length, InetAddress address,int port)
//        构造一个数据报包，用于将长度为 length的数据包发送到指定主机上的指定端口号。
        /*byte[] bys = "hello world, 中国".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.1.66");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys, length, address, port);*/
        byte[] bys = "hello world, 中国".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("10.158.192.35"), 10086);
//        3. 调用DatagramSocket对象的方法发送数据
//        void send (DatagramPacket p) 从此套接字发送数据报包。
        dgs.send(dp);
//        4. 关闭发送端
        dgs.close();

    }
}
