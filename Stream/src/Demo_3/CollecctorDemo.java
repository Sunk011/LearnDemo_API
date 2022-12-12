package Demo_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollecctorDemo {
    public static void main(String[] args) {
//        创建list对象
        List<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");

//        得到名字为3个字的流
        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);
//        把使用Stream流操作完毕的数据收集到List集合中并遍历
        List<String> names = listStream.collect(Collectors.toList());
        for (String s : names) {
            System.out.println(s);
        }
//        创建Set对象
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(35);
//        得到年龄大于25的流
        Stream<Integer> SetStream = set.stream().filter(age -> age > 25);
//        把使用Stream流操作完毕的数据收集到Set集合中并遍历
        /*Set<Integer> ages = SetStream.collect(Collectors.toSet());
        for (int i:ages){
            System.out.println(i);
        }*/
        SetStream.collect(Collectors.toSet()).forEach(System.out::println);
//        定义一个字符串数组，每一个字符串由姓名数据和年龄数据组合而成
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};
//        得到字符串中年龄数据大于28的流
        Stream<String> strStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);
//        把使用Stream流操作完毕的数据收集到Map集合中并遍历，字符串中的姓名作键，年龄作值
        Map<String, Integer> map = strStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry entry : entries) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
