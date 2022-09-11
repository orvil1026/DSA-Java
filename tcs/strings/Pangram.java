package com.tcs.strings;

public class Pangram {

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isPangram(str));
    }

    static boolean isPangram(String str){

        boolean[] letters = new boolean[26];

        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++){
            char ch = chars[i];

            letters[ch - 'a'] = true;
        }

        for(int i=0; i<letters.length; i++){

            if(letters[i] == false){
                return false;
            }
        }

        return true;

    }

}
