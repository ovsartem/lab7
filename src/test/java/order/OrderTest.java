package order;

import decorators.RibbonDecorator;
import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import payment.PayPalPaymentStrategy;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private FlowerBucket bucket = new FlowerBucket();
    private Order order = new Order();

    @BeforeEach
    void setUp() {
        Flower flower1 = new Flower(3, Color.Red,7, FlowerType.Tulip);
        FlowerPack pack1 = new FlowerPack(flower1,7);
        bucket.addFlowerPack(pack1);
        order.addItem(bucket);
    }

    @Test
    void calculateTotalPrice() {
        assertEquals(49, order.calculateTotalPrice());
    }
}