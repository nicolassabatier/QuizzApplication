package com.example.nicolassabatier.quizzapplication;

import android.os.Parcelable;
import android.os.Parcel;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dylangreed on 16/12/2016.
 */

public class ListOfQuestion implements Parcelable {

    private ArrayList randomindex = new ArrayList();
    private Country[] selectedcountries = new Country[10];


    public ListOfQuestion(Country[] listdatacountry) {

        // Create a list of ordered number to obtain a list of random number without duplicate
        ArrayList number = new ArrayList();
        for (int index = 0; index < listdatacountry.length ; index++)
        {
            number.add(index);
        }
        // Shuffle the ordered list
        Collections.shuffle(number);
        // take the first 3 integers from the random list
        // get 3 random countries from the initial data in a list
        for (int index = 0; index < 10; index++)
        {
            this.selectedcountries[index]=listdatacountry[(int)randomindex.get(index)];
        }

    }

    public Country getCountry(int index){

        return selectedcountries[index];
    }

    public int getQuestionFlag(int index){
        return selectedcountries[index].getFlagResId();
    }

    public String getQuestionName(int index){
        return selectedcountries[index].getNameResId();
    }

    protected ListOfQuestion(Parcel in) {
        if (in.readByte() == 0x01) {
            randomindex = new ArrayList<>();
            in.readList(randomindex, ListOfQuestion.class.getClassLoader());
        } else {
            randomindex = null;
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (randomindex == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeList(randomindex);
        }
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ListOfQuestion> CREATOR = new Parcelable.Creator<ListOfQuestion>() {
        @Override
        public ListOfQuestion createFromParcel(Parcel in) {
            return new ListOfQuestion(in);
        }

        @Override
        public ListOfQuestion[] newArray(int size) {
            return new ListOfQuestion[size];
        }
    };
}