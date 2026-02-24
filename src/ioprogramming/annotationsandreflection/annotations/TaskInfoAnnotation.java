package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class TaskInfoAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface TaskInfo {
        String priority();
        String assignedTo();
    }

    static class TaskManager {
        @TaskInfo(priority="HIGH", assignedTo="DevA")
        public void doTask() {}
    }

    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("doTask");
        TaskInfo t = m.getAnnotation(TaskInfo.class);
        System.out.println(t.priority());
        System.out.println(t.assignedTo());
    }
}