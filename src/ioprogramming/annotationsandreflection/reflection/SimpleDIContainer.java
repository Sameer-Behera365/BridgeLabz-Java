package ioprogramming.annotationsandreflection.reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Engine {}

class Car {
    @Inject
    Engine engine;
}

public class SimpleDIContainer {
    public static void main(String[] args) throws Exception {

        Car car = new Car();

        for (Field field : Car.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(car, field.getType().getDeclaredConstructor().newInstance());
            }
        }

        System.out.println("Dependency Injected: " + (car.engine != null));
    }
}