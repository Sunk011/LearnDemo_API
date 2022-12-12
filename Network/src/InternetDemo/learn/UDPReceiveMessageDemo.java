package InternetDemo.learn;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*1. 创建接收端的Socket对象（DatagramSocket
2. 创建一个数据包，用于接受数据
3. 调用DatagramSocket对象的方法接收数据
4. 解析数据包，并把数据在控制台输出
5. 关闭接收端*/
public class UDPReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
//1. 创建接收端的Socket对象（DatagramSocket
        DatagramSocket ds = new DatagramSocket(10086);
// 2. 创建一个数据包，用于接受数据
        byte[] bys = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bys, bys.length);
//3. 调用DatagramSocket对象的方法接收数据
        ds.receive(dp);
//4. 解析数据包，并把数据在控制台输出
        byte[] data = dp.getData();
        int length = dp.getLength();
        String dataString = new String(data, 0, length);
        System.out.println("DATA\t" + dataString);
//5. 关闭接收端
        ds.close();
    }
}
