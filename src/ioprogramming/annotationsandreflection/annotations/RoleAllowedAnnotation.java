package ioprogramming.annotationsandreflection.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class RoleAllowedAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface RoleAllowed {
        String value();
    }

    static class AdminService {

        @RoleAllowed("ADMIN")
        public void secureTask() {
            System.out.println("Executed");
        }
    }

    public static void main(String[] args) throws Exception {
        String role = "USER";

        Method m = AdminService.class.getMethod("secureTask");
        RoleAllowed ra = m.getAnnotation(RoleAllowed.class);

        if (role.equals(ra.value()))
            m.invoke(new AdminService());
        else
            System.out.println("Access Denied!");
    }
}