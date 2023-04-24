package Lesson10_2;

public class Coffe extends Product {
    private String name = "Coffe";
    private int weight;

    public Coffe(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("name: %s  weight: %d", name, weight);
    }
}
