package Lesson12_3;

public class DrinkProduct extends Product implements Drink {
    private int temperature = 0;
    private String state;

    public DrinkProduct(String name, int weight, String state, int temperature, float price) {
        super(name, weight, price);
        this.temperature = temperature;
        this.state = state;
    }

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String toString() {
        return String.format("name: %s  weight: %d  state: %s  temperature: %d  price: %.2f", getName(), getWeight(), state, 
               temperature, getPrice());
    }
}
