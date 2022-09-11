package com.tcs.previousquestions;

import java.util.*;

public class OddBallons {

	public static void main(String[] args){

		int n;
        

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		HashMap<String,Integer> count = new HashMap<>();

		String[] ballons = new String[n];
		ArrayList<String> unique = new ArrayList<>();

		for(int i=0; i<n; i++){
			ballons[i] = sc.next();
		}

		for(int i=0; i<n; i++){

			String ballon = ballons[i];

			if(count.containsKey(ballon)){
				count.put(ballon, count.get(ballon) + 1);
			}else{
				count.put(ballon, 1);
				unique.add(ballon);
			}
		}



		for(int i=0; i<unique.size(); i++){

			String key = unique.get(i);
			int value = count.get(key);

			if(value % 2 != 0){
                System.out.println(key);
                break;
			}
		}








	}


}
