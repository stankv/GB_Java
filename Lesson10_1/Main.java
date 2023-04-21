package Lesson10_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("Hello world");

        for (Object o: list) {    
            if (o instanceof String) {    //проверяем что элемент списка есть строка
                System.out.println(o);
            } else System.out.println("not string!");
        }
        Animal<Cat> catAnimal = new Animal<>();
        Animal<Dog> dogAnimal = new Animal<>();
        catAnimal.setAnimal(new Cat("semyon"));
        dogAnimal.setAnimal(new Dog("bobik", 3, 10));
        dogAnimal.setAnimal(new Dog("sharik", 4 , 5));
        System.out.println(catAnimal.getInfoAboutAnimal());
        System.out.println(dogAnimal.getInfoAboutAnimal());
    }

}
