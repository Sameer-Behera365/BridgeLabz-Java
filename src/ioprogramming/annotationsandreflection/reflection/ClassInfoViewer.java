package ioprogramming.annotationsandreflection.reflection;

import java.lang.reflect.*;

public class ClassInfoViewer {
    public static void main(String[] args) throws Exception {

        String className = "java.util.ArrayList"; // change if needed
        Class<?> cls = Class.forName(className);

        System.out.println("Class Name: " + cls.getName());

        System.out.println("\nConstructors:");
        for (Constructor<?> c : cls.getDeclaredConstructors())
            System.out.println(c);

        System.out.println("\nFields:");
        for (Field f : cls.getDeclaredFields())
            System.out.println(f);

        System.out.println("\nMethods:");
        for (Method m : cls.getDeclaredMethods())
            System.out.println(m);
    }
}