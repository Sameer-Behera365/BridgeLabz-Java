package javacollectionsandstreams.javajunitregex.regex;

public class IPv4Validator {
    public static void main(String[] args) {
        String regex =
                "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";

        System.out.println("192.168.1.1".matches(regex));
        System.out.println("999.1.1.1".matches(regex));
    }
}