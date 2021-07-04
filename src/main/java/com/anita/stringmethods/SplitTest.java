package com.anita.stringmethods;

public class SplitTest {
    public static void main(String[] args) {
        String s1 = "Welcome to Dhangadhi";
        String[] words = s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
