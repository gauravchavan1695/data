package com.PracticeProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.sun.jdi.Method;

public class CharacterCount {

	public static void main(String[] args) {

		// Input string
//		String input = "aaabbccccdeeffffff$$$";
//	
//		Map<Character, Integer> map = new LinkedHashMap<>();
//		for (Character c : input.toCharArray()) {
//			map.put(c, map.getOrDefault(c, 0) + 1);
//		}
//
//		StringBuilder builder = new StringBuilder();
//		for (Map.Entry<Character, Integer> charvalue : map.entrySet()) {
//			builder.append(charvalue.getKey()).append(charvalue.getValue());
//		}
//
//		System.out.println("Output is: " + builder.toString());
		
		
String input = "aaabbccccdeeffffff$$$";
		
		Map<Character,Integer> map = new HashMap<>();
		char[] inputarray = input.toCharArray();
		for(Character c:inputarray) {
			map.put(c, map.getOrDefault(c, 0)+1);			
		}
		StringBuilder builder = new StringBuilder();
		
		for(Map.Entry<Character,Integer> entrylist : map.entrySet()) {
			builder.append(entrylist.getKey()).append(entrylist.getValue());			
		}
		
		System.out.println(builder);
		
        

//============================================================================================================================		

		int[] numarray = { 10, 5, 90, 5, 10, 90, 5, 57, 10, 57, 57, 5, 0 };

		Map<Integer, Integer> nummap = new LinkedHashMap<>();
		for (int numbers : numarray) {
			nummap.put(numbers, nummap.getOrDefault(numbers, 0) + 1);
		}

//		for (Map.Entry<Integer, Integer> finalentry : nummap.entrySet()) {			
//			System.out.println(finalentry.getKey() + " = " + finalentry.getValue());
//		}
		
		System.out.print(nummap);
	}
}
