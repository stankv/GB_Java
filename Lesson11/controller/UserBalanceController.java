package Lesson11.controller;

import Lesson11.service.UserBalanceService;
import Lesson11.service.UserBalanceServiceImpl;

public class UserBalanceController {
    private UserBalanceService userBalanceService = new UserBalanceServiceImpl();

    public void addMoney(int id, double money) {
        userBalanceService.addMoney(id, money);
    }

    public void withdrawal(int id, double money) {
        userBalanceService.withdrawal(id, money);
    }

    public double getBalance(int id) {
        return userBalanceService.getBalance(id);
    }
}
