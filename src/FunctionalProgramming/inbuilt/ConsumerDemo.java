package FunctionalProgramming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = str -> System.out.println(str.length());
        consumer1.accept("Hello");
        consumer2.accept("World");

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Consumer<Integer> multiplyByTwo = num -> System.out.println(num*2);
        numbers.forEach(multiplyByTwo);

    }
}
