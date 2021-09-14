package com.anita.strategy.strategydemov2;

public class MulStrategy implements MathStrategy {

    @Override
    public double calculate(double x, double y) {
        return x*y;
    }
}
