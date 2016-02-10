package com.swedbank;

public class BowlingCalculator {
    private int rollingResults[] = new int[21];
    private int currentRoll = 0;

    public void roll(int score){
        rollingResults[currentRoll++] = score;

    }
    public int getResult(){
        int totalScore = 0;
        int firstOfFrame = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (ifStrikeScored(firstOfFrame)){
                totalScore += 10 + rollingResults[firstOfFrame + 1] + rollingResults[firstOfFrame + 2];
                firstOfFrame += 1;
            }
            else if (ifSpareScored(firstOfFrame)){
                totalScore += scoreOfSpare(firstOfFrame);
                firstOfFrame += 2;
            }
            else {
                totalScore += scoreOfTwoRolls(firstOfFrame);
                firstOfFrame += 2;
            }

        }
        return totalScore;
    }

    public int scoreOfSpare(int firstOfFrame) {
        return 10 + rollingResults[firstOfFrame + 2];
    }

    public int scoreOfTwoRolls(int firstOfFrame) {
        return rollingResults[firstOfFrame] + rollingResults[firstOfFrame + 1];
    }

    public boolean ifSpareScored(int firstOfFrame) {
        return rollingResults[firstOfFrame] + rollingResults[firstOfFrame + 1] == 10;
    }

    public boolean ifStrikeScored(int firstOfFrame) {
        return rollingResults[firstOfFrame] == 10;
    }
}
