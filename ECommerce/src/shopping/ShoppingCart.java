package shopping;

import java.util.*;

import product.Product;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }

    public double calculateTotal(){
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}
