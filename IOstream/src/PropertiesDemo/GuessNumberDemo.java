package PropertiesDemo;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberDemo {
    private GuessNumberDemo() {
    }

    public static void start() {
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Input Guess Number:");
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println(guessNumber + " is more than the turth!");
            } else if (guessNumber< number) {
                System.out.println(guessNumber+" is less than the turth!");
            }else{
                System.out.println("Congratrulation!");
                break;
            }

        }

    }
}
