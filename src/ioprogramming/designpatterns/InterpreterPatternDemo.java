package ioprogramming.designpatterns;

interface Expression {
    int interpret();
}

class AddExpression implements Expression {
    private int a, b;
    public AddExpression(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int interpret() {
        return a + b;
    }
}

class SubExpression implements Expression {
    private int a, b;
    public SubExpression(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int interpret() {
        return a - b;
    }
}

public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Expression add = new AddExpression(5, 3);
        System.out.println(add.interpret());
    }
}