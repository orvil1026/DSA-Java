package com.binarySearch;

public class FindInMountainArray {
    public static void main(String[] args) {

    }

    static int search(int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if ( firstTry != -1 ){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
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

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAscending = arr[end] > arr[start];


        // while start is not greater than end
        while(start <= end){
            // better way to find the mid
            int mid = start + (end - start) / 2;

            // target is greater than mid
            if(arr[mid] == target){

                return mid;

            }

            if(isAscending){
                if(target > arr[mid]){

                    start = mid + 1;

                } else{

                    end = mid - 1;

                }
            }else{

                if(target < arr[mid]){

                    start = mid + 1;

                } else{

                    end = mid - 1;

                }

            }





        }

        return -1;
    }
}
