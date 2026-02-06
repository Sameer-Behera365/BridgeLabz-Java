package javacollectionsandstreams.java8features;

import java.util.*;

public class SumOfSquaresEvenNumbers {
    public static void main(String[] args) {
        int s=List.of(1,2,3,4,6).stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .reduce(0,Integer::sum);
        System.out.println(s);
    }
}