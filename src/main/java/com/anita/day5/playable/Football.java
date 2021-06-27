package com.anita.day5.playable;
//concrete class
public class Football extends Ball {

    @Override
    public void play() {
        color= "White";
        System.out.println("Playing " + color +  " Football");
    }
}
