package streams.intermediate;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class intermediateDemo {
 public static void main(String[] args) {
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

     //1. Filtering : Books cheaper than $20
//     Stream<Book> stream1=books.stream();
//      Stream<Book> stream2=stream1.filter(predicate);
//      stream2.forEach(System.out::println);
     Stream<Book> filteredBook=books.stream().filter(book -> book.price <300);
    // filteredBook.forEach(System.out::println);

     //2. Mapping: Convert book titles to uppercase
     Stream<String> upperCaseTitles = books.stream().map(book -> book.title.toUpperCase());
     //upperCaseTitles.forEach(System.out::println);

     //3. Sorting: Books by publication date
     Stream<Book> sortedBooks=books.stream().sorted(Comparator.comparingInt(book -> book.publicationYear));
     //sortedBooks.forEach(System.out::println);

     //4. Distinct: Remove duplicate titles
     Stream<Book> uniqueBooks=books.stream().distinct();
    // uniqueBooks.forEach(System.out::println);

     //5. Limit: Display only the first 3 books
     System.out.println("Display first 3 published book by Publication year");
     Stream<Book> first3Books =books.stream()
             .sorted(Comparator.comparingInt(book -> book.publicationYear))
             .limit(3);
     first3Books.forEach(System.out::println);

     //6.skip : skip the first 2 books
     System.out.println("Display after skipping first 2 books");
     Stream<Book> afterSkippingTwo = books.stream().skip(2);
     afterSkippingTwo.forEach(System.out::println);

 }
 static Predicate<Book> predicate =new Predicate<Book>() {
     @Override
     public boolean test(Book book) {
         return book.price<300;

     }
 };
}
