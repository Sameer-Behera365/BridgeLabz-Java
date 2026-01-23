package objectorientedprogramming.javapolymorphismencapsulation;

abstract class Vehicle {
    protected double rate;
    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {
    public Car() {
        rate = 1000;
    }

    double calculateRentalCost(int days) {
        return rate * days;
    }

    public double calculateInsurance() {
        return 500;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v.calculateRentalCost(3));
    }
}