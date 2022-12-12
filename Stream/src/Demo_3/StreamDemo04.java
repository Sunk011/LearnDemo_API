package Demo_3;

import java.util.ArrayList;

public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhngwuji");

        //按照字母顺序把数据输出在控制台
//        list.stream().sorted().forEach(System.out::println);
        //按照字母长度把数据输出在控制台
//        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
       /* list.stream().sorted((s1, s2) -> {
            return s1.length() - s2.length() == 0 ? s1.compareTo(s2) : s1.length() - s2.length();
        }).forEach(System.out::println);*/
        list.stream().sorted().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
    }
}
