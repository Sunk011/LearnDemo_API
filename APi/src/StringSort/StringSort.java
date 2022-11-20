package StringSort;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        String[] strArray = s.split(" ");
        int[] arr = new int[strArray.length];
        for (int x = 0; x < strArray.length; x++) {
            arr[x] = Integer.parseInt(strArray[x]);
        }
        Arrays.sort(arr);
        StringBuilder sb= new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            if(x==arr.length-1)
            sb.append(arr[x]);
            else sb.append(arr[x]).append(" ");
        }
        System.out.println(sb.toString());

    }

}
