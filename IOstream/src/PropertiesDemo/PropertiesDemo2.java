package PropertiesDemo;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) {
//        创建集合对象
        Properties prop = new Properties();
        prop.setProperty("00001", "张三");
        prop.setProperty("00002", "李维斯");
        prop.setProperty("00003", "王思");
        prop.setProperty("00004", "张流");

        /*
        public synchronized Object setProperty(String key, String value) {
            return put(key, value);
        }
        public synchronized Object put(Object key, Object value) {
            return map.put(key, value);
        }
        */

        System.out.println(prop.getProperty("00001"));
        System.out.println(prop.getProperty("00011"));//键不存在

//        Set<String> StringPorpertyNames()
        Set<String> names = prop.stringPropertyNames();
        for (String key : names) {
            System.out.println(key);
            System.out.println(prop.getProperty(key));
        }


//        System.out.println(prop);
    }
}
