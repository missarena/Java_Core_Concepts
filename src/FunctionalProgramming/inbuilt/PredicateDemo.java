package FunctionalProgramming.inbuilt;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isEven = n  -> n % 2 == 0;
        System.out.println(isEven.test(1)); //false
        System.out.println(isEven.test(2));

        BiPredicate<Integer,Integer> isSumEven =(a, b) -> (a+b) % 2 == 0;
        System.out.println(isSumEven.test(1, 2));
    }
}
