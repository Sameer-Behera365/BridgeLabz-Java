package ioprogramming.designpatterns;

import java.util.ArrayList;
import java.util.List;

interface CompositeEmployee {
    void showDetails();
}

class CompositeDeveloper implements CompositeEmployee {
    private String name;
    CompositeDeveloper(String name) { this.name = name; }
    public void showDetails() {
        System.out.println(name);
    }
}

class CompositeManager implements CompositeEmployee {
    private String name;
    private List<CompositeEmployee> employees = new ArrayList<>();

    CompositeManager(String name) { this.name = name; }

    public void add(CompositeEmployee e) {
        employees.add(e);
    }

    public void showDetails() {
        System.out.println(name);
        for (CompositeEmployee e : employees) {
            e.showDetails();
        }
    }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        CompositeManager manager = new CompositeManager("Manager");
        manager.add(new CompositeDeveloper("Dev1"));
        manager.add(new CompositeDeveloper("Dev2"));
        manager.showDetails();
    }
}