package Object_Oriented_Programming.javaLanguageConcepts.level1;

public class Patient {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayPatient() {
        System.out.println(name + " " + age + " " + ailment);
    }

    public static void main(String[] args) {

        Patient p1 = new Patient("Ravi", 30, "Fever", 101);

        if (p1 instanceof Patient) {
            p1.displayPatient();
        }

        Patient.getTotalPatients();
    }
}
