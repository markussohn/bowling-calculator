package com.swedbank;

import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingCalculatorTest {


    @Test
    public void canWeRollTwentyTimes(){
        BowlingCalculator doRoll = new BowlingCalculator();
        for (int i = 0; i < 20; i++) {
            doRoll.roll(1);
            assertEquals(20, doRoll.getResult());
        }

    }
}