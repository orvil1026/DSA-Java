package com.tcs.strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "this is an amazing program";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String str){
        String result = "";
        String[] splitted_words = str.split(" ");

        for(int i=splitted_words.length-1; i>=0; i--){
            result += splitted_words[i] + " ";
        }

        return result;
    }
}
