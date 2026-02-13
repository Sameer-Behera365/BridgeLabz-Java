package javacollectionsandstreams.javajunitregex.regex;

import java.util.regex.*;

public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Contact support@example.com and info@company.org";

        Matcher m = Pattern.compile("\\b[\\w.-]+@[\\w.-]+\\.\\w+\\b").matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}