package com.tcs.arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(binarySearch(array, 3));

    }
    static int binarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        // while start is not greater than end
        while(start <= end){
            // better way to find the mid
            int mid = start + (end - start) / 2;

            // target is greater than mid
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
