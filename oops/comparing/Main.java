package com.oops.comparing;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student rahul = new Student(70, 1);
        Student kunal = new Student(99, 2);
        Student mahi = new Student(79, 3);
        Student rohit = new Student(97, 4);

        Student[] list = {rahul, kunal, mahi, rohit};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));



    }
}
