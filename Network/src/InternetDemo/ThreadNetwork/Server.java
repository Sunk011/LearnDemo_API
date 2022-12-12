package InternetDemo.ThreadNetwork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        while (true) {
            Socket s = ss.accept();

            new Thread(new ServerThread(s)).start();
        }


    }
}
