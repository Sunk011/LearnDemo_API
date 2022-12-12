package Demo_3;

import java.util.ArrayList;

public class StreamDemo05 {
    public static void main(String[] args) {
//        创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        list.add("60");

//        需求：将集合中的字符串数据转化为整数后在控制台输出
//        list.stream().map((Integer::parseInt)).forEach(System.out::println);

//        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        /*int result = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);*/
        System.out.println(list.stream().mapToInt(Integer::parseInt).sum());
    }
}
