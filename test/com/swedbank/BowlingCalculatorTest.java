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
}