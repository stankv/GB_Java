package Lesson7_1;

public class Product {
    private String name;
    private double cost;

    Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Product name: %s, price: %.2f", name, cost);
    }
}
