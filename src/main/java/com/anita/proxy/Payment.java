package com.anita.proxy;

public interface Payment {

    void loadBalance(double amount);
    double checkBalance();
    void pay(double amount);
}
