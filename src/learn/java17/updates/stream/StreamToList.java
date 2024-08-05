package learn.java17.updates.stream;

import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {
        var names = Stream.of("Sam", "Ram", "Jam")
            .toList();

        System.out.println(names);
    }
}
