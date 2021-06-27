package com.anita.builder;

public class Department {

    private Long id;
    private String  name;
    private Integer numberOfMembers;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfMembers=" + numberOfMembers +
                '}';
    }

    public Department(Long id, String name, Integer numberOfMembers) {
        this.id = id;
        this.name = name;
        this.numberOfMembers = numberOfMembers;
    }

    public static DepartmentBuilder builder(){
        return new DepartmentBuilder();
    }

//    public Long getId() {
//        return id;
//    }
//
//    public Department id(Long id) {
//        this.id = id;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Department name(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Integer getNumberOfMembers() {
//        return numberOfMembers;
//    }
//
//    public  Department numberOfMembers(Integer numberOfMembers) {
//        this.numberOfMembers = numberOfMembers;
//        return this;
//    }
    //Advance Builder
    public static class DepartmentBuilder{
        private Long id;
        private String name;
        private Integer numberOfMembers;

    public Long getId() {
        return id;
    }

    public DepartmentBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DepartmentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Integer getNumberOfMembers() {
        return numberOfMembers;
    }

    public DepartmentBuilder numberOfMembers(Integer numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
        return this;
    }
    public Department build(){
        return new Department(id,name,numberOfMembers);
    }

}

}
