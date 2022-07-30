package com.tcs.strings;

public class NextLexicographical {

    public static void main(String[] args) {
        String str = "Java";
        System.out.println(nextLexicographical(str));
    }


    static String nextLexicographical(String str){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'z' || str.charAt(i) == 'Z'){
                result.append('a');
            }else{
                char ch = (char)((str.charAt(i) + 1));
                result.append(ch);
            }



        }


        return result.toString();
    }
}
