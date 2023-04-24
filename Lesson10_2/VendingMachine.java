package Lesson10_2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T extends Product> {
    //создать методы, чтобы:
    //1. добавлять продукт в список продуктов
    //2. получать его и удалять
    //при этом должен быть только один этот класс (т.е. без создания наследников)

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
