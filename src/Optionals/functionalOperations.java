package Optionals;

import java.util.Optional;

public class functionalOperations {
    public static void main(String[] args) {
        Optional<String> name=Optional.of("Java");

        //ifPresnt()
        name.ifPresent(value ->{
            System.out.println(value);
            System.out.println(name);
        });

        //map()
        Optional<String> upperCAse = name.map(value->value.toUpperCase());
        System.out.println(upperCAse);

        //filter()
        name.filter(n -> n.startsWith("J"))
                       .ifPresent(System.out::println);


    }
}
