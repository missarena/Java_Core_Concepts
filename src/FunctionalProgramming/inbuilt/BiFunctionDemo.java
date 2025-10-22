package FunctionalProgramming.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

//    public static BiFunction<Integer,Integer,Integer> addFunction = (a,b) -> a+b;
    //using method references
    public static BiFunction<Integer,Integer,Integer> addFunction = Integer::sum;
    public static BiFunction<Integer,Integer,Integer> minFunction = Integer::min;
    public static BiFunction<Integer,Integer,Integer> subFunction = (a,b) -> a-b;
    public static void main(String[] args) {
      System.out.println(addFunction.apply(1, 2));
      System.out.println(minFunction.apply(1, 2));
      System.out.println(subFunction.apply(5, 2));

        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        BiFunction<Integer,Integer,Integer> combineFunction = addFunction.andThen(multiplyBy2);
        System.out.println(combineFunction.apply(1, 2));
    }
}
