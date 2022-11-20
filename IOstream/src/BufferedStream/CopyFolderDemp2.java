package BufferedStream;

import java.io.*;

//复制多级文件夹   递归实现
public class CopyFolderDemp2 {
    public static void main(String[] args) throws IOException {
//        创建数据源File对象
//        创建目的地File对象
//        写方法实现文件夹的复制，参数为数据源和目的地对象
//        判断数据源源File是否为目录
//              是：在目的地下创建和数据源File一样的目录
//                  获取数据源下的所有文件或者目录的File数组
//                  遍历数组得到对象，将其作为数据源对象，递归调用复制文件夹的方法
//              否：直接复制
        File srcFile = new File("D:\\JAVA\\File");
        File destFile = new File("D:\\JAVA\\Demo");
//        文件夹的复制
        copyFolder(srcFile, destFile);
    }

    //  复制文件夹
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()) {
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if(!newFolder.exists()){
                newFolder.mkdir();
            }
            File[] fileArrary = srcFile.listFiles();
            for (File file : fileArrary) {
                copyFolder(file, newFolder);

            }
        }
        else {
            File file= new File(destFile, srcFile.getName());
            copyFile(srcFile, file);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }
}
