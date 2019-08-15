package com.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String val1 = "Cat";
        val1 = "Barsik";
        val1 = "Bar" + "sik";
        String val2 = new String("Cat");

        // pull literalov
        String val3 = "Murzik";
        String val4 = "Murzik";

        System.out.println(val3 == val4);

        String val5 = "Mur";
        String val6 = "zik";
        String val7 = val5 + val6;
        System.out.println(val3 == val7);

        System.out.println(val3.equals(val7));

        String val8 = new String("Murzik").intern();
        System.out.println(val3 == val8);

        System.out.println(val8.charAt(0));
        System.out.println(val8.length());

        for (int i = val8.length() - 1; i >= 0 ; i--) {
            System.out.println(val8.charAt(i));
        }

        String val9 = "";

        System.out.println(val9 == null);
        System.out.println(val9.isEmpty());

        if(val9.isEmpty()) {
            System.out.println("All ok");
        }

        System.out.println(val8.codePointAt(1));
        char ch = 117;
        System.out.println(ch);

        System.out.println(val8.hashCode());

        System.out.println(val8.compareTo(val3));

        System.out.println(val8.toUpperCase());
        System.out.println(val8.toLowerCase());

        System.out.println(Arrays.toString(val8.toCharArray()));
        System.out.println(val1.toCharArray().length);
        char[] chars = new char[]{'a', 'b'};
        System.out.println(chars.length);

        System.out.println(val8.indexOf(117));
        System.out.println(val8.indexOf("M"));

        String index = "JackFromBottle";
        System.out.println(index.indexOf("o", 7));
        System.out.println(index.lastIndexOf(117));
        System.out.println(index.lastIndexOf("o"));

        System.out.println(index.replace("o", "a"));
        System.out.println(index.replaceAll("t", "d"));

        System.out.println(index);
        System.out.println(index.endsWith("ttle"));
        System.out.println(index.startsWith("ttle"));

        String string1 = "  tkd d ";
        System.out.println(string1.length());
        System.out.println(string1.trim().length());

        System.out.println(index.substring(4));

        Integer a = 5;

        System.out.println(String.valueOf(a));

        String example = "Abc Abc CDA";
        String[] array = example.split(" ");
        System.out.println(Arrays.toString(array));

    }

    String getCount() {
        int a = 5;
        return String.valueOf(a);
    }
}
