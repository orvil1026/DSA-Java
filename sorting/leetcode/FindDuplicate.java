package com.sorting.leetcode;
// https://leetcode.com/problems/find-the-duplicate-number/submissions/
import java.util.Arrays;

class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        ;
        System.out.println(findDuplicate(arr));

    }

    static int findDuplicate(int[] arr) {

        int i=0;

        while(i < arr.length){

            if( arr[i] != arr[arr[i] - 1]  ){
                swap(i, arr[i] - 1, arr );

            }else{
                i++;
            }
        }

        return arr[arr.length-1];

    }

    static void swap(int index1, int index2, int[] arr){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}