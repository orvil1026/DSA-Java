package com.oops.access;

public class A {

    int num;
    String name;

    protected A(int num, String name){
        this.num = num;
        this.name = name;
    }

    int getNum(){
        return num;
    }
}
