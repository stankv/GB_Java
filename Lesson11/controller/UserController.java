package Lesson11.controller;

import java.util.List;

import Lesson11.model.User;
import Lesson11.service.UserService;
import Lesson11.service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, int age){
        userService.saveUser(new User(name, age));
    }

    public void removeUser(User user) {
        userService.removeUser(user);
    }

    public void updateUser(int index, User user) {
        userService.updateUser(index, user);
    }

    public List<User> getUserList() {
        return userService.getUserList();
    }
}
