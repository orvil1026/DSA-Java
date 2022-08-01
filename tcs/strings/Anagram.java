package com.tcs.strings;

public class Anagram {

    public static void main(String[] args) {
        String str1 = "RULES";
        String str2 = "LESRT";

        System.out.println(isAnagram(str1, str2));


    }

    static boolean isAnagram(String str1, String str2){

        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            int count = 0;

            for(int j=0; j<str2.length(); j++){
                if(ch == str2.charAt(j)){
                    count += 1;
                }
            }

            if(count < 1){
                return false;
            }
        }

        return true;
    }
}
