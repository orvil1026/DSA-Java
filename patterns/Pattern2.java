package com.patterns;

import java.sql.SQLOutput;

public class Pattern2 {
    public static void main(String[] args) {
        pattern17(5);
    }


//        *
//        **
//        ***
//        ****
//        *****
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//        *****
//        ****
//        ***
//        **
//        *
    static void pattern3(int n){
        for(int row=0; row<=n; row++){
            for(int col=0; col< n-row; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
    static void pattern4(int n){
        for(int row=0; row<=n; row++){
            for(int col=1; col<= row+1 ; col++ ){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row=1; row<=(n/2)+1; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=(n/2)+2; row<=n; row++){
            for(int col=0; col< n-row+1; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5ApproachSecond(int n){
        for(int row=1; row<=n * 2; row++){
            int noOfStarsInCol = row > n ? 2*n-(row) : row;
            for(int col=0; col< noOfStarsInCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for(int row=1; row< n*2; row++){
            int noOfStarsInCol = row > n ? (2*n)-row : row;
            for(int spaces=1; spaces <= Math.abs(n-row); spaces++){
                System.out.print(" ");
            }
            for(int col=1; col<=noOfStarsInCol; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){

        for(int row=1; row<=n; row++){
            for(int spaces=1; spaces<= 2*((n-row+1)-1); spaces++){
                System.out.print(" ");
            }
            for(int col=row; col>0; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    static void pattern17(int n){

        for(int row=1; row<n*2; row++){
            int rowCorrection = row > n ? (2*n)-row : row;
            for(int spaces=1; spaces<= 2*((n-rowCorrection+1)-1); spaces++){
                System.out.print(" ");
            }
            for(int col=rowCorrection; col>0; col--){
                System.out.print(col+" ");
            }
            for(int col=2; col<=rowCorrection; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
