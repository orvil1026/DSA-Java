package com.strings;

public class Comparison {
    public static void main(String[] args) {

        String a = "Orvil";
        String b = "Orvil";

        // == compares the reference variable are pointing to same object
        System.out.println(a==b);

        String name1 = new String("Orvil");
        String name2 = new String("orvil");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
