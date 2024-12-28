package javaStreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamProblems_MaxMinNumber {

	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(1,4,9,5,0,65,34,89,81,97,1,4,66,71,3);
		Integer maxnum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxnum);
		
		
		List<Integer>list2 = Arrays.asList(1,4,9,5,65,34,89,81,97,1,4,66,71,3);
		Integer minnum = list2.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minnum);
	}

}
