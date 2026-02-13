package javacollectionsandstreams.java8features;

import java.util.*;

public class OptionalMaxValueDemo {
    public static void main(String[] args) {
        Optional<Integer> m =
                List.of(2,9,4).stream().max(Integer::compare);
        System.out.println(m.orElse(-1));
    }
}