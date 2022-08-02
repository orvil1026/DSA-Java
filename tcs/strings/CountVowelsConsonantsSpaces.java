package com.tcs.strings;

public class CountVowelsConsonantsSpaces {

    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        countVowelsConsonantsSpaces(str);
    }

    static void countVowelsConsonantsSpaces(String str){
        int vowels = 0, consonants = 0, spaces = 0;

        for(int i=0; i<str.length(); i++){

            char ch = str.charAt(i)!= ' ' && str.charAt(i) < 97 ?(char)(str.charAt(i)+32): str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels += 1;
            }else if(ch == ' '){
                spaces += 1;
            }else{
                consonants += 1;
            }
        }

        System.out.println("Vowels:"+vowels);
        System.out.println("Spaces:"+spaces);
        System.out.println("Consonants:"+consonants);
    }
}
