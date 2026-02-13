package javacollectionsandstreams.javajunitregex.junit;

public class StringUtils {

    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(reverse(s));
    }

    public String toUpperCase(String s) {
        return s.toUpperCase();
    }
}