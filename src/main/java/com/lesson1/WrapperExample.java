package com.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrapperExample {
    public static void main(String[] args) {
        // -128..127
        Byte b = new Byte("123");
        Short val1 = 127;
        Short val2 = 127;
        Short val3 = 128;
        Short val4 = 128;

        System.out.println(val1 == val2);
        System.out.println(val3.equals(val4));
        String value = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            value = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        EnumEx enumEx = EnumEx.valueOf(value);

        for (EnumEx e : EnumEx.values()) {
            if (e == enumEx) {
                System.out.println("Hello");
            }
        }
    }
}
