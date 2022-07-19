package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        System.out.println(isPrime(num));

    }

     static boolean isPrime(int num) {

        int c = 2;
        if (num <= 1){
            return false;
        }

        while ( c*c <= num){
            if ( num % c == 0){
                System.out.println("Number is not a prime");
                return false;
            }
            c ++;
        }
         System.out.println("Number is a prime Number");
        return true;
    }
}
