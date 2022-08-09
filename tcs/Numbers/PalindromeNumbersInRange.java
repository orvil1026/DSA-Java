package com.tcs.Numbers;

import java.util.Scanner;

public class PalindromeNumbersInRange {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter min:");
        int min = sc.nextInt();
        System.out.println("Enter max:");
        int max = sc.nextInt();

        for(int i=min; i<=max; i++){
            boolean isPalindrome = isPalindrome(i);
            if(isPalindrome){
                System.out.println(i);
            }
        }
        
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
