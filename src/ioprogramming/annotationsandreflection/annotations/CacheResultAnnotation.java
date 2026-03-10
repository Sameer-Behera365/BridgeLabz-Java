package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.util.HashMap;
import java.util.Map;

public class CacheResultAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface CacheResult {}

    static class Calculator {

        Map<Integer,Integer> cache = new HashMap<>();

        @CacheResult
        int square(int x) {
            if (cache.containsKey(x)) {
                System.out.println("From cache");
                return cache.get(x);
            }
            int r = x*x;
            cache.put(x, r);
            return r;
        }
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.square(5));
        System.out.println(c.square(5));
    }
}
