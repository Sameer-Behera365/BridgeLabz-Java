package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class MaxLengthAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface MaxLength {
        int value();
    }

    static class User {

        @MaxLength(5)
        String username;

        User(String name) throws Exception {
            Field f = getClass().getDeclaredField("username");
            MaxLength ml = f.getAnnotation(MaxLength.class);

            if (name.length() > ml.value())
                throw new IllegalArgumentException("Too long");

            username = name;
        }
    }

    public static void main(String[] args) throws Exception {
        new User("John");
        System.out.println("Created");
    }
}
