package com.example.nicolassabatier.quizzapplication;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dylangreed on 26/12/2016.
 */

public class ListOfAnswer {

    private ArrayList randomindex = new ArrayList();
    private Country[] multiplechoiceordered = new Country[4];

    public ListOfAnswer(Country[] listdatacountry, Country correctanswer) {

        // Create a list of ordered number to obtain a list of random number without duplicate
        ArrayList number = new ArrayList();
        for (int index = 0; index < listdatacountry.length ; index++)
        {
            number.add(index);
        }
        // Shuffle the ordered list
        Collections.shuffle(number);
        // put the correct answer in the first place of the Country List
        this.multiplechoiceordered[0] = correctanswer;
        // get 3 random countries from the initial data in a list such that there is no the correct solution
        int index = 1;
        while (index < 4)
        {
            if (listdatacountry[(int)randomindex.get(index)].equals(correctanswer)) {
                this.multiplechoiceordered[index] = listdatacountry[(int) randomindex.get(5)];
                index++;
            }
            else {
                this.multiplechoiceordered[index] = listdatacountry[(int) randomindex.get(index)];
                index++;
            }

        }

    }

    public Country getAnswerCountry(int index){

        return multiplechoiceordered[index];
    }

    public int getAnswerFlag(int index){
        return multiplechoiceordered[index].getFlagResId();
    }

    public String getQuestionName(int index){
        return multiplechoiceordered[index].getNameResId();
    }
}
