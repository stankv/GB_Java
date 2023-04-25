package Lesson11.model;

public class User {
    private String name;
    private int age;
    private double balance;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return this.balance;
    }

    public void addMoney(double money) {
        this.balance += money;
    }

    public void withdrawal(double money) {
        if (this.balance >= money) {
            this.balance -= money;
        } else {
            System.out.println("Insufficient funds to withdraw!");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
