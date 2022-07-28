package com.arrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }


    static int[] intersection(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<nums1.length; i++){
            if(linearSearch(nums2, nums1[i])){
                if(!result.contains(nums1[i])){
                    result.add(nums1[i]);
                }
            }
        }
        
        int[] fin_result = new int[result.size()];
        
        for(int i=0; i < fin_result.length ; i++){
            fin_result[i] = result.get(i);
        }
        
        return fin_result;
        
    }
    
    static boolean linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

}