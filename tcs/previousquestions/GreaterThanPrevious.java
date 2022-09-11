package com.tcs.previousquestions;
import java.util.*;


public class GreaterThanPrevious {

	public static void main(String[] args){

		int n;
		int count = 1;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		int[] nums = new int[n];

		for(int i=0; i<n; i++){
			nums[i] = sc.nextInt();
		}

		for(int i=1; i<n; i++){
			if(nums[i] > nums[i-1]){
				count += 1;
			}
		}


		System.out.println(count);


	}

}
