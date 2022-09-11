package com.oops.interfaces.extendsDemo2;

public interface B  {
    void bye();

    default void hi(){
        System.out.println("Hi from B");
    }
}
