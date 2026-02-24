package ioprogramming.designpatterns;

interface DecoratorCoffee {
    int cost();
}

class SimpleCoffee implements DecoratorCoffee {
    public int cost() {
        return 50;
    }
}

abstract class CoffeeDecorator implements DecoratorCoffee {
    protected DecoratorCoffee coffee;
    CoffeeDecorator(DecoratorCoffee coffee) {
        this.coffee = coffee;
    }
}

class MilkDecorator extends CoffeeDecorator {
    MilkDecorator(DecoratorCoffee coffee) {
        super(coffee);
    }
    public int cost() {
        return coffee.cost() + 20;
    }
}

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        DecoratorCoffee coffee =
                new MilkDecorator(new SimpleCoffee());
        System.out.println(coffee.cost());
    }
}