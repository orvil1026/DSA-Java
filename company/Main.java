package com.company;

import java.util.*;

public class Main{
	

	public static void main(String[] args){

		StringBuilder sb = new StringBuilder();

		sb.append("OrvilDsilva");

		System.out.println(sb);


		System.out.println(sb.charAt(4));

		System.out.println(sb.indexOf("D"));


		System.out.println("Size"+ sb.length());

		System.out.println(sb.insert(5," "));

		System.out.println(sb.replace(6,7, "d"));


		System.out.println(sb.delete(6,sb.length()));	


	}





}