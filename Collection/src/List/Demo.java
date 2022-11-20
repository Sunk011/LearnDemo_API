package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list= new ArrayList<String>();

        list.add("优秀校友");
        list.add("优秀校友");
        list.add("hu");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        Iterator<String> l_it = list.iterator();
        while(l_it.hasNext()){
            String s = l_it.next();
            System.out.println(s);
        }

    }
}
