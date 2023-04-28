package Lesson13_1;

public class Cat extends Animal {
    private boolean isInGoodMood;
    private int hunger;

    public Cat(boolean isInGoodMood, int hunger) {
        this.isInGoodMood = isInGoodMood;
        this.hunger = hunger;
    }

    @Override
    public void feed(int hunger) {

    }

    @Override
    public void voice() {

    }

    public boolean isInGoodMood() {
        return isInGoodMood;
     }

     public void setInGoodMood(boolean inGoodMood) {
        isInGoodMood = inGoodMood;
     }

     public int getHunger() {
        return hunger;
     }

     public void setHunger(int hunger) {
        this.hunger = hunger;
     }

     
     
}
