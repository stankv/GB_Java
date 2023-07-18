// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Lesson17;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scan.nextLine();
        if (str.equals("") || str.equals(" ")) 
            throw new IllegalArgumentException("Ошибка! Пустые строки вводить нельзя!");
        else System.out.println("Вы ввели: " + str);
        scan.close(); 
    }
}
