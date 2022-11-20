package Exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input score:");
        int score = sc.nextInt();

        Teacher t= new Teacher();
        try {
            t.checkScore(score);
        } catch (SocreException e) {
            throw new RuntimeException(e);
        }
    }
}
