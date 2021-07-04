package com.anita.daily.adapter;

public class NepaliClient {
    public static void main(String[] args) {
        EnglishAdaptee englishAdaptee = new EnglishAdaptee();
        TranslatorAdapter translatorAdapter=new TranslatorAdapter(englishAdaptee);
        String words = "Nepali words";
        String englishWords = translatorAdapter.translate(translatorAdapter.readDescription(words));
        englishAdaptee.performInstruction(englishWords);
    }
}
