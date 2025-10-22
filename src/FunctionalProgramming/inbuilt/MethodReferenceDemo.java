package FunctionalProgramming.inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //::
        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Usinf enhanced for
//        for (String name : names) {
//            System.out.println(name);

        /* names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        })  ; */
//            names.forEach((name) -> {
//                System.out.println(name);
//            });
//        names.forEach((name) -> System.out.println(name));
        names.forEach(System.out::println);
        }
    }

