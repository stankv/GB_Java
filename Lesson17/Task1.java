// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Lesson17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        checkFloat();
    }

    private static void checkFloat() {
        
        float number = 0;
        boolean flag = true;
        do {
            System.out.print("Введите число: ");
            try {
                Scanner scan = new Scanner(System.in);
                number = scan.nextFloat();
                flag = false;
                scan.close();
            } catch (Exception e) {
                System.out.println("Ошибка ввода данных!");
            }
        } while (flag);
        System.out.println("Вы ввели " + number);
    }
}
