package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    Sender sender1 = new Sender();
    Sender sender2 = new Sender();
    @BeforeEach
    void setUp() {
        sender1.setStatus("done");
    }

    @Test
    void testId() {
        assertEquals(1, sender2.getId() - sender1.getId());
    }

    @Test
    void getStatus() {
        assertEquals("done",sender1.getStatus());
    }
}
