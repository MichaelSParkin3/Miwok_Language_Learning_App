package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Michael S Parkin III on 1/10/2018.
 * Word represents a vocab word that the user wants to learn. It contains a default and Miwok translation of the word.
 */

public class Word {


    //Miwok translation for the word
    private String mMiwokTranslation;


    //Default translation for the word
    private String mDefaultTranslation;


    //Constructor for the words
    public Word (String defaultTranslation, String miwokTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    //Set the miwok translation of the word
    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }
    //Get the miwok translation of the word
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    //Set the default translation of the word
    public void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }
    //Get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
