package com.tcs.arrays;

import java.util.Arrays;

public class AddingElementInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] res1 = insertbeginning(arr,6);
        System.out.println(Arrays.toString(res1));
        int[] res2 = insertending(res1,7);
        System.out.println(Arrays.toString(res2));
        int[] res3 = insertAtPos(res2,8, 4);
        System.out.println(Arrays.toString(res3));

    }
    static int[] insertbeginning(int[] arr, int element){
        int[] result = new int[arr.length+1];
        result[0] = element;

        for(int i=0; i<arr.length; i++){
            result[i+1] = arr[i];
        }

        return result;
    }

    static int[] insertending(int[] arr, int element){
        int[] result = new int[arr.length+1];
        result[result.length-1] = element;

        for(int i=0; i<arr.length; i++){
            result[i] = arr[i];
        }

        return result;
    }

    static int[] insertAtPos(int[] arr, int element, int pos){
        int[] result = new int[arr.length+1];


        for(int i=0; i<pos; i++){
            result[i] = arr[i];
        }
        for(int i=pos;i< result.length-1;i++){
            result[i+1] = arr[i];

        }
        result[pos] = element;

        return result;
    }
}
