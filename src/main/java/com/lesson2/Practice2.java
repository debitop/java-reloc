package com.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 9.13. Дано слово. Вывести на экран его третий символ.
public class Practice2 {
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

    private static void doSomething(BufferedReader reader) {
        try {
            String word = reader.readLine();
            System.out.println(word.charAt(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
