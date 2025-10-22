package streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BookStoreChallenge {
    public static void main(String args[]){
        List<Book> books = Arrays.asList(
                new Book("The Silent Patient", "Thriller", 499.0, 2019),
                new Book("Atomic Habits", "Self-Help", 350.0, 2018),
                new Book("Rich Dad Poor Dad", "Finance", 299.0, 1997),
                new Book("The Alchemist", "Fiction", 250.0, 1988),
                new Book("Clean Code", "Programming", 699.0, 2008),
                new Book("Harry Potter and the Sorcerer’s Stone", "Fantasy", 450.0, 1997),
                new Book("Becoming", "Biography", 550.0, 2018),
                new Book("Educated", "Memoir", 400.0, 2018),
                new Book("Deep Work", "Productivity", 370.0, 2016),
                new Book("The Pragmatic Programmer", "Programming", 800.0, 1999)
        );

        System.out.println("Identify books price below 300");
        books.stream().filter(book -> book.price < 300).forEach(book -> System.out.println(book));

        System.out.println("Identify and display books that were published befor 2000");
        books.stream().filter(book -> book.publicationYear < 2000).forEach(book -> System.out.println(book));

        System.out.println("Add suffix Coming soon to all the current titles");
        books.stream().map(book -> book.title + " (Coming soon)").forEach(System.out::println);

        System.out.println("Display the books sorted by their prices");
        books.stream()
                .sorted(Comparator.comparingDouble(book -> book.price))
                .forEach(System.out::println);

        System.out.println("Rare book");
        books.stream().filter(book -> book.title.length()>20).forEach(book -> System.out.println(book));

        //terminal operation challenge

        //1.Total cost of all books
         Double bookCost=books.stream()
                .mapToDouble(book -> book.price)
                .reduce(0,Double::sum);
         System.out.println(bookCost);

         //2.Collecting books titles
        List<String> bookTitles= books.stream().map(book -> book.title).collect(Collectors.toList());
        System.out.println(bookTitles);

        //Grouping books by category
         Map<String,List<Book>> byCategory=books.stream()
                .collect(Collectors.groupingBy(bookStringFunction));
         byCategory.forEach((category,bookList) ->{
             bookList.forEach(System.out::println);
        });
    }
    static Function<Book,String> bookStringFunction = new Function<Book,String>() {
        @Override
        public String apply(Book book) {
            return book.getCategory();
        }
    };
}
