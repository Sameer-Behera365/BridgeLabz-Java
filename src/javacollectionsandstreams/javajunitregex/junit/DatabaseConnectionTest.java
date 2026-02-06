package javacollectionsandstreams.javajunitregex.junit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void cleanup() {
        db.disconnect();
    }

    @Test
    void testConnected() {
        assertTrue(db.isConnected());
    }
}