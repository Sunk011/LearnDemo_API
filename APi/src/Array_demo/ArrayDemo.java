package Array_demo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {23, 24, 45, 23, 22, 83, 20, 32};

        System.out.println("排序前：" + arrayToString(arr));
        Arrays.sort(arr);
        System.out.println("排序后：" + arrayToString(arr));

    }

    public static void bubbleSort(int[] arr) {
        for (int x = 1; x < arr.length; x++) {
            for (int i = 0; i < (arr.length - x); i++) {
                if (arr[i] > arr[i + 1]) {
                    int tem = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tem;
                }
            }
                System.out.println(arrayToString (arr));
        }
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1)
                sb.append(arr[x]);
            else sb.append(arr[x]).append(",");
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }

}
