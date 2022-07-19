package com.arrays.leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] arr = {5,6,2,0,0,4,6,2,4,9};

        System.out.println(Arrays.toString(plusOne(arr)));

    }

    static int[] plusOne(int[] digits) {

            int result = digits[digits.length - 1] + 1;

            int count = (int)(Math.log10(result)) + 1;

            // System.out.println(count);
            if (count > 1){
                long number = 0;
                long multiple = 1;

                for(int i=digits.length-1; i>=0; i--){

                    if(digits[i] != 0){
                        number = number + digits[i] * multiple;
                    }

                    multiple = multiple * 10;
                }
                System.out.println(number);
                number = number + 1;
                System.out.println(number);

                String resultString = Long.toString(number);

                int[] resultArray = new int[resultString.length()];

                for(int i=0; i<resultArray.length; i++){
                    resultArray[i] = Character.getNumericValue(resultString.charAt(i));
                }

                return resultArray;


            }else{
                digits[digits.length - 1] = result;
                return digits;
            }




        }
    }

