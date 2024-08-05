package learn.java17.additional;

import java.util.stream.Stream;

public class CollectMethodOfList {

    public static void main(String[] args) {
        Stream.of("Sam", "Ram", "Jam")
            .toList()
            .forEach(System.out::println);
    }
}
