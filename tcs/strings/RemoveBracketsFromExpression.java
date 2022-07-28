package com.tcs.strings;

public class RemoveBracketsFromExpression {

    public static void main(String[] args) {
        String str = "(((a-b))+c)";

        System.out.println(removeBrackets(str));
    }

    static String removeBrackets(String str){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == ')'){
            }else{
                result.append(ch);
            }
        }

        return result.toString();
    }
}
