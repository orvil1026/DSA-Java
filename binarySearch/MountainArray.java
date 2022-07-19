package com.binarySearch;

public class MountainArray {
    public static void main(String[] args) {

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        int mid;

        while( start < end ){
            mid = start + (end - start) / 2;

            if( arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }

        }

        return start;

    }
}
