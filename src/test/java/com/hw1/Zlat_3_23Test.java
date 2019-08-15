package com.hw1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Zlat_3_23Test {

    boolean x1 = true;
    boolean x2 = false;
    boolean y1 = true;
    boolean y2 = false;
    boolean z1 = true;
    boolean z2 = false;

    @Test
    public void testGetResult_3_23_a() {
        //!(true || false && true)||true ==true
        assertEquals(true, new Zlat_3_23().getResult_3_23_a(x1, y1, z1));
        //true
        assertEquals(true, new Zlat_3_23().getResult_3_23_a(x1, y2, z1));
        // !(true || false && true)||false == !(true && true)||false==!true||false ==false
        assertEquals(false, new Zlat_3_23().getResult_3_23_a(x1, y1, z2));
        assertEquals(false, new Zlat_3_23().getResult_3_23_a(x1, y2, z2));
        //true
        assertEquals(true, new Zlat_3_23().getResult_3_23_a(x2, y1, z1));
        assertEquals(true, new Zlat_3_23().getResult_3_23_a(x2, y2, z1));
        assertEquals(true, new Zlat_3_23().getResult_3_23_a(x2, y1, z2));
        assertEquals(true, new Zlat_3_23().getResult_3_23_a(x2, y2, z2));
    }

    @Test
    public void testGetResult_3_23_b() {
        //!(true&&false||true)&& true==!(false||true)&&true==!true&&true==false
        assertEquals(false, new Zlat_3_23().getResult_3_23_b(x1, y1, z1));
        assertEquals(false, new Zlat_3_23().getResult_3_23_b(x1, y2, z1));
        assertEquals(true, new Zlat_3_23().getResult_3_23_b(x1, y1, z2));
        assertEquals(false, new Zlat_3_23().getResult_3_23_b(x1, y2, z2));
        assertEquals(false, new Zlat_3_23().getResult_3_23_b(x2, y1, z1));
        assertEquals(false, new Zlat_3_23().getResult_3_23_b(x2, y2, z1));
        assertEquals(true, new Zlat_3_23().getResult_3_23_b(x2, y1, z2));
        assertEquals(false, new Zlat_3_23().getResult_3_23_b(x2, y2, z2));
    }

    @Test
    public void testGetResult_3_23_c() {
        //true
        assertEquals(true, new Zlat_3_23().getResult_3_23_c(x1, y1, z1));
        //true
        assertEquals(true, new Zlat_3_23().getResult_3_23_c(x1, y2, z1));
        assertEquals(true, new Zlat_3_23().getResult_3_23_c(x1, y1, z2));
        assertEquals(true, new Zlat_3_23().getResult_3_23_c(x1, y2, z2));
        //true
        assertEquals(false, new Zlat_3_23().getResult_3_23_c(x2, y1, z1));
        assertEquals(false, new Zlat_3_23().getResult_3_23_c(x2, y2, z1));
        assertEquals(false, new Zlat_3_23().getResult_3_23_c(x2, y1, z2));
        assertEquals(false, new Zlat_3_23().getResult_3_23_c(x2, y2, z2));
    }
}
