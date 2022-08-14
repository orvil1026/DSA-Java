package com.tcs.Numbers;

public class LeapYear {


	public static void main(String[] args){

		System.out.println(isLeapYear(2000));

	}

	static boolean isLeapYear(int year){

		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ;
	}


    
}
