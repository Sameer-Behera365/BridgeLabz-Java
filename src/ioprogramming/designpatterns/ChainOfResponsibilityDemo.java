package ioprogramming.designpatterns;

abstract class RequestHandler {
    protected RequestHandler next;
    public void setNext(RequestHandler next) {
        this.next = next;
    }
    abstract void handleRequest(int amount);
}

class TeamLead extends RequestHandler {
    void handleRequest(int amount) {
        if (amount <= 1000) {
            System.out.println("Approved by TeamLead");
        } else if (next != null) {
            next.handleRequest(amount);
        }
    }
}

class ManagerHandler extends RequestHandler {
    void handleRequest(int amount) {
        if (amount <= 5000) {
            System.out.println("Approved by Manager");
        } else if (next != null) {
            next.handleRequest(amount);
        }
    }
}

class HRHandler extends RequestHandler {
    void handleRequest(int amount) {
        System.out.println("Approved by HR");
    }
}

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        RequestHandler tl = new TeamLead();
        RequestHandler manager = new ManagerHandler();
        RequestHandler hr = new HRHandler();

        tl.setNext(manager);
        manager.setNext(hr);

        tl.handleRequest(3000);
    }
}