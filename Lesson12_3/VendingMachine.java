package Lesson12_3;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
    private List<T> products = new ArrayList<>();
    

    public void addProduct(T product) {
        products.add(product);
    }


    public List<T> getProducts() {
        return products;
    }

    
    public void delProduct(T product) {
        products.remove(product);
    }
}
