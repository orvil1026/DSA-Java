package com.oops.staticexample;

public class Main {

    public static void main(String[] args){
        Human orvil = new Human(10, "orvil");
        Human ram = new Human(12, "ram");


        System.out.println(Human.population);
    }

    static void fun(){
        // non-static methods cannot be called in static methods
        //greeting();

        // non-static methods can only be called by creating an object in static methods
        Main obj = new Main();
        obj.greeting();

        System.out.println("HEEELLLOOO");
    }

    void greeting(){

        // non-static methods can be called in non-static methods
        fun2();
        System.out.println("hello how are you!");
    }

    void fun2(){

        System.out.println("FUNNNN");
    }
}
