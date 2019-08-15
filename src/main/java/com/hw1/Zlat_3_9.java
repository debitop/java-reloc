package com.hw1;

//Вычислить значение логического выражения при следующих значениях логи-ческих величин X, Y и Z:
//        X = Истина, Y = Ложь, Z = Ложь:
//        а) не X или не Y или не Z;
//        б) (не X или не Y) и (X или Y);
//        в) X и Y или X и Z или не Z.

public class Zlat_3_9 {
    public boolean getResult_3_9_a(boolean x, boolean y, boolean z) {
        // false || true || true
        // true || true = true
        return !x || !y || !z;
    }

    public boolean getResult_3_9_b(boolean x, boolean y, boolean z) {
        // (false || true) && (true || false)
        // true && true = true
        return (!x || !y) && (x || y);
    }

    public boolean getResult_3_9_c(boolean x, boolean y, boolean z) {
        // false || true && false || true - в конце  || true всегда вернет true
        // true && false || true
        // false || true = true
        return x && y || x && z || !z;
    }
}
