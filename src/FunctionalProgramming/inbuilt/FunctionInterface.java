package FunctionalProgramming.inbuilt;

import java.util.function.Function;

public class FunctionInterface {

    public static Function<Integer,Integer> addFunction =(a) -> a + 3;
    public static Function<Integer,Integer> subFunction =(a) -> a - 3;
    public static Function<Integer,Integer> combinedFunction = addFunction.andThen(subFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(1));
        System.out.println(subFunction.apply(1));
        System.out.println(combinedFunction.apply(1));
    }
}
