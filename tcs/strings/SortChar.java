package com.tcs.strings;

import java.util.Arrays;

public class SortChar {

    public static void main(String[] args) {
        sortChar("zxcbg");
    }

    static String sortChar(String str){

        String[] result = str.split("");
        System.out.println(Arrays.toString(result));

        for(int i=0; i<result.length; i++){
            for(int j=1; j<result.length-i; j++){
                if(result[j].charAt(0) < result[j-1].charAt(0)){
                    String temp = result[j];
                    result[j] = result[j-1];
                    result[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return String.join("",result);

    }
}
