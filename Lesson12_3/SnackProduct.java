package Lesson12_3;

public class SnackProduct extends Product implements Snacks {
    private boolean sugary;;

    public SnackProduct(String name, int weight, boolean sugary, float price) {
        super(name, weight, price);
        this.sugary = sugary;
    }


    @Override
    public void setSugary(boolean sugary) {
        this.sugary = sugary;
    }


    @Override
    public boolean getSugary() {
        return this.sugary;
    }

    
    @Override
    public String toString() {
        return String.format("name: %s  weight: %d  sugary: %b  price: %.2f", getName(), getWeight(), sugary, getPrice());
    }
}

