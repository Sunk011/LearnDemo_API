package Demo_3;

import java.util.ArrayList;

public class StreamDemo02 {
    public static void main(String[] args) {
        //创建一个集合，存储多个元素
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //取前三个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("------------------");
        //跳过3个元素把剩下的元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("------------------");
        //跳过2个元素，把剩下的元素中的前2个在控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("------------------");
    }
}
