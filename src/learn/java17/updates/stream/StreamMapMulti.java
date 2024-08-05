package learn.java17.updates.stream;

import java.util.Scanner;
import java.util.stream.Stream;

public class StreamMapMulti {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the table to display: ");
        int table = scanner.nextInt();

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
            .mapMulti((num, consumer) -> consumer.accept(table + " * " + num + " = " + (num * table)))
            .forEach(System.out::println);
    }
}
