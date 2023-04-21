package Lesson10_1;

public class Dog extends BasicAnimal {
    private String breed;
    private int age;
    private float weight;

    public Dog(String breed, int age, float weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
