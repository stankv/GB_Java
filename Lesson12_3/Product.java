package Lesson12_3;

public class Product<T> {
    //создать методы, чтобы менять стоимость продукта
    private String name;
    private int weight;
    private float price;

    public Product(String name, int weight, float price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    
    public float getPrice() {
        return this.price;
    }
}
