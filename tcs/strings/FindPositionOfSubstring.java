package com.tcs.strings;

public class FindPositionOfSubstring {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "az";
        System.out.println(findPosition(str1, str2));

    }

    static  int findPosition(String str, String substr){
        if(str.contains(substr)){
            return str.indexOf(substr);
        }else{
            return -1;
        }
    }
}
