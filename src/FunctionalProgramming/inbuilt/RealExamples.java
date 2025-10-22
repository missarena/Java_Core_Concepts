package FunctionalProgramming.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    public static void main(String[] args) {
        //<title> costs $<price>
        BiFunction<String , Double,String> formatter= (title,price) -> title + " costs $" + price;
        System.out.println(formatter.apply("Java Basics",599.49));

        //isExpensive
        Predicate<Double> isExpensive= price -> price > 500;
        System.out.println(isExpensive.test(599.49));
    }
}
