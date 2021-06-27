package com.anita.day5login;

public class FacebookLogin extends Login {

    @Override
    public void fetchFromSource()
    {
        System.out.println("pull the user credential from Facebook");
    }

}
