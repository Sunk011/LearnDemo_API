package File;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //创建File对象
        File f = new File("IOstream\\java.txt");

        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println("---------------------------");

        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("---------------------------");

        File f1 = new File("D:\\JAVA\\File");
        String[] strArray = f1.list();
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("---------------------------");

        File[] fileArray = f1.listFiles();
        for (File file : fileArray) {
//            System.out.println(file);
//            System.out.println(file.getName());
            if (file.isDirectory())
                System.out.println(file.getName());

        }
        System.out.println("---------------------------");
    }
}
