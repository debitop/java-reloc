package com.lesson1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicExampleTest {

    // actual == expected
    @Test
    public void testGetResultA() {
        assertTrue(new LogicExample().getResultA(true, false));
    }

    @Test
    public void testGetResultB() {
        // equal to assertFalse
        Assert.assertEquals(false, new LogicExample().getResultB(true, false));
        // simplify record
        assertFalse(new LogicExample().getResultB(true, false));
    }

    @Test
    public void testGetResultC() {
        assertFalse(new LogicExample().getResultC(false, false));
    }

    @Test
    public void testGetResultD() {
        assertFalse(new LogicExample().getResultD(false, false));
    }

    @Test
    public void testGetResultAA() {
        boolean x1 = true;
        boolean x2 = false;

        boolean y1 = true;
        boolean y2 = false;

        boolean z1 = true;
        boolean z2 = false;

         assertEquals(true, new LogicExample().getResultAA(x1, y1, z1));
         assertEquals(true, new LogicExample().getResultAA(x1, y2, z1));
         assertEquals(false, new LogicExample().getResultAA(x1, y1, z2));
         assertEquals(true, new LogicExample().getResultAA(x1, y2, z2));
         assertEquals(true, new LogicExample().getResultAA(x2, y1, z1));
         assertEquals(true, new LogicExample().getResultAA(x2, y2, z1));
         assertEquals(true, new LogicExample().getResultAA(x2, y2, z2));
    }
}
