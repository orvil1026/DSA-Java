package com.oops.interfaces;

public class CDPlayer implements Media{

    @Override
    public void stop() {
        System.out.println("CD Player stops");
    }

    @Override
    public void start() {
        System.out.println("CD Player starts");
    }
}
