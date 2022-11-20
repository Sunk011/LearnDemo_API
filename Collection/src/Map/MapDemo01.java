package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String>  map= new HashMap< String, String>();

        map.put("0001", "张三");
        map.put("0002", "李四");
        map.put("0003", "王五");
        map.put("0004", "徐强");

        System.out.println(map);
        System.out.println("------------------");

//        System.out.println(map.remove("0002"));
//        map.clear();
//        System.out.println(map.containsKey("0001"));
//        System.out.println(map.containsValue("张三"));
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());
//        System.out.println(map);

        /*//根据key值返回对应的value值
        System.out.println(map.get("0001"));
        //返回所有键的集合
        System.out.println(map.keySet());
        //返回所有值的集合
        System.out.println(map.values() );
        Collection<String> values = map.values();
        for(String str: values)
            System.out.println(str);*/

/*    //遍历1
        Set<String> str_map = map.keySet();
        for(String s: str_map) {
            String value = map.get(s);
            System.out.println(s+", "+value);
        }*/


        //遍历2
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry k_v: entries){
            System.out.println(k_v.getKey()+", "+k_v.getValue());
        }
    }
}
