package order;

//DIP
public class OrderService {
    private Order order;

    public OrderService(Order order){
        this.order = order;
    }

    public void processOrder(){
        order.checkout();
    }
}
