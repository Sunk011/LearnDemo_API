package FunctionInterfaceDemo;
/*
 * String s="林青霞，30";
 * 1.将字符串截取得到数字年龄部分
 * 2.将上一步的年龄字符串转化为int类型的数据
 * 3.将上一步的int数据加70，得到一个int结果，在控制台
 * 通过Function接口来实现函数拼接
 * */

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String s = "林青霞,30";
        convert(s, (String ss) -> {
            return s.split(",")[1];
        }, (String ss) -> {
            return Integer.parseInt(ss);
        }, (Integer i) -> {
            return i + 70;
        });
        System.out.println("--------------------");
        convert(s, ss -> ss.split(",")[1], Integer::parseInt, i -> i + 70);
    }

    private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
       /* String ss = fun1.apply(s);
        Integer i = fun2.apply(ss);
        Integer ii = fun3.apply(i);*/
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(i);

    }
}
