package com.anita.stringmethods;

import java.util.Locale;

public class StringToLowerCase {
    public static void main(String[] args) {
        String s1 = "FULL STACK JAVA IN SPRINGBOOT";
        String s1lower = s1.toLowerCase();
        System.out.println(s1lower);
        String eng = s1.toLowerCase(Locale.ENGLISH);
        System.out.println(eng);
        String turkish = s1.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(turkish);
    }

}
