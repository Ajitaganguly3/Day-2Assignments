package shipping;

import product.Product;
;

public class DigitalProduct extends Product implements Shipping{

    public DigitalProduct(String name, double price){
        super(name, price);
    }

    @Override
    public void ship() {
        System.out.println(this.getName() +"Product shipped successfully");
    }
    
}
