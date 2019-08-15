package com.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice5 {
    public static void main(String[] args) {

        String name = "jack";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.readLine();
        } catch (IOException e) {
            // nothing
        }

        if (name.equalsIgnoreCase("jack")) {
            System.out.println("Ok");
        } else {
            throw new IllegalArgumentException("Name should be only : " + name);
        }

//        System.out.println("I am after exception");

        System.out.println(getSum());
    }

    private static int getSum() {
        int a = 5;
        // not use Exception catch for logic
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            a = 10;
            return a;
        } finally {
            a = 15;
            return a;
        }
    }
}
