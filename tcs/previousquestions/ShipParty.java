package com.tcs.previousquestions;

import java.util.*;

public class ShipParty {

	public static void main(String[] main){
		int n;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int[] e = new int[n];
		int[] l = new int[n];


		for(int i=0; i<n; i++){
			e[i] = sc.nextInt();
		}

		for(int i=0; i<n; i++){
			l[i] = sc.nextInt();
		}

		int max = 0;
		int sum = 0;

		for(int i=0; i<n; i++){
			sum = sum + e[i] - l[i];

			if(sum > max){
				max = sum;
			}
		}


		System.out.println(max);


	}

}
