package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class PockerDemo {
    public static void main(String[] args) {
        //牌盒
        ArrayList<String> array = new ArrayList<String>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> bottom = new ArrayList<>();
        //装牌
//        ♣♦♥♠

        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //点数
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        //拼接
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }
        array.add("🃏");
        array.add("🤡");
//        System.out.println(array);

        //洗牌
        Collections.shuffle(array);
//        System.out.println(array);

        //发牌
        for (int x = 0; x < array.size(); x++) {
            String poker = array.get(x);
            if (x >= array.size() - 3) {
                bottom.add(poker);
            } else if (x % 3 == 0) {
                player1.add(poker);
            } else if (x % 3 == 1) {
                player2.add(poker);
            } else if (x % 3 == 2) {
                player3.add(poker);
            }
        }
        showpoker("徐强", player1);
        showpoker("zxy", player2);
        showpoker("王sir", player3);
        showpoker("底牌", bottom);
    }

    public static void showpoker(String name, ArrayList<String> al) {
        System.out.print(name);
        for (String str : al) {
            System.out.print(" " + str);
        }
        System.out.println();
    }
}