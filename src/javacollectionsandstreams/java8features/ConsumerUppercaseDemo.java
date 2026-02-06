package javacollectionsandstreams.java8features;

import java.util.*;
import java.util.function.*;

public class ConsumerUppercaseDemo {
    public static void main(String[] args) {
        Consumer<String> c = s->System.out.println(s.toUpperCase());
        List.of("a","b","c").forEach(c);
    }
}
