package com.linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 34, 44, 90, 32, 333};
        int target = 90;
        int start = 2;
        int end = 4;

        System.out.println(searchInRange(arr, target, start, end));

    }

    static int searchInRange(int[] arr, int target, int start, int end){
        // if length is 0
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i<end; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
