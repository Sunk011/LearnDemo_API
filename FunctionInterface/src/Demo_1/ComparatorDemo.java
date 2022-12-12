package Demo_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*类ComparatorDemo中提供两个方法
 *   Comparator<String> getComparator()  方法返回值Comparator是一个函数式接口
 *   主方法，调用getComparator()*/
public class ComparatorDemo {
    public static void main(String[] args) {
        //构造使用场景

        //定于集合，存储字符串元素
        ArrayList<String> array = new ArrayList<>();
        array.add("cccc");
        array.add("aa");
        array.add("b");
        array.add("dddd");
        System.out.println("before:" + array);

        //自然排序
        Collections.sort(array);
        System.out.println("after:" + array);
        Collections.sort(array, getComparator());
        System.out.println("after:" + array);
    }

    private static Comparator<String> getComparator() {
        //匿名内部类
       /*
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };*/
      /*  return new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };*/

        //lambda
       /* return (String s1, String s2) -> {
            return s1.length() - s2.length();
        };*/
        return (s1, s2) -> s1.length() - s2.length();
    }
}
