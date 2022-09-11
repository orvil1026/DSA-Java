package com.oops.interfaces;

public class Main {

    public static void main(String[] args) {
//        Car audi = new Car();
//
//        audi.start();
//        audi.stop();
//        audi.break1();
//        Engine car = new Car();
//        car.start();
//        Media media = new Car();
//        media.start();

        NewCar bmw = new NewCar();
        bmw.start();
        bmw.startMedia();

        bmw.upgradeEngine();
        bmw.start();
    }
}
