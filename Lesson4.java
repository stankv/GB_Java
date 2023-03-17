/*
 * Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя строку вида text~num
 * 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * 3. Если введено print~num, выводит строку из позиции num в связном списке.
 * 4. Если введено exit, завершаем программу.
 * Пример:
 * string~4
 * num~3
 * print~3
 * num
 * print~4
 * string
 * my_value~1
 * print~1
 * my_value
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lesson4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Для решения выбрана структура данных ArrayList
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.print(">> ");
            String s = sc.nextLine();

            // Данная проверка введенных данных исключает ВСЕ возможные ошибки ввода
            // --------------------------------------------------------------------------------------------------------------------
            if (s.equalsIgnoreCase("exit")) { // исключаем регистровые ошибки ввода
                flag = false;
                sc.close();
                continue;
            } else if (s.equals(" ") || s.equals("")) { // простим пользователю небрежность или нервозность))
                continue;
            }

            String[] split = s.trim().split("~");
            if (split.length != 2) {
                System.out.println("Некорректный ввод!");
                continue;
            }
            split[0] = split[0].trim();
            split[1] = split[1].trim();
            try {
                Integer index = Integer.parseInt(split[1]);
                if (index < 0) {
                    System.out.println("Некорректный ввод!");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод!");
                continue;
            }
            // ----------------------------------------------------------------------------------------------------------------

            // Реализация записи и чтения данных
            Integer index = Integer.parseInt(split[1]);
            if (split[0].equalsIgnoreCase("print")) {
                if (list.size() <= index)
                    System.out.println("Индекс вне массива!");
                else
                    System.out.println(list.get(index));
            } else {
                if (list.size() <= index) {
                    while (list.size() <= index)
                        list.add(null);
                }
                list.set(index, split[0]);
            }
            System.out.println(Arrays.asList(list));
        }
    }
}
