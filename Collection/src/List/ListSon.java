package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListSon {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("java");
        array.add("python");
        array.add("C");
        array.add("C++");

        //遍历
        Iterator<String> it = array.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
        System.out.println("--------------");

        for (int x = 0; x < array.size(); x++) {
            String s = array.get(x);
            System.out.println(s);
        }
        System.out.println("--------------");

        for (String str : array) {
            System.out.println(str);
        }
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");

        LinkedList<String> linked= new LinkedList<>();

        linked.add("C");
        linked.add("C++");
        linked.add("java");
        linked.add("python");
        linked.add("GO");

        Iterator<String> it_linked = linked.iterator();
        while (it_linked.hasNext()) {
            String next = it_linked.next();
            System.out.println(next);
        }
        System.out.println("--------------");

        for (int x = 0; x < linked.size(); x++) {
            String s = linked.get(x);
            System.out.println(s);
        }
        System.out.println("--------------");

        for (String str : linked) {
            System.out.println(str);
        }
    }
}
