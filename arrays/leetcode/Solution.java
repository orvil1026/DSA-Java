package com.arrays.leetcode;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] numbers = {-1,0};
        int[] nums = {-3,3,4,90};
        System.out.println(Arrays.toString(twoSum(numbers,-1)));
        System.out.println(binarySearch(numbers,-1));
    }
    static int[] twoSum(int[] numbers, int target) {

        int result[] = new int[2] ;
        int end = binarySearch(numbers, target);
        System.out.print(end);

        for (int i = 0; i<= end ; i ++){
            for(int j = i+1; j <= end; j++){
                if(numbers[i] + numbers[j] == target && i!=j){

                    result[0] = i + 1;
                    result[1] = j + 1;

                    return result;
                }

            }
        }

        return result;



    }

    static int binarySearch(int[] numbers, int target){
        int start = 0;
        int end = numbers.length - 1 ;



        while(start<=end){
            int mid = start + (end - start)/2;

            if(target < numbers[mid]){
                end = mid - 1;
            }else if(target > numbers[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return end;
    }
}