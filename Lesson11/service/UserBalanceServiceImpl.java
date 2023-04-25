package Lesson11.service;

import Lesson11.repository.UserRepository;

public class UserBalanceServiceImpl implements UserBalanceService {

    @Override
    public void addMoney(int id, double money) {
        UserRepository.addMoney(id, money);

    }

    @Override
    public void withdrawal(int id, double money) {
        UserRepository.withdrawal(id, money);
    }

    @Override
    public double getBalance(int id) {
        return UserRepository.getBalance(id);
    }
}
