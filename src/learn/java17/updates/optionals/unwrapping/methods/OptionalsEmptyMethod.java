package learn.java17.updates.optionals.unwrapping.methods;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * New Method
 * 1. isEmpty()
 * - check if optional is empty, it would be useful in streams processing
 */
public class OptionalsEmptyMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an valid input: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter an blank input (Hit Enter): ");
        String input2 = scanner.nextLine();

        System.out.println("\nvalid input = " + input1);
        Optional<String> output = Optional.ofNullable(input1)
            .filter(Predicate.not(String::isEmpty));
        if (output.isEmpty()) {
            System.out.println("Missing Input");
        } else {
            System.out.println("valid output = " + output.get());
        }

        System.out.println("\nblank input = " + input2);
        output = Optional.ofNullable(input2)
            .filter(Predicate.not(String::isEmpty));
        if (output.isEmpty()) {
            System.out.println("Missing Input");
        } else {
            System.out.println("blank output = " + output);
        }
    }
}
