package com.oops.interfaces;

public class Car implements Brake,Engine, Media{



    public void break1(){
        System.out.println("THis is the car break");
    }

    public void start(){
        System.out.println("Car starts!");
    }

    public void stop(){
        System.out.println("Car stops!");
    }
}
