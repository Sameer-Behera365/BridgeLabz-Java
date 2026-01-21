package Object_Oriented_Programming.JavaConstructors.level1;

public class BankAccountTest {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 12345;
        s.accountHolder = "Steve";
        s.setBalance(25000);

        s.display();
        System.out.println(s.getBalance());
    }
}
