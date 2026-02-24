package ioprogramming.designpatterns;

class PrototypeEmployee implements Cloneable {
    String name;
    PrototypeEmployee(String name) { this.name = name; }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class PrototypePatternDemo {
    public static void main(String[] args) throws Exception {
        PrototypeEmployee e1 = new PrototypeEmployee("Emp");
        PrototypeEmployee e2 = (PrototypeEmployee) e1.clone();
        System.out.println(e2.name);
    }
}