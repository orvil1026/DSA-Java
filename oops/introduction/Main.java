package com.oops.introduction;

public class Main {

    public static void main(String[] args){

        Student orvil = new Student();
        orvil.display();

        Student ram = new Student(22, "Ram", 83.3f);
        ram.display();

        orvil.sameAsPrevious(ram);
        orvil.display();


    }


}

class Student{

    int rollno;
    String name;
    float marks;

    Student(){
//        this.rollno = 00;
//        this.name = "default";
//        this.marks = 35.0f;

        this (00, "default", 00.0f);

    }

    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("Hello "+ name);
    }

    void sameAsPrevious(Student previousstudent){
        this.rollno = previousstudent.rollno;
        this.name = previousstudent.name;
        this.marks = previousstudent.marks;
    }
}