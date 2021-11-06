package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    Receiver receiver1 = new Receiver();
    Receiver receiver2 = new Receiver();
    @BeforeEach
    void setUp() {
        receiver1.setStatus("done");
    }

    @Test
    void testId() {
        assertEquals(1, receiver2.getId() - receiver1.getId());
    }

    @Test
    void getStatus() {
        assertEquals("done",receiver1.getStatus());
    }
}
