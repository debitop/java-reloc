package com.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Дано название футбольного клуба. Напечатать его на экране "столбиком".
public class Practice3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // DRY
        try {
            doSomethingElse(reader);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void doSomethingElse(BufferedReader reader) {
        try {
            String clubName = reader.readLine();
            for (char ch : clubName.toCharArray()) {
                System.out.println(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
