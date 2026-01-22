package Object_Oriented_Programming.javaLanguageConcepts.level1;

public class Product {

    static double discount = 10.0;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct() {
        System.out.println(productName + " " + price + " " + quantity);
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000, 1, 101);

        if (p1 instanceof Product) {
            p1.displayProduct();
        }

        Product.updateDiscount(15.0);
    }
}
