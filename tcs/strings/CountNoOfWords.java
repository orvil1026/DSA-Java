package com.tcs.strings;

public class CountNoOfWords {
    public static void main(String[] args) {

        String str = "Hello hi";
        System.out.println(countNoOfWords(str));

    }

    static int countNoOfWords(String str){
        String[] splitted_words = str.split(" ");

        return splitted_words.length;


    }
}
