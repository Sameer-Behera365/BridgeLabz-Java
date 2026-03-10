package ioprogramming.designpatterns;

interface BridgeColor {
    void applyColor();
}

class BridgeRed implements BridgeColor {
    public void applyColor() {
        System.out.println("Red Color");
    }
}

abstract class BridgeShape {
    protected BridgeColor color;
    protected BridgeShape(BridgeColor color) {
        this.color = color;
    }
    abstract void draw();
}

class BridgeCircle extends BridgeShape {
    public BridgeCircle(BridgeColor color) {
        super(color);
    }
    void draw() {
        System.out.print("Circle with ");
        color.applyColor();
    }
}

public class BridgePatternDemo {
    public static void main(String[] args) {
        BridgeShape shape = new BridgeCircle(new BridgeRed());
        shape.draw();
    }
}