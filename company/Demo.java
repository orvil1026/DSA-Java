package com.company;

public class Demo {
    public static void main(String[] args) {
        String hello = "hel";
        String world = "hel";
        System.out.println(hello.equals(world));
        System.out.println(world.indexOf(hello.charAt(0)));

        System.out.println(hello.substring(0,1));


        String[] words = {"hello", "owrld"};
        System.out.println(String.join(" ",words));


        char[] characters = {'h','e','l','l','o'};
        System.out.println(String.valueOf(characters));



    }
}
