package com.tcs.arrays;

import java.util.Arrays;
// Given an array, we have to find the smallest element in the array.
public class SmallestNo {
    public static void main(String[] args) {
        int[] arr = {8,10,5,7,9};

        // method 1
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

        // method 2
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
