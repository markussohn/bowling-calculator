package com.swedbank;

import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {

    private BowlingCalculator doRoll = new BowlingCalculator();

    public void rollManyTimes(int numberOfRolls, int numberOfPins) {
        for (int i = 0; i < numberOfRolls; i++) {
            doRoll.roll(numberOfPins);
        }
    }

    public void rollSpare(int score, int score2) {
        doRoll.roll(score);
        doRoll.roll(score2);
    }

    public void rollStrike(int score) {
        doRoll.roll(score);
    }

    @Test
    public void canWeRollOneTwentyTimes(){
        rollManyTimes(20, 1);
        assertEquals(20, doRoll.getResult());
    }

    @Test
    public void canWeRollTwoTwentyTimes(){
        rollManyTimes(20, 2);
        assertEquals(40, doRoll.getResult());
    }

    @Test
    public void canWeRollOneSpare(){
        rollSpare(8, 2);
        doRoll.roll(5);
        rollManyTimes(17, 0);
        assertEquals(20, doRoll.getResult());
    }

    @Test
    public void canWeRollStrike() {
        rollStrike(10);
        doRoll.roll(5);
        doRoll.roll(4);
        rollManyTimes(16, 0);
        assertEquals(28, doRoll.getResult());
    }

}