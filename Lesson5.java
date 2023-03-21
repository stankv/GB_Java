import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson5 {

    public static void main(String[] args) {

        String str = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись ";
        collectStats(str);
    }

    /**
     * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
     * проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    static void collectStats(String text) {

        Map<Integer, List<String>> stats = new HashMap<>();
        String[] text_array = text.trim().split(" ");

        System.out.println(Arrays.toString(text_array));

        for (Integer i = 0; i < text_array.length; i++) {
            if (stats.containsKey(text_array[i].length())) {
                List<String> list = stats.get(text_array[i].length());
                list.add(text_array[i]);
                stats.put(text_array[i].length(), list);
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(text_array[i]);
            stats.putIfAbsent(text_array[i].length(), list);
        }

        for (var item : stats.entrySet()) { // обход всех элементов
            System.out.printf("%d: %s\n", item.getKey(), String.join(", ", item.getValue()));
        }
    }
}
