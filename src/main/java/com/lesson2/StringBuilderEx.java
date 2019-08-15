package com.lesson2;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("ABC");
        builder.append("DEF");
        System.out.println(builder);
        System.out.println(builder.toString());

        String m = "Murzik";

//        StringBuilder murzik = new StringBuilder("Murzik");
        StringBuilder murzik = new StringBuilder(m);
        StringBuilder murzik1 = new StringBuilder();
        murzik1.append(m);
        System.out.println(murzik.reverse());
        System.out.println(murzik1.reverse());
    }
}
