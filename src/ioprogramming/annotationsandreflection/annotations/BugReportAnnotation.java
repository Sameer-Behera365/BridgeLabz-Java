package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class BugReportAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @Repeatable(BugReports.class)
    @interface BugReport {
        String description();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface BugReports {
        BugReport[] value();
    }

    static class Service {
        @BugReport(description="Null risk")
        @BugReport(description="Timeout issue")
        public void run() {}
    }

    public static void main(String[] args) throws Exception {
        Method m = Service.class.getMethod("run");
        for (BugReport b : m.getAnnotationsByType(BugReport.class)) {
            System.out.println(b.description());
        }
    }
}