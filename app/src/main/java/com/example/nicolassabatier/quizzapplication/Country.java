package com.example.nicolassabatier.quizzapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by dylangreed on 14/12/2016.
 * Object class for a country that save the flag and the name
 */


public class Country implements Parcelable {

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


    protected Country(Parcel in) {
        mFlagResId = in.readInt();
        mName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mFlagResId);
        dest.writeString(mName);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Country> CREATOR = new Parcelable.Creator<Country>() {
        @Override
        public Country createFromParcel(Parcel in) {
            return new Country(in);
        }

        @Override
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };
}
