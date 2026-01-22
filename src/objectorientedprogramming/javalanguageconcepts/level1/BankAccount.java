package Object_Oriented_Programming.javaLanguageConcepts.level1;

public class BankAccount {

    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        System.out.println(accountHolderName + " " + accountNumber);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Karthik", 101);

        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        BankAccount.getTotalAccounts();
    }
}
