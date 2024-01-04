import order.Order;
import order.OrderService;
import payment.CreditCardPayment;
import payment.Payment;
import product.Product;
import shipping.DigitalProduct;
import shopping.ShoppingCart;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new DigitalProduct("Phone", 50000.0);
        Product product2 = new DigitalProduct("Bag", 10000.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        Payment payment = new CreditCardPayment();

        Order order = new Order(cart, payment);

        OrderService orderService = new OrderService(order);
        orderService.processOrder();
    }
}
