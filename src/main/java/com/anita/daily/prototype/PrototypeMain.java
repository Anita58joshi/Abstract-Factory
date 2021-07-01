package com.anita.daily.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
         Shape circle = ShapeFctory.getShape("Circle");
         circle.setSize(112);
         System.out.println(circle);
         Shape rectangle = ShapeFctory.getShape("Rectangle");
         rectangle.setSize(112);
         System.out.println(rectangle);
    }
}
