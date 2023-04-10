package Lesson7_1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> products = new ArrayList<Product>();

    public Product getProductByName(String name) {
        for (Product product : products) {
            if(product.getName().equals(name)) return product;
        }
        return null;
    }

    public Product getProductByPrice(double cost) {
        for (Product product : products) {
            if(product.getPrice() == cost) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(String name, double cost) {
        Product product = new Product(name, cost);
        products.add(product);
    }
}