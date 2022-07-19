package com.company;

import java.util.Scanner;

public class Ocurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.println("Enter the number to count occurences:");
        int n = in.nextInt();

        int count = 0;
        int rem = 1;
        while(rem != 0 ){
            rem = num % 10;
            num = num / 10;
            if(rem == n){
                count ++;
            }
        }
        System.out.println("Count :"+ count);
    }
}
