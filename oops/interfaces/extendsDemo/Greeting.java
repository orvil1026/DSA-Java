package com.oops.interfaces.extendsDemo;

public class Greeting implements B{

    @Override
    public void bye() {
        System.out.println("BYEE!");
    }

    @Override
    public void hello() {
        System.out.println("HELLOOO!");
    }
}
