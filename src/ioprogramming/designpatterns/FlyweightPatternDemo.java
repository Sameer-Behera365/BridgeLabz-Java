package ioprogramming.designpatterns;

import java.util.HashMap;
import java.util.Map;

class FlyweightFont {
    private String type;
    public FlyweightFont(String type) {
        this.type = type;
    }
    public void display(String character) {
        System.out.println(character + " in " + type);
    }
}

class FontFactory {
    private static final Map<String, FlyweightFont> fontMap = new HashMap<>();

    public static FlyweightFont getFont(String type) {
        if (!fontMap.containsKey(type)) {
            fontMap.put(type, new FlyweightFont(type));
        }
        return fontMap.get(type);
    }
}

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        FlyweightFont font1 = FontFactory.getFont("Arial");
        FlyweightFont font2 = FontFactory.getFont("Arial");
        font1.display("A");
        System.out.println(font1 == font2);
    }
}