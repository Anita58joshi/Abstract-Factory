package com.anita.collectionsandgenerics.list;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Anita");
//        names.add("Anita");
//
//        System.out.println(names);

        CustomList<Integer> ages = new CustomGenericArrayList<>();

        ages.add(22);
        ages.add(24);
        ages.add(25);
        ages.add(26);

//        System.out.println(ages);

        while (ages.hasNext()){
            System.out.println(ages.next());
        }

    }

}
