package com.anita.day5.dependencyinversion;

public class DITester {
    public static void main(String[] args) {
        test(new Add());

    }

     public static void test(Calculation calculation)
     {
         System.out.println(calculation.calculate(1 ,2));
     }
}
