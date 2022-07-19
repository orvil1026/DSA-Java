package com.linearSearch;

//  Given an array nums of integers, return how many of them contain an even number of digits.
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenNumbers {
    public static void main(String[] args) {

        int[] arr = {437,315,322,431,686,264,442};
        System.out.println(countEvenNumbersOfDigits(arr));

    }

    static int countEvenNumbersOfDigits(int[] arr){
        int count = 0;
        int digitCount = 0;

        for(int num:arr){
            digitCount = 0;
//            while(num > 0){
//                num = num / 10;
//                digitCount ++;
//            }
            int numOfDigits = (int)(Math.log10(num)) + 1;

            if (numOfDigits % 2 == 0){
                count ++;
            }


//            if(digitCount % 2 == 0){
//                count ++;
//            }
        }
        return count;
    }
}
