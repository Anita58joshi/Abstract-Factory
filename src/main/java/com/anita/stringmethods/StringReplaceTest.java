package com.anita.stringmethods;

public class StringReplaceTest {
    public static void main(String[] args) {
        String s1 = "Netflix is a versatile website";
        String replaceString = s1.replace('e','a');
        System.out.println(replaceString);
        String replaceString1 = s1.replace("is","was");
        System.out.println(replaceString1);
    }
}
