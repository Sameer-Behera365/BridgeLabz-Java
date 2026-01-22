package Object_Oriented_Programming.javaLanguageConcepts.level1;

public class Vehicle {

    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayVehicle() {
        System.out.println(ownerName + " " + vehicleType + " " + registrationNumber);
    }

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Karthik", "Car", 999);

        if (v1 instanceof Vehicle) {
            v1.displayVehicle();
        }

        Vehicle.updateRegistrationFee(6000);
    }
}