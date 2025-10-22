package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String args[]){
        //Streams --> Assembly line / pipeline
        List<String> items = Arrays.asList("Apple","Banana","Mango");
        for(String fruit : items){
            System.out.println(fruit);
        }
        //using Streams
       Stream<String> stream = items.stream();
        //stream.forEach((item) -> System.out.println(item));
       // stream.forEach(System.out::println);
        System.out.println("Filtered fruits");
//         Stream<String> filteredStream=stream.filter(fruit -> fruit.startsWith("A"));
//         filteredStream.forEach(System.out::println);
        items.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .forEach(System.out::println);

        /* USECASES:
        1. filtering
        2. Mapping
        3.Aggregation
        4.Searching
        5.Iteration
         */
    }
}
