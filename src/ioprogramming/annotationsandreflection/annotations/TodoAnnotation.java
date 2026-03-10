package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class TodoAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface Todo {
        String task();
        String assignedTo();
        String priority() default "MEDIUM";
    }

    static class Project {

        @Todo(task="Add login", assignedTo="Dev1")
        public void feature1(){}

        @Todo(task="Fix crash", assignedTo="Dev2", priority="HIGH")
        public void feature2(){}
    }

    public static void main(String[] args) {
        for (Method m: Project.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println(t.task()+" "+t.assignedTo()+" "+t.priority());
            }
        }
    }
}