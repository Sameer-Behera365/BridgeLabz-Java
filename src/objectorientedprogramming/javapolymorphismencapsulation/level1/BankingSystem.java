package objectorientedprogramming.javapolymorphismencapsulation.level1;

abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
    }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(double bal) {
        super(bal);
    }

    double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan Applied");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount(10000);
        System.out.println(acc.calculateInterest());
    }
}
