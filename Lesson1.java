import java.util.Arrays;
import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(1700)); // 1600, 2000 - true; 1700, 1800 - false

        System.out.println(Arrays.toString(createArray(7, 7))); // [7,7,7,7,7,7,7]

        changeElementArray();

        modifyArrays();

        diagonalsArray();

        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, 0], [0, 0, 0, 1]]
        int x = array[2][3];

    }

    // Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть
    // true, в противном случае – false.
    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b >= 10 && a + b <= 20)
            return true;
        return false;
    }

    // проверить, что х положительное
    private static boolean isPositive(int x) {
        if (x >= 0)
            return true;
        return false;
    }

    // напечатать строку source repeat раз
    private static void printString(String source, int repeat) {
        String result = new String("");
        for (int i = 0; i < repeat; i++) {
            result += source;
        }
        System.out.println(result);
    }

    // проверить, является ли год високосным. если да - return true
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    }

    // должен вернуть массив длины len, каждое значение которого равно initialValue
    private static int[] createArray(int len, int initalValue) {
        if (len > 0) {
            int[] array = new int[len];
            for (int i = 0; i < len; i++)
                array[i] = initalValue;
            return array;
        }
        return null;
    }

    // Задать целочисленный массив, состоящий из элементов 0 и 1.
    // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия
    // заменить 0 на 1, 1 на 0
    private static void changeElementArray() {
        int[] array = new int[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.print(" Входной массив: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = 1;
            else if (array[i] == 1)
                array[i] = 0;
        }
        System.out.print("Выходной массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2
    private static void modifyArrays() {
        int[] array = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.print(" Входной массив: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++)
            if (array[i] < 6)
                array[i] *= 6;
        System.out.print("Выходной массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    // Создать квадратный двумерный целочисленный массив (количество строк и
    // столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
    private static void diagonalsArray() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите размер квадратного двумерного массива: ");
        int len = iScanner.nextInt();
        int[][] array = new int[len][len];
        iScanner.close();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Выходной массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - 1 - i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }

}
