package Lesson8_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //идея использования подсказана на https://habr.com/ru/articles/260773/
        final Pattern pattern = Pattern    
                .compile("^([-+]?[0-9]{1,}[.,]?[0-9]*)([+\\-*\\/])([0-9]{1,}[.,]?[0-9]*)$");
        boolean flag = true;
        while (flag) {
            String mathExpression = scanner.nextLine();
            Matcher matcher = pattern.matcher(mathExpression);
            if (matcher.matches()) {
                Calculator calculator = new Calculator();
                calculator.setOperand1(matcher.group(1));
                calculator.setOperator(matcher.group(2));
                calculator.setOperand2(matcher.group(3));
                System.out.println(calculator.getResult());
            }

            if (mathExpression.equals("exit")) {
                flag = false;
            }
        }
        scanner.close();
    }
}