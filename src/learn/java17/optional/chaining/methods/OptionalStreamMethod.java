package learn.java17.optional.chaining.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * New Methods
 * 1. stream()
 * - traverse the data in case of list
 */
public class OptionalStreamMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an valid input: ");
        String input1 = scanner.nextLine();
        System.out.println("\nEntered valid input = " + input1);

        List<Integer> output = Optional.ofNullable(input1)
            .map(i -> i.split(","))
            .stream()
            .flatMap(Arrays::stream)
            .map(Integer::parseInt)
            .filter(i -> i % 2 == 0)
            .toList();
        System.out.println("\nvalid output = " + output);
    }
}
