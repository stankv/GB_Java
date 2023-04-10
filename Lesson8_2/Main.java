package Lesson8_2;

public class Main {

    public static void main(String[] args) {
        User user = new User("Stan");
        user.sayHi();
        user.sayHi("Stan");
        user.sayHi("Stan", 47);
    }
}
