package com.lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Barsik cat = new Barsik();

        cat.getCount();
        SleepBehavior.getD();

        for (EnumEx e : EnumEx.values()) {
            if (e == EnumEx.Murzik) {
                System.out.println("it's Murzik");
            } else if (e == EnumEx.Barsik){
                System.out.println("it's Barsik");
            }
        }
    }
}
