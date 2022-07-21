package com.tcs.arrays;

import java.util.Arrays;
// https://takeuforward.org/data-structure/find-median-of-the-given-array/
public class MedianOfArray {
    public static void main(String[] args) {

        int[] arr = {2,5,1,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        if(arr.length % 2 != 0){
            System.out.println(arr[(arr.length/2)]);
        }else{
//            float avg = (arr[arr.length/2] + arr[(arr.length/2) - 1])/2;
            int ind1 = (arr.length/2) - 1;
            int ind2 = (arr.length/2);
            System.out.println((double) (arr[ind1]+arr[ind2])/2);
        }


    }

    static void insertionSort(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
