package com.binarySearch;

public class RBS {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(search(arr, 3));

    }

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        if( pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if( arr[pivot] == target){
            return pivot;
        }

        if ( target >= arr[0]){
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);

    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1] ){
                return mid-1;
            }
            if( arr[start] >= arr[mid] ){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1] ){
                return mid-1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if( arr[mid] == arr[start] && arr[mid] == arr[end] ){

                // Skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start ++;

                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end --;


            }else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])){

                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        return -1;
    }

    static int binarySearch(int [] arr, int target, int start, int end){



        // while start is not greater than end
        while(start <= end){
            // better way to find the mid
            int mid = start + (end - start) / 2;

            // target is greater than mid
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
