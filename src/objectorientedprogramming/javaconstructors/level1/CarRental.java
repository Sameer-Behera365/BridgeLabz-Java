package Object_Oriented_Programming.JavaConstructors.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * 1000;
    }

    void display() {
        System.out.println(customerName + " " + carModel + " " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Karthik", "Swift", 5);
        c.display();
    }
}
