package com.oops.inheritance;

public class Box {
    double l;
    double w;
    double h;
    double weight = 10;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

     Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w) {
        this.l = l;
        this.w = w;
        this.h = -1;
    }




}
