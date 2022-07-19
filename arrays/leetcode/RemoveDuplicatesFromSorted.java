package com.arrays.leetcode;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {

        int counter = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[counter] != nums[i]) {
                counter++;
                nums[counter] = nums[i];
            }
        }


        return counter + 1;

    }
}