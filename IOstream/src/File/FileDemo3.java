package File;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //当前模块路径下创建java.txt文件
        File f1 = new File("IOstream\\java.txt");

        //删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());

        //当前模块路径下创建itcast目录
         File f2= new File("IOstream\\itcast");
//        System.out.println(f2.mkdir());

        //删除当前模块目录下的itcast目录
        System.out.println(f2.delete());

        //在当前模块下创建一个目录itcast,然后在该目录下创建java.txt文件
        File f3= new File("IOstream\\itcast");
//        System.out.println(f3.mkdir());
        File f4= new File("IOstream\\itcast\\java.txt");
//        System.out.println(f4.createNewFile());

        //删除当前模块下的itcast
        System.out.println(f4.delete());
        System.out.println(f3.delete());
    }
}
