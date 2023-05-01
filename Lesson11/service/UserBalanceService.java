package Lesson11.service;

public interface UserBalanceService {
    void addMoney(int id, double money);

    void withdrawal(int id, double money);

    double getBalance(int id);
}
