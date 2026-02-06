package javacollectionsandstreams.javajunitregex.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class TaskRunnerTest {

    TaskRunner t = new TaskRunner();

    @Test
    @Timeout(2)
    void testTimeout() throws Exception {
        t.longRunningTask();
    }
}