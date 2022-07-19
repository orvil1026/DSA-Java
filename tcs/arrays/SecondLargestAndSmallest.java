package com.tcs.arrays;

import java.util.Arrays;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {

        int[] arr = {5, 3, 2, 1, 4};
        System.out.println(Arrays.toString(largestAndSmallest(arr)));

        int[] maxAndMin = new int[2];
        maxAndMin = largestAndSmallest(arr);
        System.out.println(Arrays.toString(secondLargestAndSmallest(arr,maxAndMin[0], maxAndMin[1])));

    }

    static int[] largestAndSmallest(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return new int[]{max, min};
    }

    static int[] secondLargestAndSmallest(int[] arr, int max, int min){
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < secondMin && arr[i] > min ){
                secondMin = arr[i];
            }
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }

        return new int[]{secondMax, secondMin};
    }
}
