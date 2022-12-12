package InternetDemo.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSend {
    public static void main(String[] args) throws IOException {
        //创建发送端对象
        DatagramSocket ds = new DatagramSocket();

        //封装键盘输入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

            //打包发送
            byte[] by = line.getBytes();
            DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("10.158.192.35"), 12345);

            ds.send(dp);
            //关闭发送端
        }
            ds.close();


    }
}
