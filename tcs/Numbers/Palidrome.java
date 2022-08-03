package com.tcs.Numbers;

public class Palidrome {

    public static void main(String[] args) {
        int n = 12212;
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n){
        int temp = n;
        int sum = 0;
        int i = 1;
        int rem;
        int count = 0;

        while(n!=0){
            rem = n % 10;
            n = n / 10;
            sum = i * sum  +  rem;
            i =count <1 ? i * 10: 10;
            count ++;


        }

        return sum == temp;
    }
}
