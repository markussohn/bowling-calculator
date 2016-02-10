package com.swedbank;

public class BowlingCalculator {
    private int rollingResults[] = new int[21];
    private int currentRoll = 0;

    public void roll(int score){
        rollingResults[currentRoll++] = score;

    }
    public int getResult(){
        int totalScore = 0;
        int i = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (rollingResults[i] == 10){
                totalScore += 10 + rollingResults[i + 1] + rollingResults[i + 2];
                i += 1;
            }
            else if (rollingResults[i] + rollingResults[i + 1] == 10){
                totalScore += 10 + rollingResults[i + 2];
                i += 2;
            }
            else {
                totalScore += rollingResults[i] + rollingResults[i + 1];
                i += 2;
            }

        }
        return totalScore;
    }
}
