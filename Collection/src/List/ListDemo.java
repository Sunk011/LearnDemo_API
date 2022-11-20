package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> ls= new ArrayList<String>();

        ls.add("hello");
        ls.add("world");
        ls.add("java");

        Iterator<String> it = ls.iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            if(s.equals("world"))
//               ls.add("javaEE");
//        }
        for(int i=0;i<ls.size();i++){
            String s = ls.get(i);
            if (s.equals("world"))
                ls.add("javaSE");
        }
        System.out.println(ls);
    }
}
