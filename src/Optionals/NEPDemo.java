package Optionals;

import java.util.Optional;

public class NEPDemo {
    public static void main(String[] args) {
        String name="Java";
        if(name!=null){
            System.out.println(name);
        }else{
            System.out.println("No name value");
        }

        //Optional
        Optional<String> optionalString=Optional.of("java");
        System.out.println(optionalString);

        Optional<String> empty=Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe=Optional.ofNullable(null);
        System.out.println(mayBe);

        //checking values
        System.out.println(mayBe.isPresent());
        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());

        //get()
        System.out.println(optionalString.get());


        //orElse("default value")
       System.out.println(optionalString.orElse("default"));
       System.out.println(mayBe.orElse("default"));

       //orElseGet(<supplier>)
        System.out.println(mayBe.orElseGet(() -> "default"));

        //orElseThrow
        String newResult=mayBe.orElseThrow(
                () -> new RuntimeException("error")
        );
        System.out.println(newResult);

    }

}
