package PropertiesDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) throws IOException {
//        把集合里的数据保存到文件
//        mystore();

//        把文件中的数据加载到集合
        myread();
    }

    private static void myread() throws IOException {
        Properties prop= new Properties();

        FileReader fr= new FileReader("IOstream\\fw.txt");
        prop.load(fr);
        System.out.println(prop);
        fr.close();
    }

    private static void mystore() throws IOException {
        Properties prop=new Properties();

        prop.setProperty("0001","林青霞");
        prop.setProperty("0002","张曼玉");
        prop.setProperty("0003","王祖贤");
        prop.setProperty("0004","刘德华");
        prop.setProperty("0005","张学友");

        FileWriter fw= new FileWriter("IOstream\\fw.txt");
        prop.store(fw, null);
        fw.close();
    }

}
