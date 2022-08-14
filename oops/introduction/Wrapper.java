package com.oops.introduction;

public class Wrapper {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + "    " + b);

        A obj = new A();

        for (int i = 0; i < 1000000000; i++) {
            obj = new A();
        }

    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A {
    final int a = 10;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Destroyed");
    }
}