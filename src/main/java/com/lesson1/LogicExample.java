package com.lesson1;

//Вычислить значение логического выражения при следующих значениях логи-
//ческих величин А, В и С: А = Истина, В = Ложь, С = Ложь:
//а) А или В;
//б) А и В;
//в) В или С.

//Вычислить значение логического выражения при всех возможных значениях
//логических величин X, Y и Z:
//а) не (Y или не X и Z) или Z;
//б) X и не (не Y или Z) или Y;
//в) не (X или Y и Z) или не X.

public class LogicExample {

    public boolean getResultAA(boolean x, boolean y, boolean z) {
        return !(y || !x && z) || z;
    }

    public boolean getResultBB(boolean x, boolean y, boolean z) {
        return x && !(!y || z) || y;
    }

    public boolean getResultCC(boolean x, boolean y, boolean z) {
        return !(x || y && z) || !x;
    }

    public boolean getResultA(boolean a, boolean b) {
        return a || b;
    }

    public boolean getResultB(boolean a, boolean b) {
        return a && b;
    }

    public boolean getResultC(boolean b, boolean c) {
        return b || c;
    }

    public boolean getResultD(boolean b, boolean c) {
        return b && c;
    }
}
