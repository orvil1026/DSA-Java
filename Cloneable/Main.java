package com.Cloneable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human orvil = new Human(12, "orvil");

        Human ram = (Human)orvil.clone();

        System.out.println(ram.age);
        System.out.println(ram.name);
    }
}
