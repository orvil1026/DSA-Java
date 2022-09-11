package com.oops.inheritance;

public class Main {

    public static void main(String[] args) {
        Box b = new Box();
        System.out.println(b.h+"   "+b.w+"  "+b.l);

        BoxWeight b2 = new BoxWeight(23);
        System.out.println(b2.h+"   "+b2.w+"  "+b2.l + "   "+ b2.weight);
//
//        Box b3 = new BoxWeight(1, 2, 3, 30);
//        System.out.println(b3.h+"   "+b3.w+"  "+b3.l + "   ");

        BoxPrice b3 = new BoxPrice(10, 20, 500);
        System.out.println(b3.h+"   "+b3.w+"  "+b3.l + "   "+ b3.weight +" "+ b3.price);

    }
}
