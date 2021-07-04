package com.anita.daily.adapter;

public class TranslatorAdapter implements NepaliTarget{

    //Adaptee
    private EnglishAdaptee englishAdaptee;

    public TranslatorAdapter(EnglishAdaptee englishAdaptee) {
        this.englishAdaptee = englishAdaptee;
    }

    public String translate(String nepaliWords){
        System.out.println("Translating Nepali Words");
        return "Hello";
    }



    @Override
    public String readDescription(String words) {
        System.out.println("Reading Nepali Words");
        return words;
    }

    @Override
    public void showPictures() {


    }
}
