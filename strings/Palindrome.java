package com.strings;

public class Palindrome {
    public static void main(String[] args) {
        String test = "abcdba";
        System.out.println(isBoolean(test));

    }

    static boolean isBoolean(String str){
        int start = 0;
        int end = str.length() - 1;
        str = str.toLowerCase();

        while(start<=end){
            if(str.charAt(start) == str.charAt(end)){
                start ++;
                end --;
            }else{
                return false;
            }
        }
        return true;
    }
}
