package com.sorting.leetcode;
// https://leetcode.com/problems/first-missing-positive/
public class FirstMissingPositive {
    public static void main(String[] args) {

    }

    static int firstMissingPositive(int[] nums) {

        int i=0;
        while(i < nums.length){
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]){
                swap(i, nums[i] -1, nums );
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[i] != j+1){
                return j+1;
            }
        }

        return nums.length + 1;
    }

    static void swap(int index1, int index2, int[] arr){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
