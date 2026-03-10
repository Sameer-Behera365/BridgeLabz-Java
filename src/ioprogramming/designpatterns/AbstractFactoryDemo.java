package ioprogramming.designpatterns;

interface AFCar { void assemble(); }
interface AFBike { void assemble(); }

class AFSedan implements AFCar {
    public void assemble() { System.out.println("Sedan"); }
}

class AFSportsBike implements AFBike {
    public void assemble() { System.out.println("SportsBike"); }
}

interface AFVehicleFactory {
    AFCar createCar();
    AFBike createBike();
}

class AFCarFactory implements AFVehicleFactory {
    public AFCar createCar() { return new AFSedan(); }
    public AFBike createBike() { return null; }
}

class AFBikeFactory implements AFVehicleFactory {
    public AFCar createCar() { return null; }
    public AFBike createBike() { return new AFSportsBike(); }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AFVehicleFactory factory = new AFCarFactory();
        factory.createCar().assemble();
    }
}