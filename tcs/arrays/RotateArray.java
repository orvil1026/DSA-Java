package com.tcs.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateArray(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArray(int[] arr, int noOfTimes){
        reverseArray(arr, 0, arr.length-1);
        reverseArray(arr, 0, noOfTimes-1);
        reverseArray(arr, noOfTimes, arr.length-1);
    }

    static void reverseArray(int[] arr, int start, int end){
        while(start<=end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
