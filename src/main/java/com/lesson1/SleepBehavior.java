package com.lesson1;

public interface SleepBehavior {
    static void getD() {
        System.out.println("I am from static");
    }

    default void getSomething() {
        System.out.println("I have eaten a three piece of pizza");
    }

    void getInfo();
}
