package com.Cloneable;

public class Human implements Cloneable {

    int age;
    String name;

    public Human(Human obj){
        this.age = obj.age;
        this.name = obj.name;
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
