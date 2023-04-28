package Lesson12_2;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private boolean isInGoodMood;
    private String color;


    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getInGoodMood() {
        return isInGoodMood;
    }

    public void setInGoodMood(boolean isInGoodMood) {
        this.isInGoodMood = isInGoodMood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
        "name='" + name + '\'' +
        ", breed=" + breed +
        ", age=" + age +
        ", weight=" + weight +
        ", isInGoodMood=" + isInGoodMood +
        ", color=" + color +
        '}';
    }
    

}
