package com.tcs.strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "take u forward";
        System.out.println(removeVowels(s));
    }

    static String removeVowels(String s){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }else{
                result.append(ch);
            }

        }

        return result.toString();
    }
}
