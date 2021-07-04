package com.anita.stringmethods;

public class SubStringTest {
    public static void main(String[] args) {
        String s1 = "Springboot";
        String substr = s1.substring(0);
        System.out.println(substr);
        String substr2 = s1.substring(5,10);
        System.out.println(substr2);
        String substr3 = s1.substring(5,15); //Returns Exception
    }
}
