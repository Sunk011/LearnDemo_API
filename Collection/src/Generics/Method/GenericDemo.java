package Generics.Method;


public class GenericDemo {
    public static void main(String[] args) {
    /*    Generic_Method g1= new Generic_Method();
        g1.show("ttt");
        Generic_Method g2= new Generic_Method();
        g2.show(45);
        Generic_Method g3= new Generic_Method();
        g3.show(true);*/


        System.out.println(sum(19, 20, 34));
    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
