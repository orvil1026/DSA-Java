package com.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 34, 40, 50, 90};
        int target = 40;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index of the target
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
