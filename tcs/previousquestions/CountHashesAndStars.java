package com.tcs.previousquestions;

import java.util.*;

public class CountHashesAndStars {

	public static void main(String[] args){
		int stars = 0;
		int hash = 0;

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		for(int i=0; i<input.length(); i++){
			char ch = input.charAt(i);
			if(ch == '#'){
				hash += 1;
			}else if(ch == '*'){
				stars += 1;
			}
		}

		System.out.println(stars-hash);

	}


}
