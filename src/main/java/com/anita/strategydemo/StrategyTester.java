package com.anita.strategydemo;

import com.anita.strategy.strategydemo.DashainSpecialStrategy;

public class StrategyTester {
    public static void main(String[] args) {
        CustomerBill customerBill = new CustomerBill(new DashainSpecialStrategy());

        customerBill.add(560.0, 5);
        customerBill.add(4500, 1);

        customerBill.print();
    }
}
