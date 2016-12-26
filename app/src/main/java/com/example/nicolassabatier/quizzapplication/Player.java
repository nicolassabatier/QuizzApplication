package com.example.nicolassabatier.quizzapplication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolassabatier on 20/12/2016.
 */

public class Player implements Serializable {


    private int score;
    private String name;

    public Player() {

    }

    public Player(String name, int score) {

        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


}
