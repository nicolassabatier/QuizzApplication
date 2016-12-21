package com.example.nicolassabatier.quizzapplication;

/**
 * Created by dylangreed on 14/12/2016.
 * Object class for a country that save the flag and the name
 */

public class Country {

    private int mFlagResId; // gives the id resource for icon in drawable res
    private String mName;  // Associated name

    public Country(int flagtResId, String name) {

        mFlagResId = flagtResId;
        mName = name;
    }

    public int getFlagResId() {
        return mFlagResId;
    }

    public void setFlagResId(int flagtResId) {
        mFlagResId = flagtResId;
    }

    public String getNameResId() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
