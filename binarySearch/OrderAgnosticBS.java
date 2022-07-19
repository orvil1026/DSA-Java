package com.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-1, 0, 1, 2, 34, 40, 50, 90};
        int[] arr = {90, 80, 40, 20, 10, 4, 2, 0};
        int target = 40;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
