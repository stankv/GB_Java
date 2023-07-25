package Lesson18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInputData {
    
    private String inputData() {
        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите данные, разделенные пробелом");
        System.out.println("Фамилия, Имя, Отчество, Дата рождения (dd.mm.yyyy), Номер телефона (без +7), Пол (f/m)");
        System.out.print(": ");
        result = scan.nextLine();
        scan.close();
        return result;
    }

    private int codeError(String[] array) {
        if (array.length < 6) return 1;
        else if (array.length > 6) return 2;
        return 0;
    }

    private boolean isValidName(String name) {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public String checkData() throws UnsupportedEncodingException {
        // как сделать вывод в консоль на кириллице подсказано на https://habr.com/ru/sandbox/73086/
        PrintStream printStream = new PrintStream(System.out, true, "cp1251");
        String[] dataIn = new String[6];
        String[] dataOut = new String[6];
        String data = inputData();
        if (data.isEmpty() | data.isBlank()) 
            throw new NullPointerException("Вы не ввели данные!");
        
        // парсинг введенных данных
        String temp = "";
        dataIn = data.strip().split(" ");    // убираем лишние "внешние" пробелы
        for (String word : dataIn) {               // убираем лишние внутренние пробелы
            if (word.isBlank()) continue;
            else temp += (word.strip() + " ");
        }
        dataOut = temp.split(" ");

        // проверка кол-ва введенных данных и обработка кодов ошибок
        if (codeError(dataOut) == 0) {
            System.out.print("Вы ввели: ");
            printStream.println(Arrays.toString(dataOut));
            printStream.println(temp);
        } else if (codeError(dataOut) == 1) {
            System.out.println("Вы ввели меньше данных, чем требуется!");
            return "";
        } else if (codeError(dataOut) == 2) {
            System.out.println("Вы ввели больше данных, чем требуется!");
            return "";
        }
        
        // проверка введенных данных
        if (! isValidName(dataOut[0]))
            throw new InputMismatchException("Некорректный ввод фамилии!");
        if (! isValidName(dataOut[1]))
            throw new InputMismatchException("Некорректный ввод имени!");
        if (! isValidName(dataOut[2]))
            throw new InputMismatchException("Некорректный ввод отчества!");

        String[] date = dataOut[3].split(".");
        if(date.length != 3 || date[2].length() != 4)
            throw new RuntimeException("Неккоретная дата");
        try {
            Integer.parseInt(date[0]);
            Integer.parseInt(date[1]);
            Integer.parseInt(date[2]);
        } catch(NumberFormatException e) {
            System.out.println("При вводе даты получены не цифры! " + e.getMessage());
        } catch(NullPointerException e) {
            System.out.println("При вводе даты было пропущено одно из полей! " + e.getMessage());
        }

        try {
            Long.parseLong(dataOut[4]);
        } catch(NumberFormatException e) {
            throw new IllegalArgumentException("Введенный номер телефона содержит не только цифры!");
        } catch(NullPointerException e) {
            throw new RuntimeException("Вы не ввели номер телефона!");
        }

        if (!dataOut[5].equals("m") && !dataOut[5].equals("f")) 
            throw new IllegalArgumentException("Пол должен быть 'm' или 'f'!");
        
        return temp.strip();
    }

    
    public void saveData() throws UnsupportedEncodingException {
        String data = checkData();
        if (data == null || data == "") 
            throw new RuntimeException("Не получены данные для записи в файл!");
        String[] dataForFile = new String[6];
        dataForFile = data.split(" ");
        final String fileName = dataForFile[0];
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt", true))) {
            bw.append(data + "\n");
        } catch (UnsupportedEncodingException e) {
            throw e;
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл!");
            e.printStackTrace();
        }
    }
}
