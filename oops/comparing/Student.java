package com.oops.comparing;

public class Student implements Comparable<Student>{

    int marks;
    int rollNo;

    Student(int marks, int rollNo){
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int diff = this.marks - o.marks;
        return diff;
    }
}
