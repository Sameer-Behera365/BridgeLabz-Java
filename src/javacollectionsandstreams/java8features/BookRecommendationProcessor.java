package javacollectionsandstreams.java8features;

import java.util.*;

class Book {
    String title,genre; double rating;
    Book(String t,String g,double r){title=t;genre=g;rating=r;}
}

public class BookRecommendationProcessor {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("B1","Science Fiction",4.5),
                new Book("B2","Science Fiction",4.8),
                new Book("B3","Drama",3.9)
        );

        books.stream()
                .filter(b->b.genre.equals("Science Fiction") && b.rating>4)
                .sorted((a,b)->Double.compare(b.rating,a.rating))
                .limit(10)
                .forEach(b->System.out.println(b.title+" "+b.rating));
    }
}
