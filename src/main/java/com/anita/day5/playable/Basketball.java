package com.anita.day5.playable;

public class Basketball extends Ball{
    @Override
    public void play() {
        color= "Red";
        System.out.println("Playing " + color + " Basketball...");
    }
}
