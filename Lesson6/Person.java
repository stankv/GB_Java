package Lesson6;

import java.util.Objects;

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

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private String city;

    public Person(String firstName, String lastName, int age, String sex, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return false;
        }
        Person anotherPerson = (Person) obj;
        return Objects.equals(firstName, anotherPerson.firstName)
                && Objects.equals(lastName, anotherPerson.lastName)
                && age == anotherPerson.age
                && Objects.equals(sex, anotherPerson.sex)
                && Objects.equals(city, anotherPerson.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, sex, city);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %s", firstName, lastName, age, sex, city);
    }

}