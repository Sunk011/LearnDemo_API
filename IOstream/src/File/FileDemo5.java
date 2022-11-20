package File;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File srcFile = new File("C:");

        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile) {
        File[] fileArray = srcFile.listFiles();
        if (fileArray != null)
            for (File f : fileArray) {
                if (f.isDirectory()) {
                    getAllFilePath(f);
                } else {
                    System.out.println(f.getAbsolutePath());
                }
            }
    }
}
