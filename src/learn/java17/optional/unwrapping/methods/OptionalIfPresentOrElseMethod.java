package learn.java17.optional.unwrapping.methods;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;

/**
 * New Method
 * 1. ifPresentOrElse(Consumer<? super T> action, Runnable emptyAction)
 * - combine method to produced result based on action
 */
public class OptionalIfPresentOrElseMethod {

    public static void compensationMethod() {
        System.out.println("Compensation method processing");
    }

    public static void transactionalMethod(String input) {
        System.out.println("Transaction method processing. Input = " + input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an valid input: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter an blank input (Hit Enter): ");
        String input2 = scanner.nextLine();

        System.out.println("\n<< Method Processing >>");

        System.out.println("\nvalid input = " + input1);
        Optional<String> input = Optional.ofNullable(input1)
            .filter(Predicate.not(String::isEmpty));
        input.ifPresentOrElse(OptionalIfPresentOrElseMethod::transactionalMethod, OptionalIfPresentOrElseMethod::compensationMethod);

        // We can use this to process direct method or default method
        System.out.println("\nblank input = " + input2);
        input = Optional.ofNullable(input2)
            .filter(Predicate.not(String::isEmpty));
        input.ifPresentOrElse(OptionalIfPresentOrElseMethod::transactionalMethod, OptionalIfPresentOrElseMethod::compensationMethod);
    }
}
