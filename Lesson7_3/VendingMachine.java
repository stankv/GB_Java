package Lesson7_3;

public interface VendingMachine {
    Product getProductByName(String name);

    Product getProductByCost(Double cost);

    void addProduct(Product product);

}
