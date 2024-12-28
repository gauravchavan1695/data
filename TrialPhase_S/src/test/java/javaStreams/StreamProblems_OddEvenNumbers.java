package javaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProblems_OddEvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,5,6,4,87,90,57,26,28);
		
		List<Integer> evennumbers = list.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println(evennumbers);
		
		List<Integer> oddnumbers = list.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		System.out.println(oddnumbers);
	}

}
