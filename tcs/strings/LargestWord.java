package com.tcs.strings;

public class LargestWord {
    public static void main(String[] args) {
        String str = "Microsoft Teams";
        System.out.println(largestWord(str));
    }

    static String largestWord(String str){
        String[] result = str.split(" ");
        int largest = 0;
        int largestIndex = 0;

        for(int i=0; i<result.length; i++){
            if(result[i].length() > largest){
                largest = result[i].length();
                largestIndex = i;
            }
        }

        return result[largestIndex];
    }
}
