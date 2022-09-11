package com.oops.staticexample;

public class StaticBlock {

    static int a = 4;
    static int b;

    static {
        b = a * 4;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();

        System.out.println(StaticBlock.a + "  " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock sb1 = new StaticBlock();

        System.out.println(StaticBlock.a+ "  "+ StaticBlock.b);
    }

}
