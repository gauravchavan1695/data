package com.PracticeProgram;

public class CountOfCapitalizedLettersFromString {

	public static void main(String[] args) {

	String str = "GauravVishnudasChavanJbcAnDZz";
	//output = 3(count of capital letters)
	
	//Approach1 --> normal for loop -------------------------------------------------------------------------------------------
	
	int count =0;
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)>= 'A' && str.charAt(i)<='Z') {
		count++	;
		}		
	}
	System.out.println(count);
	
	
	
	//Approach 2 --> using Asci Characters -------------------------------------------------------------------------------------
	int count2 =0;
	
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)>= 65 && str.charAt(i)<=90) {
		count2++	;
		}		
	}
	System.out.println(count2);

	
	
	//Approach 3 --> using Character methods ----------------------------------------------------------------------------------
	
	int count3 =0;
	for (int i=0; i<str.length(); i++) {
		if(Character.isUpperCase(str.charAt(i))) {
		count3++;	
		
		}
	}
	System.out.println(count3);

	
	
	//Approach 4 --> using Streams -----------------------------------------------------------------------------------------------
	
	long count4 = str.chars().filter(e -> Character.isUpperCase(e)).count();
	System.out.println(count4);
	
	
	
	//Approach 5 --> using Streams -----------------------------------------------------------------------------------------------
	
		long count5 = str.chars().filter(f -> f>='A' && f<='Z').count();
		System.out.println(count5);
	
	}

}
