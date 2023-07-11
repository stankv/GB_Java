package Lesson15;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.add(5);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(-4);
        list.add(147);
        list.add(-1);

        list.print();
        list.reverse();
        list.print();

    }
}
