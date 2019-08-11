package com.lesson1;

public abstract class Cat {
    private String name;
    private int age;

    public abstract void getVoice();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
