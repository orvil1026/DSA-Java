package com.arrays.leetcode;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int [] arr = {-1,-100,3,99};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {

//         for(int i=0; i<k; i++){
//            int element = nums[nums.length-1];

//            for(int j=nums.length-1; j>0; j--){
//             nums[j] = nums[j-1];

//             }
//             nums[0] = element;

        int[] temp = new int[k];
        int counter = 0;

        for(int i=nums.length-k; i<nums.length; i++){
            temp[counter] = nums[i];
            counter ++;
        }

        for(int j=nums.length-k-1; j>=0;j--){
            nums[j+k] = nums[j];

        }
        for(int l=0; l<k; l++){
            nums[l] = temp[l];
        }





    }

}
