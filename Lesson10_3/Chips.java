package Lesson10_3;

public class Chips extends Product {
    private String name = "Chips";
    private int weight;
    private String taste;

    public Chips(int weight, String taste) {
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("name: %s  weight: %d  taste: %s", name, weight, taste);
    }
}
