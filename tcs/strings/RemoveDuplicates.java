package com.tcs.strings;

import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "bcabc";
        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str1){

        String result = "";
        StringBuilder str = new StringBuilder(str1);

        for(int i=0; i<str.length(); i++){
            int count = 0;
            char ch = str.charAt(i);
            for(int j=0; j< str.length(); j++){
                if( ch == str.charAt(j)){
                    count += 1;
                }
            }

            if(count == 1){

                result += ch;

            }
        }

        return result;
    }
}
