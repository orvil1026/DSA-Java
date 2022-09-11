package com.oops.inheritance;

public class BoxPrice extends BoxWeight{

    int price;

    BoxPrice(){
        super();
        this.price = -1;
    }

    BoxPrice(double side, double weight, int price){
        super(side, weight);
        this.price = price;
    }
}
