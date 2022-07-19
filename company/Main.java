package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i=97; i<97+26; i++){
            char a = (char) i;
            System.out.println(a);
        }

        String sentence = "Hello world";

        for(int i=0; i<sentence.length(); i++){
            char n = sentence.charAt(i);
            System.out.println(n);
        }


//        System.out.println((char)97);
    }
}
