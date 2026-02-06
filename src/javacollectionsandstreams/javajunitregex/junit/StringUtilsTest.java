package javacollectionsandstreams.javajunitregex.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils su = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("cba", su.reverse("abc"));
    }

    @Test
    void testPalindrome() {
        assertTrue(su.isPalindrome("madam"));
    }

    @Test
    void testUpper() {
        assertEquals("HELLO", su.toUpperCase("hello"));
    }
}