package com.linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "orvil";
        char target = 'l';

        System.out.println(searchInStrings2(name,target));


    }

    static boolean searchInStrings(String text, char target){

        // if length is 0
        if(text.length() == 0){
            return false;
        }

        // searching for string
        for(int index=0; index < text.length(); index++){
            if(text.charAt(index) == target){
                return true;
            }
        }

        // if no match found
        return false;

    }
    // same as searchInString but using for each loop
    static boolean searchInStrings2(String text, char target){

        // if length is 0
        if(text.length() == 0){
            return false;
        }

        // searching for string using for each loop
        for(char ch: text.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        // if no match found
        return false;

    }
}
