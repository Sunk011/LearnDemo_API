package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()) {
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("--------------");
//        while (lit.hasPrevious()) {
//            String s = lit.previous();
//            System.out.println(s);
//        }
        //获取列表迭代器
        ListIterator<String> lit=list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if(s.equals("world"))
                lit.add("javase");
        }
        System.out.println(list);
        System.out.println();

        for(String str: list){
            System.out.println(str);
        }

    }
}
