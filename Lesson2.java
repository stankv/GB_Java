import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;

public class Lesson2 {
    
    public static void main(String[] args) throws IOException {

        System.out.println(buildString(6, 'a', 'b'));    // ababab

        writeOfFile("TEXT");

    }
    

    /*
     * 1. Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, 
     * которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
     */
    static String buildString(int N, char c1, char c2) {
        if (N % 2 != 0) return "Uncorrected number N!";
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < (int)(N / 2); i++) string.append(String.valueOf(c1) + String.valueOf(c2));
        return string.toString();
    }

    /*
     * 2. Создать файл с названием file.txt. Если файл уже есть, то создавать не надо. Записать в него Слово "TEXT" 100 раз
     */
    static void writeOfFile(String text) throws IOException {
        Path f1 = Path.of("file.txt");
        Path path = f1.toAbsolutePath();
        if (!(Files.exists(f1))) Files.createFile(path);
        String stroka = "";
        for (int i = 0; i < 100; i++) stroka += text + " ";
        Files.writeString(path, stroka);
        System.out.println("Success!");
        }
        
    }

    
