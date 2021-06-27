package com.anita.abstractfactory;

public class OSXButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created OSXButton.");
    }
}
