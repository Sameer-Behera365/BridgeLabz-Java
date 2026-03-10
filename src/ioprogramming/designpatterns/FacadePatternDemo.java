package ioprogramming.designpatterns;

class FacadeAccountService {
    public void createAccount() {
        System.out.println("Account Created");
    }
}

class FacadeBalanceService {
    public void checkBalance() {
        System.out.println("Balance Checked");
    }
}

class BankFacade {
    private FacadeAccountService accountService =
            new FacadeAccountService();
    private FacadeBalanceService balanceService =
            new FacadeBalanceService();

    public void openAccount() {
        accountService.createAccount();
        balanceService.checkBalance();
    }
}

public class FacadePatternDemo {
    public static void main(String[] args) {
        BankFacade facade = new BankFacade();
        facade.openAccount();
    }
}