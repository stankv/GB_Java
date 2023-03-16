import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Lesson3 {
    
    public static void main(String[] args) {
        
        // Можно задать список так: List<Integer> integers = new ArrayList<>(Arrays.asList(1,1,2,3,1,5,3,5,6,9,11));
        // но это слишком просто. Усложним
        // Список ArrayList<Integer> целых чисел зададим случайной длины length (до 20)
        // со случайными целыми значениями элементов в диапазоне 0-10
        Random random = new Random();
        Integer length = random.nextInt(20);    //задаем случайную длину списка
        ArrayList<Integer> list1 = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {            //запишем в список случайные значения типа Integer
            list1.add(random.nextInt(10));
        }
        System.out.println(list1.size());          //вывод длины сгенерированного списка
        System.out.println(list1);                 //вывод элементов сгенерированного списка

        deleteOddNumbers(list1);                   //удаляем из списка нечетные числа
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list2);
        deleteAllNumbers(list2);
        System.out.println(list2);
    }

    
    // 1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    private static void deleteOddNumbers(ArrayList<Integer> sourse) {
        int i = 0;
        while(i < sourse.size()) {
            if (sourse.get(i) % 2 != 0) {
                sourse.remove(i);
                continue;
            }
            i++;
        }
    }


    // 2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами. 
    // Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
    // Результат: ["string", "s", "my_value"]
    private static void deleteAllNumbers(ArrayList<String> sourse) {
        int i = 0;
        while(i < sourse.size()) {
            try {
                Double.parseDouble(sourse.get(i));
                sourse.remove(i);
                continue;
            } catch (NumberFormatException e) {
                i++;
            }
            }
        }
    }
