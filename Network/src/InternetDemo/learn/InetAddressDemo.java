package InternetDemo.learn;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*1. static InetAddress getByName(String host)  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
2. String getHostName()   获取此IP地址的主机名
3. String getHostAddress()  返回文本显示中的IP地址字符串*/
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("LAPTOP-L7ROUAJF");
        InetAddress address = InetAddress.getByName("10.158.192.35");

        String name = address.getHostName();
        String ip = address.getHostAddress();

        System.out.println(name);
        System.out.println(ip);
    }
}
