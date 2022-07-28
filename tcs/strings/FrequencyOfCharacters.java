package com.tcs.strings;

import java.util.HashMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "google";
        HashMap<String,Integer> result = countFrequency(str);
        nonRepeating(str);
    }

    static HashMap<String,Integer> countFrequency(String str){
        HashMap<String,Integer> result = new HashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(result.containsKey(String.valueOf(ch))){
                result.replace(String.valueOf(ch),result.get(String.valueOf(ch))+1);
            }else{
                result.put(String.valueOf(ch),1);
            }
        }

        System.out.println(result.toString());

        return result;
    }

    static void nonRepeating(String str){
        HashMap<String,Integer> count = countFrequency(str);

        for(HashMap.Entry<String,Integer> entry: count.entrySet()){
            if(entry.getValue() <= 1){
                System.out.println(entry.getKey());
            }
        }
    }
}
