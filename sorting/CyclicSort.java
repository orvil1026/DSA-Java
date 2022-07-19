package com.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i]-1]){

                swap(i, arr[i]-1, arr );
            }else{
                i++;
            }
        }
    }

    static void swap(int index1, int index2, int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
