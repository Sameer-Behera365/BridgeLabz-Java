package ioprogramming.designpatterns;

interface FactoryShape {
    void draw();
}

class FactoryCircle implements FactoryShape {
    public void draw() { System.out.println("Circle"); }
}

class FactoryRectangle implements FactoryShape {
    public void draw() { System.out.println("Rectangle"); }
}

class FactoryShapeFactory {
    public static FactoryShape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new FactoryCircle();
        if (type.equalsIgnoreCase("rectangle")) return new FactoryRectangle();
        return null;
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        FactoryShape shape = FactoryShapeFactory.getShape("circle");
        shape.draw();
    }
}