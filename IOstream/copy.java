package CharacterStream;

import java.io.*;

public class ConversionStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        FileOutputStream fos= new FileOutputStream("IOstream\\osw.txt");
        OutputStreamWriter osw= new OutputStreamWriter(fos);
        */
//        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("IOstream\\osw.txt"));
//        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("IOstream\\osw.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IOstream\\osw.txt"), "GBK");
        osw.write("徐强");
        osw.close();

//        InputStreamReader isr= new InputStreamReader(new FileInputStream("IOStream\\osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IOStream\\osw.txt"), "GBK");

        //一次读取一个字符数据
        int ch;
        int count = 0;
        /*while((ch=isr.read())!=-1){
            System.out.print((char)ch);
            count++;
        }
        System.out.println(count);*/
        int len;
        char[] chs = new char[1024];
        while ((len = isr.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }
        isr.close();

    }
}
eamWriter(fos);
        */
//        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("IOstream\\osw.txt"));
//        OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("IOstream\\osw.txt"), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("IOstream\\osw.txt"), "GBK");
        osw.write("徐强");
        osw.close();

//        InputStreamReader isr= new InputStreamReader(new FileInputStream("IOStream\\osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("IOStream\\osw.txt"), "GBK");

        //一次读取一个字符数据
        int ch;
        int count = 0;
        /*while((ch=isr.read())!=-1){
            System.out.print((cha