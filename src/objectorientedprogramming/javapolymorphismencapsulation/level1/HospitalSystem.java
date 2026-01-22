package objectorientedprogramming.javapolymorphismencapsulation.level1;

abstract class Patient {
    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient Details");
    }
}

interface MedicalRecord {
    void addRecord();
}

class InPatient extends Patient implements MedicalRecord {
    double calculateBill() {
        return 5000;
    }

    public void addRecord() {
        System.out.println("Record Added");
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p = new InPatient();
        System.out.println(p.calculateBill());
    }
}
