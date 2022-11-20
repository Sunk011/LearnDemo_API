package File;

public class FileDemo4 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 1] + arr[x - 2];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));
        System.out.println(fn(25));
    }

    public static int f(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return f(n - 1) + f(n - 2);
    }

    public static long fn(int n){
        if(n==1)
            return 1;
        else
            return  n* fn(n-1);
    }
}
