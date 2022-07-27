package com.tcs.strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ollo";
        System.out.println(reverseString(str));
        System.out.println(isPalindrome(str));
    }

    static String reverseString(String s){
        String result = "";
        for(int i=s.length()-1; i>=0; i--){
            result = result + s.charAt(i);
        }

        return result;
    }

    static boolean isPalindrome(String s){
        String reverse = reverseString(s);

        return s.equals(reverse);
    }
}
