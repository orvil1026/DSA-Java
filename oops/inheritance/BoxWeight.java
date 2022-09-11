package com.oops.inheritance;

public class BoxWeight extends Box {

    double weight;

    BoxWeight(){
        super();
        this.weight = -1;
    }

    BoxWeight(double weight){
        super();
        this.weight = weight;
        System.out.println("Super" + super.weight);
        System.out.println("This" + this.weight);

    }

    BoxWeight(double l, double w, double h, double weight){
        super(l, w, h);
        this.weight = weight;
    }

    BoxWeight(double l, double w, double weight){
        super(l, w);
        this.weight = weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
