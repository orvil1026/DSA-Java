package com.tcs.strings;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Take you forward";
        System.out.println(removeSpaces(str));
    }

    static String removeSpaces(String s){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' '){
                continue;
            }else{
                result.append(ch);
            }

        }

        return result.toString();
    }
}
