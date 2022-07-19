package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println(isArmstrong(num));
    }

     static boolean isArmstrong(int num) {

        int temp,rem,result=0;
        temp = num;

        while(num>0){

            rem = num % 10 ;
            result = (int) (result + Math.pow(rem,3));
            num = num / 10;

        }

        return temp == result;
    }


}
