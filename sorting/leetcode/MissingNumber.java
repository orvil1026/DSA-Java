package com.sorting.leetcode;
// https://leetcode.com/problems/missing-number/
public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));

    }

    static int missingNumber(int[] arr) {

        int i=0;
        while(i < arr.length){
            if( arr[i] < arr.length && arr[i] != arr[arr[i]]  ){
                swap(i, arr[i], arr );

            }else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {

            if(j != arr[j]){
                return j;
            }

        }

        return arr.length;

    }
    static void swap(int index1, int index2, int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
