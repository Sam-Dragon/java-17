package learn.java17.optionals.unwrapping.methods;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * New Method
 * 1. orElseThrow()
 * - In case of not specifying exception, in-built exception will be thrown
 */
public class OptionalOrElseThrowMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an valid input: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter an blank input (Hit Enter): ");
        String input2 = scanner.nextLine();

        System.out.println("\nvalid input = " + input1);
        String output = Optional.ofNullable(input1)
            .filter(Predicate.not(String::isEmpty))
            .orElseThrow();
        System.out.println("valid output = " + output);

        System.out.println("\nblank input = " + input2);
        output = Optional.ofNullable(input2)
            .filter(Predicate.not(String::isEmpty))
            .orElseThrow();
        System.out.println("blank output = " + output);
    }
}
