package Lesson13_1;

public class Owl extends Animal {
    private boolean isDomesticated;
    private int hunger;

    public Owl(boolean isDomesticated, int hunger) {
        this.isDomesticated = isDomesticated;
        this.hunger = hunger;
    }

    @Override
    public void feed(int hunger) {

    }

    @Override
    public void voice() {
        
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        isDomesticated = domesticated;
    }

    public int getHunger() {
        return hunger;
    }


}
