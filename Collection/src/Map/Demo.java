package Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

        Scanner sc = new Scanner(System.in);
        System.out.print("输入字符串:");
        String line = sc.nextLine();

        for (int x = 0; x < line.length(); x++) {
            char key = line.charAt(x);

            Integer value = hm.get(key);
            if (value == null) {
                hm.put(key, 1);
            } else {
                value++;
                hm.put(key, (value));
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for (Character key : keySet) {
            Integer value = hm.get(key);
            sb.append("( ").append(key).append(" )   ").append(value).append("  ");
        }

        System.out.println(sb);
    }
}
