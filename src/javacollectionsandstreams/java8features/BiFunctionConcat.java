package javacollectionsandstreams.java8features;

import java.util.function.*;

public class BiFunctionConcat {
    public static void main(String[] args) {
        BiFunction<String,String,String> b=(x,y)->x+" "+y;
        System.out.println(b.apply("Hello","Java"));
    }
}