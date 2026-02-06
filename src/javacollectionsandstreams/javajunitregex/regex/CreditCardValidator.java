package javacollectionsandstreams.javajunitregex.regex;

public class CreditCardValidator {
    public static void main(String[] args) {
        String visa = "^4\\d{15}$";
        String master = "^5\\d{15}$";

        System.out.println("4123456789012345".matches(visa));
        System.out.println("5123456789012345".matches(master));
    }
}