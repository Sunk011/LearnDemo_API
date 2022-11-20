package BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo_2 {
    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw = new BufferedWriter(new FileWriter("IOstream\\bw.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("hello" + (i+1));
            bw.newLine();
            bw.flush();
//            bw.write("\r\n");
        }
        bw.close();*/

        BufferedReader br=new BufferedReader(new FileReader("IOstream\\bw.txt"));
//        String line = br.readLine();
//        System.out.print(line);
        String line= new String();
        while((line= br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
