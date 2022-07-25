package com.tcs.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class NonRepeatingElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,1,3,1};
        findNonRepeating(arr);
    }

    static void findNonRepeating(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 0;
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count <= 0){
                System.out.print(arr[i]+ " ");
            }
        }
    }
}