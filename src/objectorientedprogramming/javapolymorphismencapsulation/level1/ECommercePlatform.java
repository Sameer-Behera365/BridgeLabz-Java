package objectorientedprogramming.javapolymorphismencapsulation.level1;

abstract class Product {
    protected double price;

    public Product(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
}

class Electronics extends Product implements Taxable {
    public Electronics(double price) {
        super(price);
    }

    double calculateDiscount() {
        return price * 0.10;
    }

    public double calculateTax() {
        return price * 0.18;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p = new Electronics(50000);
        double finalPrice = p.price + ((Taxable)p).calculateTax() - p.calculateDiscount();
        System.out.println("Final Price: " + finalPrice);
    }
}
