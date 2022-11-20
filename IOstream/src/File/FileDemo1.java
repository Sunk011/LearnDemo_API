package File;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //构造方法
/*
        File f1= new File("D:\\JAVA\\File\\java.txt");
        System.out.println(f1);

        File f2= new File("D:\\JAVA\\File", "java.txt");
        System.out.println(f2);

        File f3= new File("D:\\JAVA\\File");
        File f4= new File(f3, "java.txt");
        System.out.println(f4);
*/
        //文件创建
        File f1 = new File("D:\\JAVA\\File\\java.txt");
        //文件若不存在，则创建并返回true；若文件存在则返回false
        try {
            System.out.println(f1.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File f2 = new File("D:\\JAVA\\File\\JavaSE");
        //目录若不存在，则创建并返回true；若目录存在则返回false
        System.out.println(f2.mkdir());

        File f3 = new File("D:\\JAVA\\File\\JavaWeb\\HTML");
        //多级目录若不存在，则创建并返回true；若多级目录存在则返回false
        System.out.println(f3.mkdirs());

        File f4 = new File("D:\\JAVA\\File\\JavaSE.txt");
        //不能根据路径名判断文件是目录还是方法，需要看文件对象调用的方法
        System.out.println(f4.createNewFile());
    }
}



