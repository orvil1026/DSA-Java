package com.tcs.arrays;
// https://takeuforward.org/data-structure/rearrange-array-in-increasing-decreasing-order/
import java.util.Arrays;

public class RearrangingInAscAndDesc {

    public static void main(String[] args) {
        int[] arr = {8, 7, 1, 6, 5, 9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        reverseArray(arr, arr.length/2, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i=0; i<= arr.length - 2; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
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
