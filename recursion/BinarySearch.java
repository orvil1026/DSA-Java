package com.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10, 56};
        System.out.println(binarySearch(arr, 8, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int s, int e){

        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }else if( target > arr[mid]){
            return binarySearch(arr, target, mid+1, e);
        }else{
            return binarySearch(arr, target, s, mid-1);
        }
    }
}


