package order;
import decorators.RibbonDecorator;
import delivery.Delivery;
import delivery.DHLDeliveryStrategy;
import flowerstore.*;
import payment.CreditCardPaymentStrategy;
import payment.Payment;
import user.Receiver;
import user.Sender;


public enum QuickOrder {
    TULIP_BUCKET, ROSE_BUCKET, CHAMOMILE_BUCKET;

    public static Order createOrder(QuickOrder orderConstrictor) {
        Order order = new Order();
        Receiver receiver = new Receiver();
        Sender sender = new Sender();
        Payment payment = new CreditCardPaymentStrategy();
        Delivery delivery = new DHLDeliveryStrategy();
        FlowerBucket bucket = new FlowerBucket();
        if (orderConstrictor == QuickOrder.ROSE_BUCKET) {
            Flower flower1 = new Flower(5, Color.Black,10, FlowerType.Rose);
            FlowerPack pack1 = new FlowerPack(flower1,5);
            bucket.addFlowerPack(pack1);
        } else if (orderConstrictor == QuickOrder.TULIP_BUCKET) {
            Flower flower1 = new Flower(3, Color.Red,7, FlowerType.Tulip);
            FlowerPack pack1 = new FlowerPack(flower1,7);
            bucket.addFlowerPack(pack1);
        } else if (orderConstrictor == QuickOrder.CHAMOMILE_BUCKET){
            Flower flower1 = new Flower(5, Color.Black,8, FlowerType.Chamomile);
            FlowerPack pack1 = new FlowerPack(flower1,5);
            bucket.addFlowerPack(pack1);
        } else {
            System.out.println("Bucket out of stock");
            return order;
        }
        Item editedBucket = new RibbonDecorator(bucket);
        order.addItem(editedBucket);
        order.addUser(receiver);
        order.addUser(sender);
        order.setDeliveryStrategy(delivery);
        order.setPaymentStrategy(payment);
        return order;
    }
}