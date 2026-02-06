package javacollectionsandstreams.javajunitregex.regex;

import java.util.regex.*;

public class UrlExtractor {
    public static void main(String[] args) {
        String text = "Visit https://google.com and http://example.org";

        Matcher m = Pattern.compile("https?://\\S+").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}