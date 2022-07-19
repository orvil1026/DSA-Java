package com.arrays.leetcode;
// Given an array of integers nums, return the number of good pairs.
//
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.

// https://leetcode.com/problems/number-of-good-pairs/

public class GoodPair {
    public int numIdenticalPairs(int[] nums) {

        int ans = 0;

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            for(int j=i; j<nums.length; j++){
                if (num == nums[j] && i < j){
                    ans ++;
                }
            }
        }
        return ans;
    }
}
