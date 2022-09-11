package com.oops.interfaces.extendsDemo2;

public interface A {
    void hello();

    default void hi(){
        System.out.println("hi from A");
    }

    static void awesome(){
        System.out.println("i am awesome");
    }
}
