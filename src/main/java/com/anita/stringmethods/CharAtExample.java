package com.anita.stringmethods;

public class CharAtExample {
    public static void main(String[] args) {
        String str = "Welcome to Nepalaya College";
        int strLength = str.length();
        System.out.println("Character at 0 index is: "+str.charAt(0));
        System.out.println("Character at last index is: "+ str.charAt(strLength-1));

    }
}
