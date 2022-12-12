package OperatedStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintStreamDemo2 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("IOstream\\pw.txt");
        /*
        pw.write("hello");
        pw.write("\r\n");
        pw.flush();
        pw.write("world");
        pw.write("\r\n");
        pw.flush();
        */
/*

        pw.println("hello");
        pw.flush();
        pw.println("world");
        pw.flush();
*/

        PrintWriter pw1 = new PrintWriter(new FileWriter("IOstream\\pw.txt"), true);
        pw1.println("hello world");

        pw1.close();
    }
}
