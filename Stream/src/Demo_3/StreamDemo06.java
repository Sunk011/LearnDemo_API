package Demo_3;

import java.util.ArrayList;

public class StreamDemo06 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //把集合中的元素输出在控制台
//        list.stream().forEach(System.out::println);
        //统计集合中有几个以“张“开头的元素，并把统计结果在控制台输出
        System.out.println(list.stream().filter(s -> s.startsWith("张")).count());
    }
}
