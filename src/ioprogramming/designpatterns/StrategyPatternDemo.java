package ioprogramming.designpatterns;

interface PaymentStrategy {
    void pay(int amount);
}

class CashPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " by Cash");
    }
}

class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " by Card");
    }
}

class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay(int amount) {
        strategy.pay(amount);
    }
}

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();
        context.setStrategy(new CashPayment());
        context.pay(100);
    }
}