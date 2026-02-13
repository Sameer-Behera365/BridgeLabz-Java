package javacollectionsandstreams.java8features;

import java.util.function.*;
import java.util.*;

public class PredicateCompositionDemo {
    public static void main(String[] args) {
        Predicate<String> p = s->s.length()>5;
        Predicate<String> q = s->s.contains("a");

        List.of("banana","cat","elephant")
                .stream().filter(p.and(q))
                .forEach(System.out::println);
    }
}