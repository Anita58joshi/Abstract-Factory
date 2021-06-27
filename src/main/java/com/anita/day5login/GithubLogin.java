package com.anita.day5login;

public class GithubLogin extends Login{
    @Override
    public void fetchFromSource()
    {
        System.out.println("pull the user credential from github");
    }
}
