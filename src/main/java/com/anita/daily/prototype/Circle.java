package com.anita.daily.prototype;

public class Circle extends Shape{

    private String data;

    public Circle() {
        //hiting database ko code
        super(); //super constructor invoked
        this.type= "Circle";
    }


    @Override
    void draw() {
        System.out.println("Drawing Circle...");
    }
}
