package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerProDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        ArrayList<Integer> bottom = new ArrayList<>();

        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "big");
        array.add(index++);
        hm.put(index, "small");
        array.add(index);
        //洗牌
        Collections.shuffle(array);
        //发牌
        for (int x = 0; x < array.size(); x++) {

            if (x >= array.size() - 3) {
                bottom.add(array.get(x));
            } else if (array.get(x) % 3 == 0) {
                player1.add(array.get(x));
            } else if (array.get(x) % 3 == 1) {
                player2.add(array.get(x));
            } else if (array.get(x) % 3 == 2) {
                player3.add(array.get(x));
            }
        }
        showBottom(bottom, hm);
        showPlayer("Taoer", player1, hm);
        showPlayer("Taoer", player2, hm);
        showPlayer("Taoer", player3, hm);
    }

    public static void showPlayer(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name);
        for (Integer index : ts) {
            System.out.print(" " + hm.get(index));
        }
        System.out.println();
    }

    public static void showBottom(ArrayList<Integer> al, HashMap<Integer, String> hm) {
        System.out.println("底牌:");
        for (int index=0; index<al.size();index++) {
            int num=al.get(index);
            System.out.print(" "+hm.get(num));
        }
        System.out.println();
    }
}
