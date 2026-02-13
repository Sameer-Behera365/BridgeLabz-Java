package javacollectionsandstreams.javajunitregex.regex;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad and stupid example";
        System.out.println(text.replaceAll("damn|stupid", "****"));
    }
}