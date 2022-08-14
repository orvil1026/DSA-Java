package com.tcs.Numbers;

public class SumOfAP {

	public static void main(String[] args){
		int a = - 2;
		int n = 8;
		int d = 5;

		int sum = 0;
		int temp = a;

		for(int i=1; i<=n; i++){
			sum = sum + temp;
			temp = temp + d;
		}

		System.out.println(sum);
	}
    
}
