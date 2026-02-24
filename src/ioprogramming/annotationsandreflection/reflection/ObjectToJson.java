package ioprogramming.annotationsandreflection.reflection;

import java.lang.reflect.Field;

class Product {
    String name = "Laptop";
    int price = 50000;
}

public class ObjectToJson {
    public static void main(String[] args) throws Exception {

        Product p = new Product();
        Class<?> cls = p.getClass();

        StringBuilder json = new StringBuilder("{");

        for (Field f : cls.getDeclaredFields()) {
            f.setAccessible(true);
            json.append("\"").append(f.getName()).append("\":\"")
                    .append(f.get(p)).append("\",");
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");

        System.out.println(json);
    }
}