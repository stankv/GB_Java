package Lesson12_1;

public class Main {
    public static void main(String[] args) {
        Worker worker = WorkerBuilder.getInstance().salary(25000).setName("Ivan").cabinet((byte)24).build();
        System.out.println(worker.toString());
    }
}
