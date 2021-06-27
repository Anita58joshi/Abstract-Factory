package com.anita.day5login;

public  abstract class Login implements LoginContract{

    @Override
    public void isValidUser()
    {
        System.out.println("Checks if user is in our database");
    }

    public void process()
    {
        fetchFromSource();
        isValidUser();

    }

}
