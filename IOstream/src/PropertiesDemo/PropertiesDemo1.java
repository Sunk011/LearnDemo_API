package PropertiesDemo;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
//        创建集合对象
//        Properties<String, String>prop= new Properties<String, String>();
        Properties prop= new Properties();

//        存储元素
        prop.put("0001","林青霞");
        prop.put("0002","张曼玉");
        prop.put("0003","王祖贤");

//        for循环遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
//        迭代器遍历集合
        Enumeration<?> e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
