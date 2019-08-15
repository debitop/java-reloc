package com.hw1;

//Вычислить значение логического выражения при всех возможных значениях
//        логических величин А и В:
//        а) не (А и В);
//        б) не А или В;
//        в) А или не В.


public class Zlat_3_13 {

    public boolean getResult_3_13_a(boolean x, boolean y) {
        return !(x && y);
    }

    public boolean getResult_3_13_b(boolean x, boolean y) {
        return !x || !y;
    }

    public boolean getResult_3_13_c(boolean x, boolean y) {
        return x || !y;
    }
}
