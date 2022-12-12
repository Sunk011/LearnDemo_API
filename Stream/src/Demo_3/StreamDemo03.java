package Demo_3;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");
        //取前四个数据组成一个流
        Stream<String> s1 = list.stream().limit(4);
        //跳过两个流组成一个流
        Stream<String> s2 = list.stream().skip(2);
        //合并1、2得到的两个流，并把结果在控制台输出
//        Stream.concat(s1, s2).forEach(System.out::println);
        System.out.println("---------------");
        //合并1、2得到的两个流，并把结果输出在控制台，要求字符串元素不能重复
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
        System.out.println("---------------");
//        不能有两个结束流的操作
    }
}
