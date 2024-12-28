package javaStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamProblems_PrintDuplicateNumbers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,4,77,1,5,4,77,89,77,9,2,87,2);
		
		Set<Integer> duplicates = list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(duplicates);
	}

}
