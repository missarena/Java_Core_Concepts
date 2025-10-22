package streams.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        //reduce()
        Stream<Integer> integerStream=numbers.stream();
//        int sum=integerStream.reduce(0,(acc,number)->acc+number);
        int sum=integerStream.reduce(0,Integer::sum);
        System.out.println(sum);

        int total=numbers.stream().reduce(0,Integer::sum);
        System.out.println(total);

        //collect()
        List<Integer>evenNums = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors
                        .toList());
        System.out.println(evenNums);

        //find and match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

         boolean has4=numbers.stream().anyMatch(number ->number == 4);
         System.out.println(has4);

        //iteration
        numbers.stream().forEach(System.out::println);

    }
}
