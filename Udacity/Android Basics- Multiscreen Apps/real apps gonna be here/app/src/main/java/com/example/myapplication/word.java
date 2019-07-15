package com.example.myapplication;

public class word {
    private String mDefaultTranslation;
    private String mMalayalamTranslation;

    public word (String defaultTranslation, String malayalamTranslation){
       mMalayalamTranslation= malayalamTranslation;
       mDefaultTranslation= defaultTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getmMalayalamTranslation(){
        return mMalayalamTranslation;
    }
}
