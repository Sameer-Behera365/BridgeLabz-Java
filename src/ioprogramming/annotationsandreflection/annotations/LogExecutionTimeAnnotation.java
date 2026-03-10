package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class LogExecutionTimeAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface LogExecutionTime {}

    static class Worker {
        @LogExecutionTime
        public void slow() throws Exception {
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) throws Exception {
        Worker w = new Worker();
        Method m = Worker.class.getMethod("slow");

        long start = System.nanoTime();
        m.invoke(w);
        long end = System.nanoTime();

        System.out.println("Time ns: "+(end-start));
    }
}