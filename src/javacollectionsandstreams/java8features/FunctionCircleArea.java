package javacollectionsandstreams.java8features;

import java.util.function.*;

public class FunctionCircleArea {
    public static void main(String[] args) {
        Function<Double,Double> f = r->Math.PI*r*r;
        System.out.println(f.apply(3.0));
    }
}