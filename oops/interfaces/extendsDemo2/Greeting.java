package com.oops.interfaces.extendsDemo2;

public class Greeting implements A,B {

    @Override
    public void bye() {
        System.out.println("BYEE!");
    }

    @Override
    public void hello() {
        System.out.println("HELLOOO!");
    }

    @Override
    public void hi() {
        A.super.hi();
    }

    public void awesome(){
        A.awesome();
    }


}
