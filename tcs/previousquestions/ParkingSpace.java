package com.tcs.previousquestions;
import java.util.*;


public class ParkingSpace {

	public static void main(String[] args){

		int row = 0;
		int col = 0;

		Scanner sc = new Scanner(System.in);

		row = sc.nextInt();
		col = sc.nextInt();

		int[][] mat = new int[row][col];

		int max = 0;
		int maxrow = 0;

		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				mat[i][j] = sc.nextInt();
			}
		}


		for(int i=0; i<row; i++){
			int sum = 0;
			for(int j=0; j<col; j++){
				sum = sum + mat[i][j];
			}

			if(sum > max){
				maxrow = i+1;
				max = sum;
			}
		}

		System.out.println(maxrow);





	}
}
