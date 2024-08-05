package learn.java17.updates.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamToArray {

    public static void main(String[] args) {
        var names = Stream.of("Sam", "Ram", "Jam")
            .toArray();

        System.out.println(Arrays.stream(names).toList());
    }
}
