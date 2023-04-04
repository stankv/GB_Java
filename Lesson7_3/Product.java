package Lesson7_3;

public abstract class Product {
    protected String name;
    protected Double cost;

    public Product(String name, Double cost) {
        this.name = name;
        this.cost = cost;
    }


    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("Product name: %s; price: %.2f; ", name, cost);
    }
}