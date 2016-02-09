package com.swedbank;

import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {

    private BowlingCalculator doRoll = new BowlingCalculator();

    @Test
    public void canWeRollOneTwentyTimes(){
        for (int i = 0; i < 20; i++) {
            doRoll.roll(1);
        }
        assertEquals(20, doRoll.getResult());
    }

    @Test
    public void canWeRollTwoTwentyTimes(){
        for (int i = 0; i < 20; i++) {
            doRoll.roll(2);
        }
        assertEquals(40, doRoll.getResult());
    }

    @Test
    public void canWeRollOneSpare(){
        doRoll.roll(8);
        doRoll.roll(2);
        doRoll.roll(5);
        assertEquals(20, doRoll.getResult());
    }

    @Test
    public void canWeRollThreeSparesInARow(){
        doRoll.roll(8);
        doRoll.roll(2); //15
        doRoll.roll(5);
        doRoll.roll(5); //32
        doRoll.roll(7);
        doRoll.roll(3); //48
        doRoll.roll(6);
        assertEquals(54, doRoll.getResult());
    }

}