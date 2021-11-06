package order;
import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;
import user.User;
import java.util.LinkedList;
import java.util.List;
import lombok.Setter;
import lombok.Getter;
@Getter@Setter
public class Order {

    private List<Item> items = new LinkedList<>();
    private Payment payment;
    private Delivery delivery;
    private List<User> users = new LinkedList<>();

    public Order() {
    }
    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void notifyUsers(){
        for (User user : users) {
            user.update("notified");
        }
    }
    public void order(){
        notifyUsers();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : items) {
            price += item.getPrice();
        }
        return price;
    }

    public String processOrder() {
        return "Your order was processed.";
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
