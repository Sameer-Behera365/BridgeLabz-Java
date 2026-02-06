package javacollectionsandstreams.java8features;

@FunctionalInterface
interface SumOp { int apply(int a,int b); }

public class SumFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SumOp s=(a,b)->a+b;
        System.out.println(s.apply(3,4));
    }
}