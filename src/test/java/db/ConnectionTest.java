package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    private Connection line1;
    private Connection line2;

    @BeforeEach
    void setUp() {
        line1 = Connection.getConnection();
        line2 = Connection.getConnection();
    }

    @Test
    void getConnection() {
        assertEquals(line1, line2);
    }
}