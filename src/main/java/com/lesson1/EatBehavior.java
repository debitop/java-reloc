package com.lesson1;

public interface EatBehavior {
    default void getCount() {
        System.out.println("I have eaten a two piece of pizza");
    }

    void getInfo();
}
