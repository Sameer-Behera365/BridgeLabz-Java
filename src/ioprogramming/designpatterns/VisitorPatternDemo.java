package ioprogramming.designpatterns;

interface Visitor {
    void visit(Book book);
}

interface Item {
    void accept(Visitor visitor);
}

class Book implements Item {
    int price;
    public Book(int price) {
        this.price = price;
    }
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class PriceCalculatorVisitor implements Visitor {
    public void visit(Book book) {
        System.out.println("Book Price: " + book.price);
    }
}

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Item book = new Book(500);
        book.accept(new PriceCalculatorVisitor());
    }
}