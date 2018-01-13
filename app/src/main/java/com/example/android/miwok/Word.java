package com.example.android.miwok;

import android.content.Context;

/**
 * Created by Michael S Parkin III on 1/10/2018.
 * Word represents a vocab word that the user wants to learn. It contains a default and Miwok translation of the word.
 */

public class Word {

    private int mAudioResourceId;

    //Miwok translation for the word
    private String mMiwokTranslation;


    //Default translation for the word
    private String mDefaultTranslation;

    //Image resource ID
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //
    public int getAudioResourceId() {
        return mAudioResourceId;
    }




    //Constructor for the words
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    //Constructor for the words
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    //Get the image resource ID
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        if (mImageResourceId != NO_IMAGE_PROVIDED) {
            return true;
        } else {
            return false;
        }
    }
}