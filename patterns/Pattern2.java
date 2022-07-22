package com.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        pattern5(11);
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
}
