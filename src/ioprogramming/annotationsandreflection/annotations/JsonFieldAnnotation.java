package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class JsonFieldAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface JsonField {
        String name();
    }

    static class User {
        @JsonField(name="user_name")
        String name="Karthik";
    }

    public static void main(String[] args) throws Exception {
        User u = new User();
        StringBuilder json = new StringBuilder("{");

        for (Field f : User.class.getDeclaredFields()) {
            if (f.isAnnotationPresent(JsonField.class)) {
                JsonField jf = f.getAnnotation(JsonField.class);
                json.append("\""+jf.name()+"\":\""+f.get(u)+"\"");
            }
        }

        json.append("}");
        System.out.println(json);
    }
}
