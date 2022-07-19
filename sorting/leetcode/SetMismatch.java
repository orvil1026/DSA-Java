package com.sorting.leetcode;

// https://leetcode.com/problems/set-mismatch/submissions/

import java.util.Arrays;

class SetMismatch {

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] arr) {

        int i=0;
        while(i < arr.length){

            if( arr[i] != arr[arr[i] - 1]  ){
                swap(i, arr[i] - 1, arr );

            }else{
                i++;
            }
        }



        for(int j=0; j<arr.length; j++){
            
            if(arr[j] -1 != j){
                return new int[]{arr[j],j+1};
            }
            
        }
        return new int[]{-1,-1};
        
    }
    static void swap(int index1, int index2, int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}