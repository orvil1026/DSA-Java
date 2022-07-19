package com.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 23, 49, 39, 93, 22};
        int target = 49;

        int result =  linearSearch(arr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target){

        // if arr length is 0
        if(arr.length == 0){
            return -1;
        }

        // searching the element index
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }

        // if element not found
        return -1;
    }




}
