package coreprogramming.javaarrays.level2;

import java.util.Scanner;

// Class to calculate employee bonuses
class EmployeeBonusCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int employeeCount = 10;

        double[] salary = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonus = new double[employeeCount];
        double[] newSalary = new double[employeeCount];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salary and years of service
        for (int i = 0; i < employeeCount; i++) {

            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();

            // Validation
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.err.println("Invalid input. Please enter again.");
                i--;
                continue;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < employeeCount; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
