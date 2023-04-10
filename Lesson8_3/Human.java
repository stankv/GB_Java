package Lesson8_3;

public class Human extends Actor {
    
    public void setMakeOrder() {
        isMakeOrder = true;
    }

    public void setTakeOrder() {
        isTakeOrder = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
