package com.tcs.strings;

public class RemoveCharFromFirstString {

    public static void main(String[] args) {
        String str1 = "xyzpw";
        String str2 = "lmno";

        System.out.println(removeCharFromFirstString(str1, str2));
    }

    static String removeCharFromFirstString(String str1, String str2){
        String result = "";

        for(int i=0; i< str1.length(); i++){
            boolean Present = false;
            char ch = str1.charAt(i);

            for(int j=0; j< str2.length(); j++){
                char ch2 = str2.charAt(j);
                if(ch == ch2){
                    Present = true;
                    break;
                }

            }

            if(!Present){
                result += ch;
            }
        }

        return result;
    }
}
