package com.anita.strategy.strategydemo;

public class DashainSpecialStrategy implements BillingStrategy{

    @Override
    public double getActPrice(double rawPrice) {
        return rawPrice/2;
    }
}
