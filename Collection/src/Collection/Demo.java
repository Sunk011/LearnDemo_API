package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

//        c.add("hello");
//        c.add("world");
//        c.add("java");
//
//        System.out.println(c);
//        c.add("world");
//        c.add("hello");
//        System.out.println(c);

//        c.add("world");
//        c.remove("hello");
//        System.out.println(c);

//        c.clear();
//        System.out.println(c);
//        System.out.println(c.contains("world"));
//        System.out.println(c.size());

        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("C++");

        Iterator<String> it = c.iterator();

        /*System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());*/

        /*while (true) {
            if (it.hasNext()) {
                System.out.println(it.next());
            } else {
                System.exit(0);
            }
        }*/
        while(it.hasNext()){
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}
