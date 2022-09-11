package com.oops.interfaces;

public class NewCar {
    Engine engine;
    Media media = new CDPlayer();

    NewCar(){
        this.engine = new PowerEngine();
    }

    NewCar(Engine engine){
        this.engine = engine;
    }

    void start(){
        engine.start();
    }

    void stop(){
        engine.stop();
    }

    void startMedia(){
        media.start();
    }

    void upgradeEngine(){
        this.engine = new ElectricEngine();
    }


}
