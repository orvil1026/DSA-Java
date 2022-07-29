package com.tcs.strings;

public class ChangeCase {
    public static void main(String[] args) {
        String s = "take u forward IS Awesome";
        System.out.println(changeCase(s));
    }

    static String changeCase(String str){
        String result = "";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                result += " ";
            }
            else if(ch >= 97){
                result += (char)(ch - 32);
            }else{
                result += (char)(ch + 32);
            }
        }
        
        
        return result;
    }
}
