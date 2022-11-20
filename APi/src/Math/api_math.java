package Math;

public class api_math {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(System.currentTimeMillis());
        long start= System.currentTimeMillis();
        for(int x=0;x<10000;x++){
            System.out.println(x);
        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
