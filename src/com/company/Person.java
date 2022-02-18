package com.company;

public class Person {

    private String name;
    private int age;
    private char sign;


    public Person(String name, int age, char sign) {
        this.name = name;
        this.age = age;
        this.sign = sign;
    }

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

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return
                "Name: " + name +
                ", age: " + age +
                ", sign: " + sign;
    }
}
