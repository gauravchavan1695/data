package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProblems_PrintNumbersWithPrefix {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,245,67,79,4,68,-695,80,277,6);
		
		List<Integer> result = list.stream()
				.map(e -> String.valueOf(e))
				.filter(e -> e.startsWith("6") || e.startsWith("-6"))
				.map(e -> Integer.valueOf(e))
		        .collect(Collectors.toList());
		System.out.println(result);
		
		
//Approach 2 --------------------------------------------------------------------------------------------------------------------		

		
		List<Integer> result2 = list.stream()
		.filter(f -> f.toString().charAt(0)=='7')
		.map(f -> Integer.valueOf(f))
		.collect(Collectors.toList());
		
		System.out.println(result2);
		
	}

}
