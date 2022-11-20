package Set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomDemo {
    public static void main(String[] args) {
//        Set<Integer> set_int = new HashSet<>();
        Set<Integer> set_int = new TreeSet<>();

        Random r = new Random();

        while (set_int.size() < 10) {
            int rand = r.nextInt(20) + 1;
            set_int.add(rand);
        }
        for (Integer i : set_int)
            System.out.println(i);
    }
}
