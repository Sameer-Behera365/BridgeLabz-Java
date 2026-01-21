package Object_Oriented_Programming.OOPFundamental.level1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayArea() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    public void displayCircumference() {
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.displayArea();
        c.displayCircumference();
    }
}
