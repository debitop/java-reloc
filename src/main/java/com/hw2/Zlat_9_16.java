package com.hw2;
//Дано слово. Определить, одинаковы ли второй и четвертый символы в нем.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Дано слово. Определить, одинаковы ли второй и четвертый символы в нем.

public class Zlat_9_16 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            doSomething(reader);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void doSomething(BufferedReader reader) {
        try {
            String name = reader.readLine();
            String answer = "не равны";
            if (name.charAt(1) == name.charAt(3)) {
                answer = "равны";
            }
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

