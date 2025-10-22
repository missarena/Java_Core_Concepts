package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
    public static void main(String[] args) {
        //1.from collections
        List<String> names = Arrays.asList("John", "Alice", "Bob");
        Stream<String> stream = names.stream();          // sequential stream
        Stream<String> parallelStream = names.parallelStream();  // parallel stream

        //2.From arrays
        String[] namess = {"John", "Alice", "Bob"};
        Stream<String> stream1 = Arrays.stream(namess);
        Stream<String> stream2 = Stream.of(namess);

        //3. From Static Methods (Stream.of(), Stream.empty(), Stream.generate(), Stream.iterate())
        Stream<String> emptyStream = Stream.empty();
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(5);
        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(10);

    }
}
