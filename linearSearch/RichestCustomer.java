package com.linearSearch;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3,},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int row=0; row<accounts.length; row++){
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++){
                sum = sum + accounts[row][col];
            }

            if(sum > max){
                max = sum;
            }
        }

        return max;


    }
}
