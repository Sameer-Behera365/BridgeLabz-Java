package ioprogramming.annotationsandreflection.annotations;

import java.util.ArrayList;

public class SuppressWarningsAnnotation {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(123);

        System.out.println(list);
    }
}