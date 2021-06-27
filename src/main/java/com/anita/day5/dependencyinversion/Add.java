package com.anita.day5.dependencyinversion;

public class Add implements Calculation {

    public int  calculate(int i, int j)
    {
        return i+j;
    }

}
