package Lesson11.service;

import java.util.List;

import Lesson11.model.User;

public interface UserService {
    void saveUser(User user);
    void removeUser(User user);
    void updateUser(int index, User user);
    List<User> getUserList();
}
