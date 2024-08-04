package learn.java17.optionals.unwrapping.methods;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * New Method
 * 1. or(Supplier<? extends Optional<? extends T>> supplier)
 */
public class OptionalOrMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an valid input: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter an blank input (Hit Enter): ");
        String input2 = scanner.nextLine();

        System.out.println("\nvalid input = " + input1);
        Optional<String> output = Optional.ofNullable(input1)
            .filter(Predicate.not(String::isEmpty))
            .or(() -> Optional.of("NA"));
        System.out.println("valid output = " + output.get());

        System.out.println("\nblank input = " + input2);
        output = Optional.ofNullable(input2)
            .filter(Predicate.not(String::isEmpty))
            .or(() -> Optional.of("NA"));
        System.out.println("blank output = " + output.get());
    }
}
