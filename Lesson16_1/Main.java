package Lesson16_1;

public class Main {
    public static void main(String[] args) {
        
        HashTable<String, Integer> table = new HashTable<>();

        table.add("Hello", 1);
        table.add("World", 2);
        table.add("Privet", 7);
        table.add("Zdraste", 54);

        table.print();

        System.out.println(table.getValue("Hello"));
        System.out.println(table.getValue("World"));
        System.out.println(table.getValue("Zdraste"));
    }
}
