package com.anita.stringmethods;

public class EqualsExample {
    public static void main(String[] args) {
        String s1 = "anita";
        String s2 = "anita";
        String s3 = "ANITA";
        String s4 = "java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
    }
}
