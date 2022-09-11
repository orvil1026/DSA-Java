package com.tcs.previousquestions;

import java.util.*;

public class Automobile {


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int v = sc.nextInt();
		int w = sc.nextInt();


		int res = (4*v - w)/2;

		if(2<=w && w%2==0 && v<w){
			System.out.println("TW ="+ res +" FW ="+ (v-res));
		}else{
			System.out.println("INVALID INPUT");
		}


	}
}
