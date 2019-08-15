package com.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Составить программу, которая:
//а) запрашивает имя человека и повторяет его на экране;
//б) запрашивает имя человека и повторяет его на экране с приветствием.
public class Practice1 {

    public static void main(String[] args) {
        // before java 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            doSomething(reader, "hello my darling...");
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // since java 7
//          try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//              String name = reader.readLine();
//              System.out.println(name);
//          } catch (IOException e) {
//              e.printStackTrace();
//          }
//
//          try(BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in))) {
//              String surname = reader1.readLine();
//              System.out.println(surname);
//          } catch (IOException e) {
//              e.printStackTrace();
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

