package com.tcs.strings;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "bcabc";
        System.out.println(removeDuplicates(str));
    }

    static String removeDuplicates(String str1){

        String result = "";
        ArrayList<String> list = new ArrayList();

        for(int i=0; i<str1.length(); i++){
            int count = 0;
            char ch = str1.charAt(i);

            if(!list.contains(String.valueOf(ch))){
               list.add(String.valueOf(ch));
            }

        }

        return list.toString();
    }
}
