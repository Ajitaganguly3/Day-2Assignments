package payment;

//OCP
public class CreditCardPayment implements Payment{

    @Override
    public void processPayment(double amount){
        System.out.println("Credit card payment processed successfully.");
    }
    
}
