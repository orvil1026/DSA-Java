package com.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
        max(arr);
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void max(int[] arr){
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max Number is:"+max);
    }

}
