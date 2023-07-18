// Если необходимо, исправьте данный код:

//try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }
 

package Lesson17;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[10];    // добавлено определение и инициализация массива
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }catch (ArrayIndexOutOfBoundsException e) {    // добавлена проверка на выход индекса за пределы массива
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
