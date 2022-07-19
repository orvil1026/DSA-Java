package com.linearSearch;

public class MinNum {
    public static void main(String[] args) {
        int[] arr = {1, 34, 44, 90, 32, 333};
        System.out.println(minNum(arr));
    }
    static int minNum(int[] arr){

        // if arr length is 0
        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];

        // searching the element index
        for(int index = 0; index < arr.length; index++){
            if(arr[index] < min){
                min = arr[index];
            }
        }
        return min;


    }
}
