package com.anita.builder;

public class MainBuilder {

    public static void main(String[] args) {
//        Department department = new Department()
//                .id(1L)
//                .name("Anita")
//                .numberOfMembers(1);


        Department department =  Department
                .builder()
                .id(1l)
                .name("Anita")
                .numberOfMembers(200)
                .build();
        System.out.println(department);

        Child child = Child.builder()
                .id(1L)
                .fname("Anita")
                .lname("Joshi")
                .build();
        System.out.println(child);

    }
}
