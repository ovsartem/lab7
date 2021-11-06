package order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickOrderTest {
    Order order;

    @BeforeEach
    void setUp() {
        order = QuickOrder.createOrder(QuickOrder.ROSE_BUCKET);
    }
    @Test
    void createOrder() {
        assertEquals(90, order.calculateTotalPrice());

}}