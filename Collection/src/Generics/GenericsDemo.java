package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericsDemo {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c= new ArrayList();
        Collection<String> c= new ArrayList<String>();

        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("python");
//        c.add(100);

//        Iterator it= c.iterator();
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);

//             String s= (String)it.next();
            String s = it.next();
            System.out.println(s);
        }
    }
}
