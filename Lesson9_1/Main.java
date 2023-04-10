package Lesson9_1;

import java.util.Iterator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        CatShelter cats = new CatShelter(List.of(new Cat("cat1"), new Cat("cat2"), new Cat("cat3")));
        Iterator<Cat> iterator = cats.iterator();
        cats.getCats().size();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
