package com.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Дано слово. Получить его часть, образованную второй, третьей и четвертой буквами
public class Zlat_9_21 {
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
            System.out.println(name.substring(1, 4));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
