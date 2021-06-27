package com.anita.com.anita.daily.singleton;

import com.anita.daily.singleton.dto.Student;

public class StaticTester {
    public static void main(String[] args) {
        System.out.println(new Student("Anita0"));
        System.out.println(new Student("Anita1"));
        System.out.println(new Student("Anita2"));
        System.out.println(new Student("Anita3"));
        System.out.println(new Student("Anita4"));
    }
}
