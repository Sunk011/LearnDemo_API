package BufferedStream;

import java.io.*;

public class BufferedStreamDemo_1 {
    public static void main(String[] args) throws IOException {
//        BufferedWriter (Writer out)
//        BufferedReader (Reader in)
/*
        FileWriter fw= new FileWriter("IOstream\\bw.txt");
        BufferedWriter bw= new BufferedWriter(fw);
        */
        /*
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOstream\\bw.txt"));
        bw.write("hello\n\r");
        bw.write("java\n\r");
        bw.write("python\n\r");
        bw.write("github\n\r");

        bw.close();
        */
//        BufferedReader br= new BufferedReader(new FileReader("")) ;

        BufferedReader br = new BufferedReader(new FileReader("IOstream\\bw.txt"));
        //一次一个字符数据
        /*int ch;
        while((ch= br.read())!=-1){
            System.out.print(ch);
        }*/

        //一次一个字符数组
        char[] chs = new char[1];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        br.close();
    }
}
