package javacollectionsandstreams.java8features;

@FunctionalInterface
interface SquareOp {
    int calc(int x);
    default void show(int r){ System.out.println("Result "+r); }
}

public class CustomSquareInterfaceDemo {
    public static void main(String[] args) {
        SquareOp s=x->x*x;
        s.show(s.calc(5));
    }
}