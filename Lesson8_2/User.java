package Lesson8_2;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
    
    public void sayHi() {
        System.out.println("Hello, World!");
    }

    public void sayHi(String name) {
        System.out.println("Hello, World! My name is " + name);
    }

    public void sayHi(String name, int age) {
        System.out.println("Hello, World! My name is " + name + ", my age " + age);
    }

}