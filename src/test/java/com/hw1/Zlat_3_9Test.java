package com.hw1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
////        X = Истина, Y = Ложь, Z = Ложь:

public class Zlat_3_9Test {
    boolean x = true;
    boolean y = false;
    boolean z = false;

    @Test
    public void testGetResult_3_9_a() {
        assertEquals(true, new Zlat_3_9().getResult_3_9_a(x, y, z));
    }

    @Test
    public void testGetResult_3_9_b() {
        assertEquals(true, new Zlat_3_9().getResult_3_9_b(x, y, z));
    }

    @Test
    public void testGetResult_3_9_c() {
        assertEquals(true, new Zlat_3_9().getResult_3_9_c(x, y, z));
    }
}

