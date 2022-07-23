package com.tcs.arrays;

import java.util.ArrayList;

public class RemoveDuplicatesFromUnSortedArray {

    public static void main(String[] args) {
        int[] arr={2,3,1,9,3,1,3,9};
        removeDuplicates(arr);
    }

    static void  removeDuplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
