package javacollectionsandstreams.java8features;

import java.util.*;

public class FilterStringsStartingWithA {
    public static void main(String[] args) {
        List<String> list=List.of("Apple","Ball","Ant");
        list.stream().filter(x->x.startsWith("A")).forEach(System.out::println);
    }
}