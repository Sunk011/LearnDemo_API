package InternetDemo.learn;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //创建接收端的对象
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {
            //创建一个数据包用于接受数据
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            ds.receive(dp);

            //解析数据包，显示数据
            byte[] data = dp.getData();
            String str = new String(data, 0, dp.getLength());
            System.out.println(str);

            //关闭接收端
//            ds.close();
        }
    }
}
