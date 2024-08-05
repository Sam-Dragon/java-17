package learn.java17.updates.stream;

import java.util.stream.Stream;

public class StreamDropWhile {

    public static void main(String[] args) {
        Stream.of(2, 4, 5, 6, 2, 4)
            .dropWhile(num -> num % 2 == 0)
            .forEach(System.out::println);
    }
}
