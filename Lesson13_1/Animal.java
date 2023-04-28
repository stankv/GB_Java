package Lesson13_1;

public abstract class Animal {
    protected String name;
    protected int age;

    public abstract void voice();

    public abstract void feed(int hunger);

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
}
