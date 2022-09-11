package com.oops.singleton;

public class Singleton {

    private Singleton(){

    }

    static Singleton instance;

    static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
