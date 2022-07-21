package com.tcs.arrays;

import java.util.Arrays;
// https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int i=0;
        while(i < arr.length){
            if(arr[i] != arr[arr[i]-1]){
                swap(arr, i, arr[i-1]);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int ind1, int ind2){
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
