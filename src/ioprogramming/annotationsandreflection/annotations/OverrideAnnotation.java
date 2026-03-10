package ioprogramming.annotationsandreflection.annotations;

public class OverrideAnnotation {

    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}