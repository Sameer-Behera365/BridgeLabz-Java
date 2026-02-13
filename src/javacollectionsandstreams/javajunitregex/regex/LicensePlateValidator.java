package javacollectionsandstreams.javajunitregex.regex;

public class LicensePlateValidator {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}\\d{4}$";

        System.out.println("AB1234".matches(regex));
        System.out.println("A12345".matches(regex));
    }
}