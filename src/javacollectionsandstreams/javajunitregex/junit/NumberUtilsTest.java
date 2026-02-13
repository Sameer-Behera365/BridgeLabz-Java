package javacollectionsandstreams.javajunitregex.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    NumberUtils nu = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6})
    void testEven(int n) {
        assertTrue(nu.isEven(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {7,9})
    void testOdd(int n) {
        assertFalse(nu.isEven(n));
    }
}