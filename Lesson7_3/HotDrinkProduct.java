package Lesson7_3;

public class HotDrinkProduct extends Product {
    private Integer temperature;
    private Double volume;

    public HotDrinkProduct(String name, Double cost, Integer temperature, Double volume) {
        super(name, cost);
        this.temperature = temperature;
        this.volume = volume;
    }


    public Integer getTemperature() {
        return temperature;
    }


    public Double getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return String.format("%s temperature: %d; volume: %.2f", super.toString(), temperature, volume);
    }
}
