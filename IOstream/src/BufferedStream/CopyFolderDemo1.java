package BufferedStream;

import java.io.*;

public class CopyFolderDemo1 {
    public static void main(String[] args) throws IOException {
    //复制单击文件夹
        //创建数据源目录File对象，路径是D:\JAVA\File\JavaSE"
        File srcFolder= new File("D:\\JAVA\\File\\JavaSE");
        //获取数据源目录File对象的名称
        String srcFolderName= srcFolder.getName();
        //创建目的地目录File对象，路径是IOstream
        File destFolder= new File("IOstream",srcFolderName);
        //判断目的地目录对应的File是否存在，如果不存在，就创建
        if(!destFolder.exists()) {
            destFolder.mkdir();
        }
        //获取数据源目录下的所有文件的File数组
        File[] listFiles = srcFolder.listFiles();
//        遍历File数组，得到每个File对象
        for (File srcFile : listFiles) {
//            数据源文件
            String fileName = srcFile.getName();
//            创建目的地文件File对象
            File destFile= new File(destFolder, fileName);
//            复制文件
            copyFile(srcFile, destFile);
        }
    }

//    字节流复制文件
    private static void copyFile(File srcFile, File desFile) throws IOException {
        BufferedInputStream bis= new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(desFile));
        byte[] bys= new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }

}
