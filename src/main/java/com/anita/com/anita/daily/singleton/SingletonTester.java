package com.anita.com.anita.daily.singleton;

import com.anita.daily.singleton.dto.Person;

public class SingletonTester {

    public static void main(String[] args) {

        Person person1 = Person.getInstance();

        person1.setName("Anita");
        person1.setContactNo("9843492358");
        person1.setAddress("Kalanki");
        System.out.println(person1);

        Person person2 = Person.getInstance();

        person2.setName("Anita1");
        person2.setContactNo("9843492358");
        person2.setAddress("Kalanki");

        System.out.println(person2);





    }


}
