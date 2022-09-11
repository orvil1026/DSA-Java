package com.oops.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Shape circle1 = new Circle();

        shape.area();
        circle.area();
        circle1.area();

        System.out.println(shape);
    }
}
