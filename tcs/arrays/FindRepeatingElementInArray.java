package com.tcs.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class FindRepeatingElementInArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,4,4,5,2};
        findRepeating(arr);

    }
    static void findRepeating(int[] arr){

        HashMap<Integer,Integer> count = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

         for(int i=0; i<arr.length; i++){
             if(count.containsKey(arr[i])){
                 count.put(arr[i],count.get(arr[i])+1);
                 if(!result.contains(arr[i])){
                     result.add(arr[i]);
                 }
             }else{
                 count.put(arr[i],1);
             }

         }
        System.out.println(result);
    }
}
