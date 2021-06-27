package com.anita.day5.dependencyinversion;

public class Sub implements Calculation {

    @Override
    public int calculate(int i , int j)
    {
        return i-j;
    }
}
