package com.tcs.Numbers;
import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
//        boolean divisible = false;
        if(n==1){
            return false;
        }
        for(int i=2; i< Math.sqrt(n) ; i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
