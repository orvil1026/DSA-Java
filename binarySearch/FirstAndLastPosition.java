package com.binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {

        int [] nums = {5,7,7,8,8,10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    static int[] searchRange(int[] nums, int target) {

        int[] result = {-1, -1};
        result[0] = search(target, nums, true);
        if( result[0] != -1) {
            result[1] = search(target, nums, false);
        }

        return result;
    }

    static int search(int target, int[] arr, boolean searchForFirstOccurence){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1 ;


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
                ans = mid;
                if(searchForFirstOccurence){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}





