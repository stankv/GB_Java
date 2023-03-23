package Lesson6;

public class Main {

    public static void main(String[] args) {
        Person human1 = new Person("Иван", "Петров", 26, "муж.", "Москва");
        Person human2 = new Person("Петр", "Иванов", 18, "муж.", "Санкт-Петербург");
        Person human3 = new Person("Анна", "Васильева", 32, "жен.", "Вологда");
        Person human4 = new Person("Владимир", "Сидоров", 23, "муж.", "Мурманск");
        Person human5 = new Person("Ирина", "Володина", 19, "жен.", "Казань");

        Person[] humans = new Person[] { human1, human2, human3, human4, human5 };
        for (Person item : humans) {
            if (item.getAge() > 20)
                System.out.println(item);
        }
    }
}
/**
 * Создать класс Person.
 * У класса должны быть поля:
 * 1. Имя (String)
 * 2. Фамилия (String)
 * 3. Возраст (продумать тип)
 * 4. Пол
 * 5*. Придумать свои собственные поля
 *
 * Для этого класса
 * 1. Реализовать методы toString, equals и hashCode.
 * 2*. Придумать собственные методы и реализовать их
 *
 * В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и
 * вывести их на экран.
 */
