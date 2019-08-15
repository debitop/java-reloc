package com.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Дано предложение. Напечатать все его символы, предшествующие первой
// запятой. Рассмотреть два случая:
//1) известно, что в предложении запятые имеются;
//2) в предложении запятых может не быть.
public class Practice4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            printSymbolsBeforeComma(reader);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printSymbolsBeforeComma(BufferedReader reader) {
        try {
            String sentence = reader.readLine();
            int countComma = 0;
            // think about it - can we do it with method of string
            for (char ch : sentence.toCharArray()) {
                if (ch == ',') {
                    countComma++;
                }
            }

            if (countComma == 0) {
                System.out.println(sentence);
            } else {
                for (char ch : sentence.toCharArray()){
                    if (ch != ',') {
                        System.out.print(ch);
                    } else {
                        break;
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
