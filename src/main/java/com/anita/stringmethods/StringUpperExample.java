package com.anita.stringmethods;

import java.util.Locale;

public class StringUpperExample {
    public static void main(String[] args) {
        String s1 = "hello string";
        String s1upper = s1.toUpperCase();
        System.out.println(s1upper);
        String turkish = s1.toUpperCase(Locale.forLanguageTag("tr"));
        String english = s1.toUpperCase(Locale.forLanguageTag("en"));
        System.out.println(turkish);
        System.out.println(english);
    }


}
