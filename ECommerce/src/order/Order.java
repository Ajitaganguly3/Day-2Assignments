package order;

import shopping.ShoppingCart;
import payment.Payment;
import shipping.Shipping;


public class Order {
    
    private ShoppingCart cart;
    private Payment payment;

    public Order(ShoppingCart cart, Payment payment){
        this.cart = cart;
        this.payment = payment;
    }

    public void checkout(){
        double totalAmount = cart.calculateTotal();
        payment.processPayment(totalAmount);
        System.out.println("Order processed successfully.");

        cart.getProducts().stream().filter(p -> p instanceof Shipping).forEach(product -> ((Shipping) product).ship());
    }
}
