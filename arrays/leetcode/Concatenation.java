package com.arrays.leetcode;
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.
//https://leetcode.com/problems/concatenation-of-array/
public class Concatenation {

    public int[] getConcatenation(int[] nums) {



        int[] ans = new int[nums.length*2];

        for(int i=0; i<nums.length*2; i++){

            if(i < nums.length ){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i-nums.length];
            }
        }

        return ans;

    }

}
