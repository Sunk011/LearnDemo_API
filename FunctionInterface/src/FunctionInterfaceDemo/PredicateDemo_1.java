package FunctionInterfaceDemo;

import java.util.function.Predicate;

public class PredicateDemo_1 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", (String s) -> {
            return s.length() > 8;
        });
        System.out.println(b1);
        System.out.println("--------");

        boolean b2 = checkString("hello", (String s) -> s.length() > 8);
        System.out.println(b2);
        System.out.println("--------");


        boolean b3 = checkString("helloworkd", s -> s.length() > 8);
        System.out.println(b3);
        System.out.println("--------");


    }

    //畔煅给定字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);
//        return !pre.test(s);
        return pre.negate().test(s);

    }
}
