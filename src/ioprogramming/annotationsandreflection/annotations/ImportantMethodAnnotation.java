package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class ImportantMethodAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface ImportantMethod {
        String level() default "HIGH";
    }

    static class Worker {
        @ImportantMethod
        public void critical() {}

        @ImportantMethod(level="LOW")
        public void minor() {}
    }

    public static void main(String[] args) {
        for (Method m : Worker.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = m.getAnnotation(ImportantMethod.class);
                System.out.println(m.getName()+" "+im.level());
            }
        }
    }
}
