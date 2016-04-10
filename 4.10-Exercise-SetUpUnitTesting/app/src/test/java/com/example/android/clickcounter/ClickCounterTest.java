package com.example.android.clickcounter;

import com.example.android.clickcounter.ClickCounter;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class ClickCounterTest {

    private ClickCounter mCounter;

    @Before
    public void setUpCounter() {
        mCounter = new ClickCounter();
    }

    @Test
    public void clickCounter_InitialCount_is0() {
        Assert.assertEquals(mCounter.getCount(), 0);
    }

    @Test
    public void clickCounter_afterIncrease_is1() {
        mCounter.increment();
        Assert.assertEquals(mCounter.getCount(), 1);
    }
}
