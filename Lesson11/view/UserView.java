/**
 * Реализовать систему работы банковского приложения.
 * - Создать класс пользователь и соответсвующие классы.
 * - Реализовать операции зачисления средств пользователю на счет и списания 
 *   (у пользователя должно быть отдельное поле - его балланс)
 * - Реализовать функции добавления и удаления пользователя.
 */

package Lesson11.view;

import Lesson11.controller.UserBalanceController;
import Lesson11.controller.UserController;
import Lesson11.model.User;

import java.util.List;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        int id;
        String Name;
        int Age;
        double summ;

        UserController userController = new UserController();
        userController.saveUser("Ivan", 55);
        userController.saveUser("Alexey", 40);
        userController.saveUser("Sergey", 35);

        UserBalanceController userBalanceController = new UserBalanceController();
        userBalanceController.addMoney(0, 45000);
        userBalanceController.addMoney(1, 20000.55);
        userBalanceController.addMoney(2, 68000.35);
        printUsers(userController.getUserList());

        
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("1: add User| 2: change User| 3: del User| 4: add Money| 5: minus Money| 0: Exit");
            System.out.printf(">> ");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1: 
                    System.out.printf("Name: ");
                    Name = scanner.nextLine();
                    System.out.printf("Age: ");
                    Age = Integer.parseInt(scanner.nextLine());
                    userController.saveUser(Name, Age);
                    printUsers(userController.getUserList());
                    break;
                case 2:
                    System.out.printf("Enter ID of User for change: ");
                    id = Integer.parseInt(scanner.nextLine());
                    User currentUser = userController.getUserList().get(id);
                    System.out.printf("Name: ");
                    Name = scanner.nextLine();
                    currentUser.setName(Name);
                    System.out.printf("Age: ");
                    Age = Integer.parseInt(scanner.nextLine());
                    currentUser.setAge(Age);
                    userController.updateUser(id, currentUser);    //работает все и без этой строки
                    printUsers(userController.getUserList());
                    break;
                case 3:
                    System.out.printf("Enter ID of user for remove: ");
                    id = Integer.parseInt(scanner.nextLine());
                    userController.removeUser(userController.getUserList().get(id));
                    printUsers(userController.getUserList());
                    break;
                case 4:
                    System.out.printf("Enter ID of User for add balance: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Enter summ: ");
                    summ = Double.parseDouble(scanner.nextLine());
                    userBalanceController.addMoney(id, summ);
                    printUsers(userController.getUserList());
                    break;
                case 5:
                    System.out.printf("Enter ID of User for withdrawal of money: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.printf("Enter summ: ");
                    summ = Double.parseDouble(scanner.nextLine());
                    userBalanceController.withdrawal(id, summ);
                    printUsers(userController.getUserList());
                    break;
                case 0:
                    System.out.println("Bye!");
                    flag = false;
                    break;
                default:
                    System.out.println("Uncorrect command!");
                    break;
            }
        }
        scanner.close();
    }
    

    public static void printUsers(List<User> listUsers) {
        int i = 0;
        for (User user : listUsers) {
            System.out.printf("%d: %s \n", i, user);
            i++;
        }
    }
    
}
