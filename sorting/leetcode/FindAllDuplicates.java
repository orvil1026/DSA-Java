package com.sorting.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findDuplicate(arr));
    }

    static List<Integer> findDuplicate(int[] arr) {

        int i=0;

        while(i < arr.length){

            if( arr[i] != arr[arr[i] - 1]  ){
                swap(i, arr[i] - 1, arr );

            }else{
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                result.add(arr[j]);

            }
        }

        return result;

    }

    static void swap(int index1, int index2, int[] arr){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
