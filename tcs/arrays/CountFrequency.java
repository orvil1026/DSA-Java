package com.tcs.arrays;
// https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/
import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int[] arr = {10,5,10,15,10,5};

        for (int i = 0; i < arr.length; i++) {
            if(count.containsKey(arr[i])){
                int c = count.get(arr[i]);
                count.replace(arr[i], c+1);
            }else{
                count.put(arr[i],1);
            }

        }

        System.out.println(count);

    }
}
