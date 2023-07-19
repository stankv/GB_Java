/* Дан следующий код, исправьте его там, где требуется:
public static void main(String[] args) throws Exception {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    }
 }
 public static void printSum(Integer a, Integer b) throws FileNotFoundException {
    System.out.println(a + b);
 }
*/

package Lesson17;

public class Task3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(null, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
    
        } catch (ArithmeticException e) {    // добавлена проверка деления на 0
            System.out.println("На ноль делить нельзя");
        } catch (IndexOutOfBoundsException ex) {    // переставлены catch в порядке следования операций в блоке try
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        try {
            System.out.println(a + b);
        } catch (NullPointerException ex) {    // проверка входных данных перенесена в ф-ю printSum
            System.out.println("Указатель не может указывать на null!");
        }
    }
}
