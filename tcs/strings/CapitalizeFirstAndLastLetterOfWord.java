package com.tcs.strings;

public class CapitalizeFirstAndLastLetterOfWord {
    public static void main(String[] args) {
        String str = "take u forward is awesome";
        System.out.println(capitalizeFirstAndLast(str));
    }

    static String capitalizeFirstAndLast(String str){
        String[] splitted = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<splitted.length; i++){
            String word = splitted[i];
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);

            char newFirst, newLast;

            if(first >= 97){
                newFirst = (char)(first-32);
                word = word.replace(first, newFirst);
            }
            if(last >= 97){
                newLast = (char)(last-32);
                word = word.replace(last, newLast);
            }

            result.append(" "+ word);


        }

        return result.toString();
    }
}
