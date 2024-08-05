package learn.java17.updates.stream;

import java.util.Scanner;
import java.util.stream.Stream;

public class StreamOfNullable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an valid input: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter blank input: ");
        String input2 = scanner.nextLine();
        input2 = input2.length() > 1 ? input2.substring(1) : null;

        System.out.println("input1 :: " + input1);
        Stream.ofNullable(input1)
            .map(String::toUpperCase)
            .forEach(System.out::println);

        System.out.println("input2 :: " + input2);
        Stream.ofNullable(input2)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}
