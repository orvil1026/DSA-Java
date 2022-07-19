package com.company;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a+" "+b);
        while(b<num){
            int temp = b;
            b=a+b;
            a=temp;

            System.out.println(" "+b+" ");

        }
    }
}
