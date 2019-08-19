package com.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Составить программу, которая запрашивает название футбольной команды
//и повторяет его на экране со словами "— это чемпион!".
public class Zlat_9_2 {
    public static void main(String[] args) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            doSomething(reader, "- это чемпион!");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static void doSomething(BufferedReader reader, String greeting) {
        try {
            String name = reader.readLine();
            System.out.println(name + " " + greeting);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
