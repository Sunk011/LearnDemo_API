package CharacterStream;

public class Demo {
    public static void main(String[] args) {
        double k = 0.125;
        double sum = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println(k);
            sum=sum+2*k/(4+k*k);
            k+=0.125;
            System.out.println(sum);
        }
        sum+= sum+4/5;
        System.out.println(sum);

        System.out.print(sum/16);
    }
}
