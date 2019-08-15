package com.hw1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Zlat_3_13Test {

    boolean x1 = true;
    boolean x2 = false;
    boolean y1 = true;
    boolean y2 = false;

    @Test
    public void testGetResult_3_13_a() {
        //!(true && true)==!(true)==false
        assertEquals(false, new Zlat_3_13().getResult_3_13_a(x1, y1));
        //!(false && true) == !false = true
        assertEquals(true, new Zlat_3_13().getResult_3_13_a(x2, y1));
        //!(true && false) == !false = true
        assertEquals(true, new Zlat_3_13().getResult_3_13_a(x1, y2));
        //!(false && false) = !false=true
        assertEquals(true, new Zlat_3_13().getResult_3_13_a(x2, y2));
    }

    @Test
    public void testGetResult_3_13_b() {
        //!true || !true == false||false=false
        assertEquals(false, new Zlat_3_13().getResult_3_13_b(x1, y1));
        //!false || !true == true || false == true
        assertEquals(true, new Zlat_3_13().getResult_3_13_b(x2, y1));
        //!true || !false == false || true == true
        assertEquals(true, new Zlat_3_13().getResult_3_13_b(x1, y2));
        // !false || !false == true || true == true
        assertEquals(true, new Zlat_3_13().getResult_3_13_b(x2, y2));
    }

    @Test
    public void testGetResult_3_13_c() {
        // true || !true == true
        assertEquals(true, new Zlat_3_13().getResult_3_13_c(x1, y1));
        // false || !true = false
        assertEquals(false, new Zlat_3_13().getResult_3_13_c(x2, y1));
        //true || !false == true
        assertEquals(true, new Zlat_3_13().getResult_3_13_c(x1, y2));
        //false || !false == true
        assertEquals(true, new Zlat_3_13().getResult_3_13_c(x2, y2));
    }
}
