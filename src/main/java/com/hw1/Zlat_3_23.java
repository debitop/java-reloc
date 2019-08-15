package com.hw1;

//Вычислить значение логического выражения при всех возможных значениях
//        логических величин А, В и С:
//        а) не (А или не В и С) или С;
//        б) не (А и не В или С) и В;
//        в) не (не А или В и С) или А.

public class Zlat_3_23 {
    public boolean getResult_3_23_a(boolean x, boolean y, boolean z) {
        return !(x || !y && z) || z;
    }

    public boolean getResult_3_23_b(boolean x, boolean y, boolean z) {
        return !(x && !y || z) && y;
    }

    public boolean getResult_3_23_c(boolean x, boolean y, boolean z) {
        return !(!x || y && z) || x;
    }
}
