package ioprogramming.designpatterns;

interface ATMState {
    void handle();
}

class NoCardState implements ATMState {
    public void handle() {
        System.out.println("Insert Card");
    }
}

class HasCardState implements ATMState {
    public void handle() {
        System.out.println("Enter PIN");
    }
}

class ATMContext {
    private ATMState state;

    public void setState(ATMState state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}

public class StatePatternDemo {
    public static void main(String[] args) {
        ATMContext atm = new ATMContext();
        atm.setState(new NoCardState());
        atm.request();
    }
}