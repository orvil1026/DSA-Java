package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,3);
    }

    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }
}
