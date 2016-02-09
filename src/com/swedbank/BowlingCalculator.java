package com.swedbank;

public class BowlingCalculator {
    private int totalScore = 0;

    public void roll(int score){
        totalScore += score;

    }
    public int getResult(){
       return totalScore;
    }
}
