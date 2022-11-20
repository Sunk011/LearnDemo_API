package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(2);

        System.out.println(list);
        System.out.println("---------------------------------------");

        Collections.sort(list);//升序排列
        System.out.println(list);
        System.out.println("---------------------------------------");

        Collections.reverse(list);//逆序排列
        System.out.println(list);
        System.out.println("---------------------------------------");

        Collections.shuffle(list);//随机排列
        System.out.println(list);
        System.out.println("---------------------------------------");
    }
}
