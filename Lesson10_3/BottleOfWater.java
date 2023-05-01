package Lesson10_3;

public class BottleOfWater extends Product {
    private String name = "Water";
    private float weight;

    public BottleOfWater(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("name: %s  weight: %.1f", name, weight);
    }
}
