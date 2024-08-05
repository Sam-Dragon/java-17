package learn.java17.additional;

import java.util.Scanner;
import java.util.SplittableRandom;

/**
 *
 */
public class SplittableRandomClass {

    static SplittableRandom random = new SplittableRandom();

    public static void randomNumber() {
        int randomNumber = random.nextInt();
        System.out.println("Random Number = " + randomNumber);
    }

    public static void randomNumberRanges() {
        int randomNumber = random.nextInt(10, 20);
        System.out.println("Random Number Range (10, 20) = " + randomNumber);
    }

    public static void randomNumberSplit() {
        int randomNumber = random.split().nextInt();
        System.out.println("Random Number Split = " + randomNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of iteration: ");
        int times = scanner.nextInt();

        for (int i = 1; i <= times; i++) {
            randomNumber();

            // range for 10, 15
            randomNumberRanges();

            // split
            randomNumberSplit();

            System.out.println();
        }
    }
}
