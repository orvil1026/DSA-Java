package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){

        for(int i=0; i<arr.length; i++){
            int last = arr.length - i - 1;
            int maxIndex = findMax(0, last, arr);
            swap(maxIndex, last, arr);
        }
    }

    static void swap(int maxIndex, int last, int[] arr){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    static int findMax(int start, int last, int[] arr) {

        int max = arr[start];
        int maxIndex = 0;
        for(int i=1; i<=last; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
