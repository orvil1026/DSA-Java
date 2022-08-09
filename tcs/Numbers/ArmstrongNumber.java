package com.tcs.Numbers;

public class ArmstrongNumber {
    public static void main(String[] args){
        System.out.println(isArmstrong(170));
    }

    static boolean isArmstrong(int n){
        int temp = n;
        int result = 0;

        while(n!=0){
            int number = n%10;
            result = result + (number * number * number);
            n = n / 10;
        }

        return result == temp;

    }
}
