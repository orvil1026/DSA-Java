package com.oops.generics;

import java.util.ArrayList;

public class LambdaFunctions {


    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            (i) -> System.out.println(i);
//        }

//        String[] words = {"hello", "how", "are"};
//
//        for (String s:
//             words) {
//            (s) -> System.out.println(s);
//        }


        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(12);
        arr.add(40);
        arr.add(30);

        arr.forEach((item) -> System.out.println(item));


        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;

        LambdaFunctions myCalc = new LambdaFunctions();
        System.out.println(myCalc.operate(10,10,sum));


        }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);
}