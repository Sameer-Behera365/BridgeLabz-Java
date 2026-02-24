package ioprogramming.annotationsandreflection.annotations;

public class DeprecatedAnnotation {

    static class LegacyAPI {

        @Deprecated
        void oldFeature() {
            System.out.println("Old feature method");
        }

        void newFeature() {
            System.out.println("New feature method");
        }
    }

    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();   // shows compile warning
        api.newFeature();
    }
}
