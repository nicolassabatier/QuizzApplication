package com.example.nicolassabatier.quizzapplication;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dylangreed on 16/12/2016.
 */

public class ListOfQuestion {

    private ArrayList randomindex = new ArrayList();
    private Country[] selectedcountries = new Country[2];


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
        for (int index = 0; index < 2; index++)
        {
            this.randomindex.add(number.indexOf(index));
        }
        // get 3 random countries from the initial data in a list
        for (int index = 0; index < 2; index++)
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
}
