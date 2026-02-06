package javacollectionsandstreams.javajunitregex.junit;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    ListManager lm = new ListManager();

    @Test
    void testListOps() {
        List<Integer> list = new ArrayList<>();

        lm.addElement(list, 10);
        lm.addElement(list, 20);
        assertEquals(2, lm.getSize(list));

        lm.removeElement(list, 10);
        assertEquals(1, lm.getSize(list));
    }
}