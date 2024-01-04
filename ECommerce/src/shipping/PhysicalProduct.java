package shipping;

import product.Product;

public class PhysicalProduct extends Product implements Shipping{
    public PhysicalProduct(String name, double price){
        super(name, price);
    }

    @Override
    public void ship() {
        System.out.println(this.getName() + " Product shipped successfully");
    }
}
