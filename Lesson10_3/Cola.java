package Lesson10_3;

public class Cola extends Product {
    private String name = "Cola";
    private int weight;

    public Cola(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return String.format("name: %s  weight: %d", name, weight);
    }
}
