package com.sorting.leetcode;

import java.util.ArrayList;
import java.util.List;

class AllNumbersDisappeared {

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        int i=0;

        while(i < arr.length){

            if( arr[i] != arr[arr[i] - 1]  ){
                swap(i, arr[i] - 1, arr );

            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {

            if(j != arr[j] - 1){
                result.add(j+1);
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