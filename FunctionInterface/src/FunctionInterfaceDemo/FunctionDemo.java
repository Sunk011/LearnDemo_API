package FunctionInterfaceDemo;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("100", (String s) -> {
            return Integer.parseInt(s);
        });
        convert("199", Integer::parseInt);
        System.out.println("-----------------------");


        convert(100, i -> String.valueOf(i + 566));
        System.out.println("-----------------------");

        convert("100", Integer::parseInt, i -> String.valueOf(i + 556));
    }

    //定义一个方法，把一个字符串转换为int类型，在控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        Integer i = fun.apply(s);
        System.out.println(i);
    }

    //定义一个方法，把一个int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    //定义一个方法，把一个字符串转换为int类型，把int类型的数据加上一个整数之后，转为字符串在控制台
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        /*Integer i = fun1.apply(s);
        String ss = fun2.apply(i);
        System.out.println(ss);*/
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }
}
