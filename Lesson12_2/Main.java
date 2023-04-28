package Lesson12_2;

public class Main {
    public static void main(String[] args) {
        Cat cat = CatBuilder.getInstance().setName("Мурка").setBreed("сибирская").setAge(3).setWeight(4).
        setInGoodMood(false).setColor("серая").build();
        System.out.println(cat.toString());
    }
}
