package com.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {3,0,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){

            for(int j=i+1; j>0; j--){
                if(arr[j-1] > arr[j]){
                    swap(j-1, j, arr);
                }else{
                    break;
                }

            }

        }

    }
    static void swap(int first, int last, int[] arr){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
