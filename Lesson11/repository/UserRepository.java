package Lesson11.repository;

import Lesson11.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class UserRepository {
    private static List<User> userList = new ArrayList<>();

    public void saveUser(User user) {
        userList.add(user);    //сохраняем пользователя в список
    }
        
    //либо сохраняем пользователя в файл
    /*try(FileWriter fileWriter = new FileWriter("users.txt", true)){
        fileWriter.write(user.toString());
    }catch (Exception e){
        System.out.println("error in repository!");
    }*/

    public void removeUser(User user) {
        userList.remove(user);
        System.out.println("User removed");
    }

    public void updateUser(int index, User user) {
        userList.set(index, user);
    }

    public List<User> getUserList() {
        return userList;
    }

    public static void addMoney(int id, double money) {
        userList.get(id).addMoney(money);
    }

    public static void withdrawal(int id, double money) {
        userList.get(id).withdrawal(money);
    }

    public static double getBalance(int id) {
        return userList.get(id).getBalance();
    }
}
