package objectorientedprogramming.javapolymorphismencapsulation.level1;

abstract class FoodItem {
    protected double price;
    protected int qty;

    abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(double p, int q) {
        price = p;
        qty = q;
    }

    double calculateTotalPrice() {
        return price * qty;
    }

    public double applyDiscount() {
        return 50;
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        FoodItem f = new VegItem(100, 2);
        System.out.println(f.calculateTotalPrice());
    }
}
