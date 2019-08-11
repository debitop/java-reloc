package com.hw1;

public class Task3_9 {
    static int b;
    int a;

    static {
        b = 15;
    }

    {
        a = 10;
    }

    public static void main(String[] args) {
        System.out.println(new Task3_9().a);
        System.out.println(Task3_9.b);
    }
}
