package ioprogramming.designpatterns;

abstract class OrderProcess {
    public final void processOrder() {
        selectItem();
        makePayment();
        deliver();
    }

    abstract void selectItem();
    abstract void makePayment();

    void deliver() {
        System.out.println("Delivered");
    }
}

class OnlineOrder extends OrderProcess {
    void selectItem() {
        System.out.println("Item Selected");
    }

    void makePayment() {
        System.out.println("Payment Done");
    }
}

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        OrderProcess order = new OnlineOrder();
        order.processOrder();
    }
}