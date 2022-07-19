package com.company;

public class Reverse {



    public static void main(String[] args) {

        int num = 123456;
        int result = 0;
//        int unit = 0;
        int rem ;

        while(num>0){
            rem =  num % 10;
            result = result * 10 + rem;
            num = num / 10;
//            unit = unit * 10;

        }

        System.out.println(result);

    }




}
